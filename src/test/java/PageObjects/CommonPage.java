package PageObjects;

import Utils.MyDriver;
import Utils.TestURLs;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonPage {
    static WebDriver driver;
    Wait<WebDriver> wait;
    Wait<WebDriver> waitForInvisibility;
    String URL = TestURLs.MainURL;


    public CommonPage() {
        if (driver == null) {
            driver = MyDriver.myDriver();
        }
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(50))
                .ignoring(NoSuchElementException.class);
    }

    public void waitForPageLoad() {
        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(driver -> {
            System.out.println("Current Window State       : "
                    + ((JavascriptExecutor) driver).executeScript("return document.readyState"));
            return String
                    .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                    .equals("complete");
        });
    }

    public WebElement getClickableElement(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement getElement(By locator) {
        return wait.until(driver -> driver.findElement(locator));
    }

    public void sendKeysRedefined(WebElement element, String value, int delay) {
        try {
            Thread.sleep(delay * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        element.sendKeys(value);
    }

    public List<WebElement> getElements( By locator) {
        return wait.until(driver -> driver.findElements(locator));
    }

    public void quit() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public void navigate() {
        driver.navigate().to(URL);
        waitForPageLoad();
    }

    public void waitFor(String arg0) {
        System.out.println(arg0);
        try {
            Thread.sleep(Integer.parseInt(arg0) * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void testImages() {

        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total number of Images on the Page are " + images.size());

        for(int index=0;index<images.size();index++)
        {
            WebElement image= images.get(index);
            String imageURL= image.getAttribute("src");
            System.out.println("URL of Image " + (index+1) + " is: " + imageURL);
            verifyLinks(imageURL);

            //Validate image display using JavaScript executor
            try {
                boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", image);
                if (imageDisplayed) {
                    System.out.println("DISPLAY - OK");
                }else {
                    System.out.println("DISPLAY - BROKEN");
                }
            }
            catch (Exception e) {
                System.out.println("Error Occured");
            }
        }
    }

    public void verifyLinks(String linkUrl)
    {
        try
        {
            java.net.URL url = new java.net.URL(linkUrl);

            //Now we will be creating url connection and getting the response code
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()>=400)
            {
                System.out.println("HTTP STATUS - " + httpURLConnect.getResponseMessage() + "is a broken link");
            }

            //Fetching and Printing the response code obtained
            else{
                System.out.println("HTTP STATUS - " + httpURLConnect.getResponseMessage());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void getScreenShot() {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(scrFile, new File("src/test/screenshots/test.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getCookies(){
        Set<Cookie> cookies = driver.manage().getCookies();

        if (cookies.size() == 0) { // To support FF and IE
            String cookiesString = (String) ((JavascriptExecutor) driver).executeScript("return document.cookie");
            cookies = parseBrowserCookies(cookiesString);
        }
        String my_new_str = cookies.toString().replace(";", ";\n");

        System.out.println(my_new_str);
    }

    private Set<Cookie> parseBrowserCookies( String cookiesString) {
        Set<Cookie> cookies = new HashSet<>();

        if (StringUtils.isBlank(cookiesString)) {
            return cookies;
        }

        Arrays.asList(cookiesString.split("; ")).forEach( cookie -> {
            String[] splitCookie = cookie.split("=", 2);
            cookies.add(new Cookie(splitCookie[0], splitCookie[1], "/"));
        });

        return cookies;
    }

    public void saveToLogFile(String errorMessagesData) {
        File fileToWrite1 = FileUtils.getFile("src/test/logs/" + "log.txt");
        try {
            FileUtils.write(fileToWrite1, errorMessagesData+"\n", StandardCharsets.UTF_8, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Boolean isInvisible(By locator){
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public Boolean isInvisible(WebElement webElement){
        return wait.until(ExpectedConditions.invisibilityOf(webElement));
    }
}
