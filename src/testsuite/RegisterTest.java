package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

 public class RegisterTest extends BaseTest {
    String baseurl="https://demo.nopcommerce.com/";
    @Before
    public void openBrowser(){
        openBrowser(baseurl);
    }
    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully(){
        //click on the ‘Register’ link
        driver.findElement(By.xpath("//div[@class='header']/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
        String actualResult = driver.findElement(By.xpath("//div[@class='header']/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
        String expectedResult = "Register";
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        // click on the ‘Register’ link
        driver.findElement(By.xpath("//div[@class='header']/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
        //'gender-female
        driver.findElement(By.id("gender-female")).click();
        //Enter First name
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("shikha");
        //Enter Last name
        driver.findElement(By.id("LastName")).sendKeys("Kapur");
        //Select Day Month and Year
        driver.findElement(By.xpath("//div[@class='page registration-page']/div[2]/form/div[1]/div[2]/div[5]/input")).sendKeys("shikha8883@gmail.com");
        //Enter Password
        driver.findElement(By.id("Password")).sendKeys("1234599");
        //Enter Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("1234599");
        //Click on REGISTER button
        driver.findElement(By.id("register-button")).click();

    }



    @After
    public void endTest() {
        // closeBrowser();

    }}

