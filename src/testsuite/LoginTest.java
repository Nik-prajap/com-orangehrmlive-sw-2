package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowserForSetUp(baseUrl);
    }

    @Test
    public void userShouldLoginWithValidCredentials() throws InterruptedException {

        driver.findElement(By.xpath("//input[@name ='username']")).sendKeys("Admin");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

        String expectedText = "Dashboard";
        WebElement actualText = driver.findElement(By.xpath("//h6"));
        String actualTest = actualText.getText();

        Assert.assertEquals(expectedText, actualTest);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
