package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class Login extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void usershouldnavigatetologinpagesucceessfully() {
        //Click on 'login' link
        driver.findElement(By.className("ico-login")).click();
        //Verify the text '‘Welcome, Please Sign In!’
        String actualResult = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        String expectedResult = "Welcome, Please Sign In!";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //  click on the ‘Login’ link
        driver.findElement(By.className("ico-login")).click();
        //  * Enter valid username
        driver.findElement(By.id("Email")).sendKeys("shikha8883@gmail.com");
        //* Enter valid password
        driver.findElement(By.id("Password")).sendKeys("1234599");
        //   * Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        // * Verify the ‘Log out’ text is display
        driver.findElement(By.className("ico-logout")).getText();
        String actualResult= driver.findElement(By.className("ico-logout")).getText();
        String expectedResult="Log out";
        Assert.assertEquals(actualResult,expectedResult);}

    @Test
    public void verifyTheErrorMessage(){
        //click on the ‘Login’ link
        driver.findElement(By.className("ico-login")).click();
        //Enter invalid username
        driver.findElement(By.id("Email")).sendKeys("shi88@gmail.com");
        //Enter invalid password
        driver.findElement(By.id("Password")).sendKeys("45vbf");
        //Click on Login button
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        //Verify the error message
        String actualErrorMessage= driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        System.out.println(actualErrorMessage);
        String expectedErrorMessage="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);

    }


    @After
    public void endTest() {
        // closeBrowser();

    }


}


