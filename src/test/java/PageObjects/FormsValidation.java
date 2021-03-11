package PageObjects;

import org.openqa.selenium.By;
import org.testng.Assert;

public class FormsValidation extends CommonPage{
    Navigation navigation = new Navigation();

    public void navigateToValidationPage() {
        navigate();
        navigation.pressOnValidationItem();
    }


    public void fillOutNameField( String arg0 ) {
        By locator = By.name( "name" );
        getClickableElement( locator ).sendKeys( arg0 );
        getClickableElement( locator ).clear();
    }

    public void fillOutUsernameField( String arg0 ) {
        By locator = By.name( "username" );
        getClickableElement( locator ).sendKeys( arg0 );
    }

    public void fillOutEmailField( String arg0 ) {
        By locator = By.name( "email" );
        getClickableElement( locator ).sendKeys( arg0 );
    }

    public void readNotificationMessage( String arg0, String arg1, String arg2 ) {
        By locator1 = By.cssSelector( "p[ng-show='userForm.name.$invalid && !userForm.name.$pristine']" );
        By locator2 = By.cssSelector( "p[ng-show='userForm.username.$error.minlength']" );
        By locator3 = By.cssSelector( "p[ng-show='userForm.email.$invalid && !userForm.email.$pristine']" );

        if(!arg0.equals("") ){            //! before something means "not". in this case it`s not equals
          Assert.assertEquals( getClickableElement( locator1 ).getText(), arg0);
          Assert.assertEquals( getClickableElement( locator2 ).getText(), arg1);
          Assert.assertEquals( getClickableElement( locator3 ).getText(), arg2);
    }
}

    public void pressOnSubmitButton() {
        By locator = By.cssSelector( "button[class='btn btn-primary']" );
        getClickableElement( locator ).click();
    }
}


