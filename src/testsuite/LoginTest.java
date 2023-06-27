package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest{

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @After
    public void closeDown(){
     closeBrowser();
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){

        // enter username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

        // enter password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");

        //click on Login
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

        // verify text Dashboard
        String expectedText="Dashboard";
        String actualText= driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        Assert.assertEquals(expectedText,actualText);
    }
}
