package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {String baseUrl = "https://demo.nopcommerce.com/";


    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[1]/a")).click();
        //Verify the text ‘Computers’
        String actualResult = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[1]/a")).getText();
        System.out.println(actualResult);
        String expectedResult = "Computers";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //click on the ‘Electronics’ Tab

        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[2]/a")).click();
        String actualResult = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[2]/a")).getText();
        //Verify the text ‘Electronics
        System.out.println(actualResult);
        String expectedResult = "Electronics";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfull() {
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[3]/a")).click();
        String actualResult = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[3]/a")).getText();
        System.out.println(actualResult);
        String expectedResult = "Apparel";
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull() {
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[4]/a")).click();
        String actualResult = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[4]/a")).getText();
        System.out.println(actualResult);
        String expectedResult = "Digital downloads";
        Assert.assertEquals(actualResult, expectedResult);


    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[5]/a")).click();
        String actualResult = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[5]/a")).getText();
        System.out.println(actualResult);
        String expectedResult = "Books";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[6]/a")).click();
        String actualResult = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[6]/a")).getText();
        System.out.println(actualResult);
        String expectedResult = "Jewelry";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull() {
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[7]/a")).click();
        String actualResult = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[7]/a")).getText();
        System.out.println(actualResult);
        String expectedResult = "Gift Cards";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @After
    public void endTest() {
        // closeBrowser();
    }
}

