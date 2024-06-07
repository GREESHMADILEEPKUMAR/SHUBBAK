package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ayaam 

	{
		
			WebDriver driver= new ChromeDriver();
			
			@BeforeMethod
		public void setup()
		{
			driver.get("https://ksa.ayaamperfumes.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		}
			@Test
		public void verifytitl()
		{
			String actualTitle=driver.getTitle();
			String expectedTitle="Ayaam Perfumes";
			Assert.assertEquals(actualTitle,expectedTitle);	
			//String parentWindow = driver.getWindowHandle();	
			WebElement pop=driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-dynamic-zone/div[2]/app-dynamic-server-element/div/app-external-html-container/div/div/a"));
			pop.click();
			
		}
			@AfterMethod
			public void teardown()
			{
				//driver.quit();
			}

	}


