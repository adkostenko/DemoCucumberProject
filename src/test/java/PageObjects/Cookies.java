package PageObjects;

public class Cookies extends CommonPage{


    public void getSomeCookies(){
        getCookies();
    }
     public void navigateToCNN(String arg0){
         driver.navigate().to(arg0);
         waitForPageLoad();
     }
}
