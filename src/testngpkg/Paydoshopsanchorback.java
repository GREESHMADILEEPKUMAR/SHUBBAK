package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Paydoshopsanchorback 
{

	ChromeDriver driver = new ChromeDriver();
	@BeforeMethod(alwaysRun= true)
	public void setup() throws InterruptedException
	{
		driver.get("https://alshaya.odyapgts.xyz/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
}
	@Test(priority = 1)
    public void testBackToTopButtonPresence() {
        // Verify presence of back to top button
        WebElement backToTopButton = driver.findElement(By.xpath("//*[@id=\"cart\"]/app-tabs/ion-content/ion-tabs/div/ion-router-outlet/app-home/app-scroll-to-top/button/span[1]/mat-icon"));
        Assert.assertTrue(backToTopButton.isDisplayed(), "Back to top button is not displayed.");
    }

    @Test(priority = 2)
    public void testBackToTopButtonFunctionality() throws Exception 
    {
        // Scroll down to make the back to top button visible
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Click back to top button
        WebElement backToTopButton = driver.findElement(By.xpath("//*[@id=\"cart\"]/app-tabs/ion-content/ion-tabs/div/ion-router-outlet/app-home/app-scroll-to-top/button/span[1]/mat-icon"));
        backToTopButton.click();
        Thread.sleep(3000);
        // Wait for the page to scroll to top (you may need to implement a wait here)

        // Check if scrolled to top
        long scrollTop = (Long) js.executeScript("return document.documentElement.scrollTop || document.body.scrollTop;");
        Assert.assertEquals(scrollTop, 0, "Page is not scrolled to top after clicking back to top button.");
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
