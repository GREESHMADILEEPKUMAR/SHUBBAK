package testngpkg;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class alshayastaging 
{
	WebDriver driver= new ChromeDriver();
	
	@BeforeMethod(alwaysRun= true)
public void setup() throws InterruptedException
{
	driver.get("https://alshaya.odyapgts.xyz/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));


	
		
		//countrychange-clearcart
		driver.findElement(By.xpath("//*[@id=\"cart\"]/app-tabs/ion-header/app-transparent-custom-header/div/ion-toolbar/div/div[1]/div[2]/div[3]/app-country-menu/ion-button/ion-label")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/div[3]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-alert/div[2]/div[3]/button[2]/span")).click();
		Thread.sleep(3000);
		
		//login icon
		WebElement icon=driver.findElement(By.xpath("//*[@id=\"cart\"]/app-tabs/ion-header/app-transparent-custom-header/div/ion-toolbar/div/div[1]/div[1]/div/app-login-button/ion-button"));
		icon.click();
		 
		 //login popup
		    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-login-popover/ion-content/div/app-login-form/div/div[1]/div[2]/app-custom-ion-item/ion-item/ion-input/input")).sendKeys("greeshmadileepkumar@gmail.com");
		    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-login-popover/ion-content/div/app-login-form/div/div[1]/div[2]/div[1]/app-custom-ion-item/ion-item/ion-input/input")).sendKeys("Catdog26@");
		    //login
		   	    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-login-popover/ion-content/div/app-login-form/div/div[1]/div[2]/div[2]/ion-button/ion-label")).click();
		   	    Thread.sleep(1000);
		   	    //adding items to cart
		   	 JavascriptExecutor js = (JavascriptExecutor) driver;
		   	js.executeScript("window.scrollBy(0,450)", "");
Thread.sleep(3000);
		   	 driver.findElement(By.xpath("//*[@id=\"category-978\"]/a/app-category-card/div/div")).click();
				driver.findElement(By.xpath("//*[@id=\"product-15365-cart-button\"]/ion-label")).click();
				//driver.findElement(By.xpath("//*[@id=\"ion-overlay-2\"]/app-quick-purchase-popover/ion-content/div/div[2]/div[4]/app-add-to-cart-button/div/div/div/div[2]/ion-label")).click();
				Thread.sleep(1000);
			    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-quick-purchase-popover/ion-content/div/div[2]/div[4]/app-add-to-cart-button/div/div/div/div[2]/ion-label")).click();
		    Thread.sleep(1000);
		   	 //direct to cart
		   	    driver.findElement(By.xpath("//*[@id=\"cart\"]/app-tabs/ion-header/app-transparent-custom-header/div/ion-toolbar/div/div[1]/div[1]/div/div/ion-button")).click();
		   	   driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-popover/app-cart-popover/div/ion-button/ion-label")).click();
		   	   //checkout
		   	   Thread.sleep(3000);
		   	   driver.findElement(By.xpath("//*[@id=\"review-order-checkout\"]/ion-label")).click();
		   	   Thread.sleep(6000);
		   	   
		   	   driver.findElement(By.xpath("//*[@id=\"change-delivery-address\"]/ion-label")).click();
		   	   Thread.sleep(3000);
		   	   //driver.findElement(By.xpath("//*[@id=\"ion-overlay-2\"]/app-select-address-popover/ion-content/div/ion-list/ion-radio-group/ion-item-sliding[2]/ion-item/ion-radio//label")).click();
		    //selectaddress
		   	   Thread.sleep(3000);
		   
		   	 driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-select-address-popover/ion-footer/ion-toolbar")).click();  
		   	   Thread.sleep(3000);
		   	//make payment
		   //*[@id="checkout-page-container"]/div[2]/div[1]/ion-button//button
		   	   Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-dashboard/ion-router-outlet/app-menu/ion-router-outlet/app-tabs/ion-content/ion-tabs/div/ion-router-outlet/app-checkout/ion-content/mat-tab-group/div/mat-tab-body[2]/div/div/div[2]/div[1]/ion-button")).click();
			    //selecting madfu
			    driver.findElement(By.xpath("//*[@id=\"checkout-page-container\"]/div[2]/ion-card/ion-card-content/div/app-select-boxes/ion-grid/ion-row/ion-col[12]/div/div/img")).click();
			    //driver.manage().timeouts().wait(2);
	
			    Thread.sleep(4000);
			    //*[@id="checkout-page-container"]/div[2]/ion-card/ion-card-content/div/app-select-boxes/ion-grid/ion-row/ion-col[12]/div/div/img
			    //paymnt again
			    WebElement element = driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-dashboard/ion-router-outlet/app-menu/ion-router-outlet/app-tabs/ion-content/ion-tabs/div/ion-router-outlet/app-payment/ion-content/mat-tab-group/div/mat-tab-body[3]/div/div/div[2]/ion-button"));
			    JavascriptExecutor executor = (JavascriptExecutor)driver;
			    executor.executeScript("arguments[0].click();", element);
			    //String url=driver.getCurrentUrl();
			    
			    Thread.sleep(4000);
			    System.out.println(driver.getCurrentUrl());
			  //String ExpectedURL="https://checkout-staging.madfu.com.sa/Payment?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoiMTY5OTEiLCJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy91cmkiOiJ7XCJTdWNjZXNzXCI6XCJodHRwczovL3d3dy5wYXlkb3N0Zy54eXovZW4vcGF5bWVudC9tYWRmdS9yZXNwb25zZS9zdWNjZXNzLzI0MDEyMTAyNzU1MTFcIixcIkZhaWx1cmVcIjpcImh0dHBzOi8vd3d3LnBheWRvc3RnLnh5ei9lbi9wYXltZW50L21hZGZ1L3Jlc3BvbnNlL2ZhaWwvMjQwMTIxMDI3NTUxMVwiLFwiQ2FuY2VsXCI6XCJodHRwczovL3d3dy5wYXlkb3N0Zy54eXovZW4vcGF5bWVudC9tYWRmdS9yZXNwb25zZS9jYW5jZWwvMjQwMTIxMDI3NTUxMVwifSIsImV4cCI6MTcxNzA2MDU0MywiaXNzIjoiTWFkZm91IiwiYXVkIjoiQ2hlY2tvdXRQYXltZW50In0.HM25WFNyT1v53ecEyOb-VXM6eWXaIJx-TGKBlQjrapI";
			    //driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-dashboard/ion-router-outlet/app-menu/ion-router-outlet/app-tabs/ion-content/ion-tabs/div/ion-router-outlet/app-payment/ion-content/mat-tab-group/div/mat-tab-body[3]/div/div/div[2]/ion-button//button/span")).click();
			    //String redirectURL=driver.getCurrentUrl();
			    //Assert.assertEquals(redirectURL,ExpectedURL);
			    driver.navigate().back();
			    driver.navigate().refresh();
	
			    //madfu2
			    
			   driver.findElement(By.xpath("//*[@id=\"checkout-page-container\"]/div[2]/ion-card/ion-card-content/div/app-select-boxes/ion-grid/ion-row/ion-col[12]/div/div/img")).click();
				   
			   Thread.sleep(4000);
			    WebElement element1 = driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-dashboard/ion-router-outlet/app-menu/ion-router-outlet/app-tabs/ion-content/ion-tabs/div/ion-router-outlet/app-payment/ion-content/mat-tab-group/div/mat-tab-body[3]/div/div/div[2]/ion-button"));
			    JavascriptExecutor executor1 = (JavascriptExecutor)driver;
			    executor1.executeScript("arguments[0].click();", element1);
			    Thread.sleep(4000);
			    System.out.println(driver.getCurrentUrl());
			    driver.navigate().back();
			    driver.navigate().refresh();
	}
	@Test(priority=1)

	public void success() throws Exception
	{
			    //madfu3
			    
				   driver.findElement(By.xpath("//*[@id=\"checkout-page-container\"]/div[2]/ion-card/ion-card-content/div/app-select-boxes/ion-grid/ion-row/ion-col[12]/div/div/img")).click();
					   
				   Thread.sleep(6000);
				  
			    //third attempt
			    WebElement element2 = driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-dashboard/ion-router-outlet/app-menu/ion-router-outlet/app-tabs/ion-content/ion-tabs/div/ion-router-outlet/app-payment/ion-content/mat-tab-group/div/mat-tab-body[3]/div/div/div[2]/ion-button"));
			    JavascriptExecutor executor2 = (JavascriptExecutor)driver;
			    executor2.executeScript("arguments[0].click();", element2);
			    Thread.sleep(4000);
			    System.out.println(driver.getCurrentUrl());
			    //entering madfu credentials
			   
			    driver.findElement(By.xpath("//*[@id=\"UserMobile\"]")).sendKeys("500000004");
			    driver.findElement(By.xpath("//*[@id=\"UserPassword\"]")).sendKeys("Welcome@12345");
			    driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/nb-dialog-container/app-popup-payment-content-form/div/div[2]/div/form/div/div[3]/button")).click();
	    		driver.findElement(By.xpath("//*[@id=\"otp1\"]")).sendKeys("1");
	    		driver.findElement(By.xpath("//*[@id=\"otp2\"]")).sendKeys("0");
	    		driver.findElement(By.xpath("//*[@id=\"otp3\"]")).sendKeys("0");
	    		driver.findElement(By.xpath("//*[@id=\"otp4\"]")).sendKeys("1");
	    		//cancel payment from here
	    		//driver.findElement(By.xpath("//*[@id=\"cdk-overlay-1\"]/nb-dialog-container/app-otp-verification/div/div/div/button")).click();
	    		//continue payment
	    		driver.findElement(By.xpath("//*[@id=\"cdk-overlay-1\"]/nb-dialog-container/app-otp-verification/div/div/div/form/div/div[2]/button")).click();
	            WebElement fullpayment=driver.findElement(By.xpath("//*[@id=\"1\"]"));
	            fullpayment.click();
	            
//	            WebElement monthly=driver.findElement(By.xpath("//*[@id=\"2\"]"));
//	            monthly.click();
//	            WebElement payday=driver.findElement(By.xpath("//*[@id=\"3\"]"));
//	            payday.click();
//	//pay now
	            driver.findElement(By.xpath("//*[@id=\"cdk-overlay-2\"]/nb-dialog-container/app-pay-with-madfu/div/div/div/form/div/div[5]/div[1]/button")).click();
	
	
	//cancel from split payments selecting option
	           // driver.findElement(By.xpath("//*[@id=\"cdk-overlay-2\"]/nb-dialog-container/app-pay-with-madfu/div/div/div/form/div/div[5]/div[2]/button")).click();
	//confirm payment
	            driver.findElement(By.xpath("//*[@id=\"cdk-overlay-3\"]/nb-dialog-container/app-confirm-payment/div[3]/button")).click();
	            //cancel
	           // driver.findElement(By.xpath("//*[@id=\"cdk-overlay-3\"]/nb-dialog-container/app-confirm-payment/div[4]/button")).click();
	
	//visa/mastercard
	            driver.findElement(By.xpath("/html/body/app-root/nb-layout/div/div/div/div/div/nb-layout-column/app-root/nb-layout/div[2]/div[2]/div/nb-dialog-container/app-payment-choose-payment-method/div[1]/div[2]/div[2]/img")).click();
	            Thread.sleep(4000);
	            

	            WebElement element = driver.findElement(By.className("input-filled"));
	            element.sendKeys("41155555");
	            element.sendKeys(Keys.ENTER);
	            List<WebElement> list = driver.findElements(By.className("input"));
	            System.out.println(list.size());
	            
	driver.findElement(By.xpath("//*[@id=\"cardNoInput\"]")).sendKeys("144");
	
	 Thread.sleep(3000); 
	driver.findElement(By.xpath("/html/body/form/section/div/div[1]/span[1]/input")).sendKeys("05/25");
	driver.findElement(By.xpath("/html/body/form/section/div/div[2]/span[1]/input")).sendKeys("123");
	driver.findElement(By.xpath("/html/body/form/section/div/div[3]/span[1]/input")).sendKeys("Test");
	 Thread.sleep(3000); 
	driver.findElement(By.xpath("/html/body/form/section/div/button/span")).click();
	}
	@Test(priority=2)
	public void madacard()
	{
	//mada card
	            driver.findElement(By.xpath("//*[@id=\"cdk-overlay-4\"]/nb-dialog-container/app-payment-choose-payment-method/div[1]/div[2]/div[3]/img")).click();
	
	}
//	@AfterMethod
//	public void close()
//	{ 
//	driver.close();
//	}
	}
	
			    		    		

			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    
			    		//*[@id="checkout-page-container"]/div[2]/ion-button
			    //checking URL
//			    String ExpectedURL="https://checkout-staging.madfu.com.sa/Payment?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoiMTY5MjEiLCJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy91cmkiOiJ7XCJTdWNjZXNzXCI6XCJodHRwczovL3d3dy5wYXlkb3N0Zy54eXovZW4vcGF5bWVudC9tYWRmdS9yZXNwb25zZS9zdWNjZXNzLzI0MDEyMTAyNzU0ODVcIixcIkZhaWx1cmVcIjpcImh0dHBzOi8vd3d3LnBheWRvc3RnLnh5ei9lbi9wYXltZW50L21hZGZ1L3Jlc3BvbnNlL2ZhaWwvMjQwMTIxMDI3NTQ4NVwiLFwiQ2FuY2VsXCI6XCJodHRwczovL3d3dy5wYXlkb3N0Zy54eXovZW4vcGF5bWVudC9tYWRmdS9yZXNwb25zZS9jYW5jZWwvMjQwMTIxMDI3NTQ4NVwifSIsImV4cCI6MTcxNjk3NTE0OSwiaXNzIjoiTWFkZm91IiwiYXVkIjoiQ2hlY2tvdXRQYXltZW50In0.2MsC_xFm3mNVbeyg9CERl2K814-9h32l9_szxh4CCww";
//			    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-dashboard/ion-router-outlet/app-menu/ion-router-outlet/app-tabs/ion-content/ion-tabs/div/ion-router-outlet/app-payment/ion-content/mat-tab-group/div/mat-tab-body[3]/div/div/div[2]/ion-button//button/span")).click();
//			    String redirectURL=driver.getCurrentUrl();
//			    Assert.assertEquals(redirectURL,ExpectedURL);
//			    driver.navigate().back();
//			    

//		driver.findElement(By.xpath("//*[@id=\"category-978\"]/a/app-category-card/div/div")).click();
//	
//		JavascriptExecutor jsi = (JavascriptExecutor) driver;
//		jsi.executeScript("window.scrollBy(0,350)", "");
	//home-product
//		driver.findElement(By.xpath("//*[@id=\"category-978\"]/a/app-category-card/div/div")).click();
//		driver.findElement(By.xpath("//*[@id=\"product-15365-cart-button\"]/ion-label")).click();
//		driver.findElement(By.xpath("//*[@id=\"ion-overlay-2\"]/app-quick-purchase-popover/ion-content/div/div[2]/div[4]/app-add-to-cart-button/div/div/div/div[2]/ion-label")).click();
//		Thread.sleep(1000);
//	    driver.findElement(By.xpath("//*[@id=\"review-order-checkout\"]/ion-label")).click();
//	    
//	  
//       

	   
	    //add address
//	    driver.findElement(By.xpath("//*[@id=\"add-delivery-address\"]/ion-label")).click();
//	    driver.findElement(By.xpath("//*[@id=\"contact-number\"]/input")).sendKeys("58765478");
//	    
//	    WebElement area=driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-add-address-popover/ion-content/div/app-add-address/div/app-dynamic-fields/div/div/app-custom-ion-item/ion-item/app-ionic-selectable-item/ionic-selectable/div/button"));
//	    area.click();
//	    WebElement radiobutton=driver.findElement(By.name("radio-button-off"));
//	    radiobutton.click();
//	    WebElement confirm=driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal[2]/ionic-selectable-modal/ion-footer/ion-toolbar/ion-button"));
//	    confirm.click();
//	    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-add-address-popover/ion-content/div/app-add-address/div/app-dynamic-fields/div/app-custom-ion-item[1]/ion-item/ion-input/input")).sendKeys("Testing");//block
//	    WebElement street=driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-add-address-popover/ion-content/div/app-add-address/div/app-dynamic-fields/div/app-custom-ion-item[2]/ion-item/ion-input/input"));
//	    street.sendKeys("Test");//street
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-add-address-popover/ion-content/div/app-add-address/div/app-dynamic-fields/div/app-custom-ion-item[3]/ion-item/ion-input/input")).sendKeys("evenue");//avenue
//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//	    js.executeScript("window.scrollBy(0,350)", "");
//	    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-add-address-popover/ion-content/div/app-add-address/div/div[1]/div/app-custom-ion-item/ion-item/ion-input/input")).sendKeys("90");//house number
//	    WebElement save=driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-add-address-popover/ion-content/div/app-add-address/div/div[2]/ion-button//button/span"));
//	    save.click();
	    //saved
	    
	    
	    
	    
	    
//	
//	}
//}
