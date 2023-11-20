package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Write down the following test into ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfully
 * 2. click on the ‘Forgot your password’ link
 * 3. Verify the text ‘Reset Password’
 */
public class ForgetPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowserForSetUp(baseUrl);
    }

    @Test
    public void useShouldNavigateToForgotPasswordPageSuccessfully() throws InterruptedException {

        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        Thread.sleep(2000);

        String expectedText = "Reset Password";
        WebElement actualText = driver.findElement(By.xpath("//h6"));
        String actualTest = actualText.getText();
        Assert.assertEquals(expectedText,actualTest);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
