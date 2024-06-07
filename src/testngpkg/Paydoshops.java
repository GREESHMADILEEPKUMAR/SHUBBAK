package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Paydoshops 
{
	ChromeDriver driver= new ChromeDriver();
	@BeforeMethod
			
    public void popup() throws Exception
				{
			
				        driver.get("https://demo.mypaydo.shop/");
				        driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
						driver.navigate().refresh();
				     
				    }
	@Test
	public void shoployalitypointscheck()
	{
		driver.findElement(By.xpath("//*[@id=\"language-button-1\"]/ion-text")).click();
		driver.findElement(By.xpath("//*[@id=\"cart\"]/app-tabs/ion-header/app-transparent-custom-header/div/ion-toolbar/div/div[2]/div[2]/app-country-menu/ion-button/ion-label/p[1]/ion-text[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-alert/div[2]/div[3]/button[2]/span")).click();
	    driver.findElement(By.xpath("//*[@id=\"element-5-1\"]/div/div/ion-button[2]/ion-label")).click();
	    driver.findElement(By.xpath("//*[@id=\"product-53825-cart-button\"]/ion-label")).click();
	    driver.findElement(By.xpath("//*[@id=\"menu-add-to-cart-button\"]/ion-label")).click();
	    driver.navigate().back();
	   driver.findElement(By.xpath("//*[@id=\"cart\"]/app-tabs/ion-header/app-transparent-custom-header/div/ion-toolbar/div/div[2]/div[1]/ion-button/i")).click();
	    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-popover/app-cart-popover/div/ion-button/ion-label")).click();
	driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-dashboard/ion-router-outlet/app-menu/ion-router-outlet/app-tabs/ion-content/ion-tabs/div/ion-router-outlet/app-review-order/ion-content/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[2]/div[2]/ion-card/ion-card-content/ion-button/ion-label")).click();
	driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-login-popover/ion-content/div/app-login-form/div/div[1]/div[2]/app-custom-ion-item/ion-item/ion-input/input")).sendKeys("greeshma@shubbaktech.com");
	driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-login-popover/ion-content/div/app-login-form/div/div[1]/div[2]/div[1]/app-custom-ion-item/ion-item/ion-input/input")).sendKeys("1234567");
	
	WebElement login=driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-login-popover/ion-content/div/app-login-form/div/div[1]/div[2]/div[2]/ion-button/ion-label"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", login);
	
	
	}}
	
	
	
