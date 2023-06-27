package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @After
    public void closeDown(){
        closeBrowser();
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        // click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();

        //Verify the text ‘Reset Password’

        String expectedText= "Reset Password";
        String actualText= driver.findElement(By.xpath("//h6[text()='Reset Password']")).getText();
        Assert.assertEquals(expectedText,actualText);
    }
}
