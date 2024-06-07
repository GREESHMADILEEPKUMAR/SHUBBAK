package testngpkg;




import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Magatier 
{
			
	ChromeDriver driver= new ChromeDriver();
	@BeforeMethod
			
    public void popup() throws Exception
				{
			
				        driver.get("https://magatier.odyapgts.xyz/");
				        driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
						driver.navigate().refresh();
				     
				    }

			
			
			@Test
			public void shop()
			{
				driver.findElement(By.xpath("//*[@id=\"register-modal-first-name\"]/input")).sendKeys("Tester");
				driver.findElement(By.xpath("//*[@id=\"register-modal-last-name\"]/input")).sendKeys("Test");
				driver.findElement(By.xpath("//*[@id=\"contact-number\"]/input")).sendKeys("561662476");
				driver.findElement(By.xpath("//*[@id=\"register-modal-email\"]/input")).sendKeys("greeshma@shubbaktech.com");
				driver.findElement(By.id("newsletter-modal-submit")).click();
				Boolean home=driver.findElement(By.id("element-5-4")).isDisplayed();
				System.out.println("Element displayed is "+ home);
				Boolean shop=driver.findElement(By.id("element-5-4")).isDisplayed();
				System.out.println("menu 2 is "+shop);
				Boolean contact_us=driver.findElement(By.xpath("//*[@id=\"element-5-4\"]/div/div/ion-button[3]/ion-label")).isDisplayed();
				System.out.println("menu 3 is" + contact_us);
				
			WebElement home1=driver.findElement(By.xpath("//*[@id=\"element-5-4\"]/div/div/ion-button[1]/ion-label"));	
			home1.click();			   
			driver.findElement(By.xpath("//*[@id=\"element-5-4\"]/div/div/ion-button[2]/ion-label")).click();
		    driver.findElement(By.xpath("//*[@id=\"element-4-26\"]/ion-grid/ion-row/ion-col[1]/app-external-html-container/div/div/div/a")).click();

			    
			    
				driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-dashboard/ion-router-outlet/app-menu/ion-router-outlet/app-tabs/ion-content/ion-tabs/div/ion-router-outlet/app-dynamic-server[2]/ion-content/div/app-dynamic-server-element/div/ion-grid/ion-row/ion-col[1]/app-external-html-container/div/div/div/a")).click();


				driver.findElement(By.xpath("//*[@id=\"product-view-page-container\"]/div/div/div[2]/div[4]/app-add-to-cart-button/div/div/div/div[2]/div/ion-label")).click();

				
				
				
				driver.findElement(By.xpath("//*[@id=\"element-1-6\"]/app-external-html-container/div/div/div/a[1]")).click();
				driver.navigate().back();
				driver.findElement(By.xpath("//*[@id=\"element-1-6\"]/app-external-html-container/div/div/div/a[2]")).click();
				driver.navigate().back();
				driver.findElement(By.xpath("//*[@id=\"element-1-6\"]/app-external-html-container/div/div/a")).click();
				driver.navigate().back();
				driver.findElement(By.xpath("//*[@id=\"product-view-page-container\"]/div/div/div[2]/div[4]/app-add-to-cart-button/div/div/div/div[1]/ion-label")).click();
				driver.findElement(By.xpath("//*[@id=\"review-order-checkout\"]/ion-label")).click();
				driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-login-popover/ion-content/div/app-login-form/div/div[2]/div[2]/div[1]/ion-button/ion-label")).click();
				driver.findElement(By.xpath("//*[@id=\"register-modal-first-name\"]/input")).sendKeys("Greeshma");
				driver.findElement(By.xpath("//*[@id=\"register-modal-last-name\"]/input")).sendKeys("Dileep");
				driver.findElement(By.xpath("//*[@id=\"contact-number\"]/input")).sendKeys("561662476");
				driver.findElement(By.xpath("//*[@id=\"register-modal-email\"]/input")).sendKeys("greeshma@shubbaktech.com");
				WebElement scroll = driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-guest-signup-popover/ion-content/div/div[2]/div[3]/app-custom-ion-item[1]/ion-item/ion-input/input"));
				scroll.sendKeys(Keys.PAGE_DOWN);
				
				driver.findElement(By.xpath("//*[@id=\"register-modal-password\"]/input")).sendKeys("1234567");
				driver.findElement(By.xpath("//*[@id=\"register-modal-password-confirm\"]/input")).sendKeys("1234567");
				driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-guest-signup-popover/ion-content/div/div[2]/div[4]/app-checkout-delivery-mode/div/app-add-address/div/app-dynamic-fields/div/div/app-custom-ion-item/ion-item/app-ionic-selectable-item/ionic-selectable/div/button")).click();
				WebElement rbutton = driver.findElement(By.name("radio-button-off"));
				rbutton.click();
				driver.findElement(By.linkText("CONFIRM")).click();
				
				
				
				
				
				
				
				
				
				driver.findElement(By.id("ion-input-9")).sendKeys("test");
				
				
				driver.findElement(By.xpath("//*[@id=\"ion-overlay-3\"]/app-guest-signup-popover/ion-content/div/div[2]/div[4]/app-checkout-delivery-mode/div/app-add-address/div/app-dynamic-fields/div/app-custom-ion-item[2]/ion-item/ion-input/input")).sendKeys("Testing1");
				driver.findElement(By.xpath("//*[@id=\"ion-overlay-3\"]/app-guest-signup-popover/ion-content/div/div[2]/div[4]/app-checkout-delivery-mode/div/app-add-address/div/app-dynamic-fields/div/app-custom-ion-item[3]/ion-item/ion-input/input")).sendKeys("TESTSITE");
				driver.findElement(By.xpath("//*[@id=\"ion-overlay-3\"]/app-guest-signup-popover/ion-content/div/div[2]/div[4]/app-checkout-delivery-mode/div/app-add-address/div/app-dynamic-fields/div/app-custom-ion-item[4]/ion-item/ion-input/input")).sendKeys("561662476");
				driver.findElement(By.xpath("//*[@id=\"ion-overlay-3\"]/app-guest-signup-popover/ion-content/div/div[2]/div[4]/app-checkout-delivery-mode/div/app-add-address/div/div[1]/div/app-custom-ion-item/ion-item/ion-input/input")).sendKeys("abc");	
				driver.findElement(By.xpath("//*[@id=\"register-modal-submit\"]")).click();
				driver.quit();
				
				
				
			
				driver.findElement(By.xpath("//*[@id=\"home-page-container\"]/app-products-list/div/div[2]/perfect-scrollbar/div/div[1]/ion-list/div[5]/ion-item/ion-label")).click();
			driver.findElement(By.xpath("//*[@id=\"home-page-container\"]/app-products-list/div/div[2]/perfect-scrollbar/div/div[1]/ion-list/div[6]/ion-item/ion-label")).click();
			driver.findElement(By.xpath("//*[@id=\"home-page-container\"]/app-products-list/div/div[2]/perfect-scrollbar/div/div[1]/ion-list/div[7]/ion-item/ion-label")).click();
			driver.findElement(By.xpath("//*[@id=\"element-5-4\"]/div/div/ion-button[3]/ion-label")).click();
				//driver.findElement(By.xpath("//*[@id=\"element-5-4\"]/div/div/ion-button[3]/ion-label")).click();
			    driver.findElement(By.xpath("//*[@id=\"support-page-container\"]/div/div[1]/app-custom-ion-item[1]/ion-item/ion-input/input")).sendKeys("Tester");
			    driver.findElement(By.xpath("//*[@id=\"support-page-container\"]/div/div[1]/app-custom-ion-item[2]/ion-item/ion-input/input")).sendKeys("Dileep");
			    driver.findElement(By.xpath("//*[@id=\"support-page-container\"]/div/div[2]/app-custom-ion-item[1]/ion-item/ion-input/input")).sendKeys("greeshma@shubbaktech.com");
			    driver.findElement(By.xpath("//*[@id=\"support-page-container\"]/div/div[2]/app-custom-ion-item[2]/ion-item/ion-input/input")).sendKeys("561662476");
			    driver.findElement(By.xpath("//*[@id=\"support-page-container\"]/div/div[3]/app-custom-ion-item/ion-item/ion-input/input")).sendKeys("testing");
			    driver.findElement(By.xpath("//*[@id=\"support-page-container\"]/div/app-custom-ion-item/ion-item/ion-textarea/div/textarea")).sendKeys("Testing contact us");
			WebElement msg=driver.findElement(By.xpath("//*[@id=\"support-page-container\"]/div/ion-button"));
			msg.click();

			
			WebElement ver=driver.findElement(By.id("submitted succesfully"));
			Assert.assertTrue(ver.isDisplayed(),"submitted succesfully");
			Actions lang= new Actions(driver);
			lang.moveToElement(driver.findElement(By.xpath("//*[@id=\"cart\"]/app-tabs/ion-header/app-transparent-custom-header/div/ion-toolbar/div/div[3]/app-country-menu/ion-button/ion-label")));
			lang.click();
			lang.build().perform();
		
		   WebElement link = driver.findElement(By.linkText("Confirm"));
				link.click();
				driver.switchTo().alert().accept();

			
		
			}
			}

