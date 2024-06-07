package testngpkg;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class macros
{

			ChromeDriver driver= new ChromeDriver();
			
		@BeforeTest
		public void setup() throws Exception
		{
			String url="https://mycarsrepair.com/";
			driver.get(url);
			
			driver.manage().window().maximize();
			 System.out.println("Launching Google Chrome browser");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
			
	        String originalTitle = driver.getTitle();
	        System.out.println(originalTitle);
	       
	        
		}
			@Test(priority=1,description="Verify all links at the homepage")
		public void linkverification() throws Exception
		{

			WebElement aboutus=driver.findElement(By.xpath("//*[@id=\"main_nav\"]/ul[1]/li[2]/a"));
			aboutus.click();
			//System.out.println(aboutus.isDisplayed());
			Thread.sleep(3000);
				
			WebElement ourservice=driver.findElement(By.xpath("/html/body/header/nav/div/div/ul[1]/li[3]/a"));
			ourservice.click();
			Thread.sleep(3000);
			
			WebElement contactus=driver.findElement(By.xpath("//*[@id=\"main_nav\"]/ul[1]/li[4]/a"));
			contactus.click();
			Thread.sleep(3000);
			WebElement reqquote= driver.findElement(By.xpath("//*[@id=\"main_nav\"]/ul[2]/li/a"));
			reqquote.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"main_nav\"]/ul[1]/li[1]/a")).click();
			Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"main_nav\"]/ul[1]/li[1]/a")).click();
					driver.findElement(By.xpath("/html/body/section[1]/div/div/a")).click();//register
					driver.navigate().back();
					Thread.sleep(3000);
					driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[1]/div/a/div")).click();//body repair
					driver.navigate().back();
					Thread.sleep(3000);
					driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[2]/div/a/div")).click();//car battery
					driver.navigate().back();
					Thread.sleep(3000);
					driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[3]/div/a/div")).click();//mechanical
					driver.navigate().back();
					Thread.sleep(3000);
					driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[4]/div/a/div")).click();//carbattery
					Thread.sleep(3000);
					driver.navigate().back();
		}
					//view all
					@Test(priority=0)
					public void viewall() throws Exception
					{
					Thread.sleep(5000);
					WebElement view=driver.findElement(By.xpath("/html/body/section[5]/div[2]/div[2]/a"));
					Actions actions = new Actions(driver);

					actions.moveToElement(view).click().perform();
							Thread.sleep(3000);
					
					//viewoneby one
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[1]/div/a/div/h4")).click();
					driver.navigate().back();
					Thread.sleep(30000);
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[2]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[3]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[4]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[5]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[6]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[7]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[8]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[9]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[10]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[11]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[12]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[13]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[14]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[15]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[16]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[17]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[18]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[19]/div/a/div/h4")).click();
					driver.navigate().back();
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[20]/div/a/div/h4")).click();
					driver.navigate().back();
					//2ndpage
					driver.findElement(By.xpath("/html/body/section[2]/div/section/nav/span/nav/ul/li[3]/a")).click();
					//locating elements
					driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[1]/div/a/div/h4")).click();
		            driver.navigate().back();
		            driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[2]/div/a/div/h4")).click();
		            driver.navigate().back();
		            driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[3]/div/a/div/h4")).click();
		            driver.navigate().back();
		            driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[4]/div/a/div/h4")).click();
		            driver.navigate().back();
		            driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[5]/div/a/div/h4")).click();
		            driver.navigate().back();
		            driver.findElement(By.xpath("/html/body/section[2]/div/div/div/form/input")).sendKeys("porshe");
		            driver.navigate().back();		
		}
		    @Test(priority = 3)
		    public void verifyNavigationToServicesPage() {
		        // Click on Services link
		        WebElement servicesLink = driver.findElement(By.linkText("Services"));
		        servicesLink.click();

		        // Verify navigation to Services page
		        Assert.assertEquals(driver.getCurrentUrl(), "https://mycarsrepair.com/car_service/services");
		    }

		
			@Test(priority=2,description="Login functionality of customers")
			public void custlogin()
			{
			
				driver.findElement(By.xpath("//*[@id=\"main_nav\"]/div[1]/div/a[2]")).click();
				driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/a")).click();
			    driver.findElement(By.id("inputEmail")).sendKeys("tester@shubbak.com");
			    driver.findElement(By.id("inputPassword")).sendKeys("12345678");
			    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
			    //quot1
			    driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[2]/div[1]/div[2]/div[2]/a")).click();
			driver.navigate().back();
			//quote2
			driver.findElement(By.xpath("//*[@id=\"dashboardSidebarRightContent\"]/section/div/div[2]/div[2]/div[2]/div[2]/a")).click();
			//invoice
			
			driver.navigate().back();
			driver.findElement(By.xpath("/html/body/div/div[2]/nav/div[3]/button")).click();
			driver.navigate().back();
			}

			@AfterTest
			public void teardown() 
			{
				 driver.close();
				 
				 
				System.out.println("Finished Test On Chrome Browser");
			}
			

	

}
