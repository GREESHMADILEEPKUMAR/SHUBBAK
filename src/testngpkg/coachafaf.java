package testngpkg;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class coachafaf 
{
	

				ChromeDriver driver= new ChromeDriver();
				
				@BeforeMethod
			public void setup() throws Exception
			{
				driver.get("https://coachafaf.shubbaktech.ae");
				String e=driver.getCurrentUrl();
				System.out.println(e);
				driver.navigate().refresh();
				
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
				
			}
				@Test
				public void courses()
				{
					
					driver.findElement(By.xpath("//*[@id=\"cart\"]/app-tabs/ion-header/app-transparent-custom-header/div/ion-toolbar/div/div/div[3]/div/ion-button/button")).click();
					driver.findElement(By.id("language-button-english")).click();
					
					driver.findElement(By.xpath("//*[@id=\"element-5-1\"]/div/div/ion-button[2]/ion-label")).click();//courses
                    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/button[1]")).click();//recorded courses
				    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-dashboard/ion-router-outlet/app-menu/ion-router-outlet/app-tabs/ion-content/ion-tabs/div/ion-router-outlet/app-product-type/ion-content/div/app-products-list/div/div[2]/div/div[3]/div[1]/app-product-card/div/div[2]/div[2]/app-nc-add-to-cart-button/div/div/p/span")).click();//add to cart
				    WebElement cart=driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-dashboard/ion-router-outlet/app-menu/ion-router-outlet/app-tabs/ion-header/app-transparent-custom-header/div/ion-toolbar/div/div/div[3]/div/div/ion-menu-toggle/div/div/mat-icon"));// cart click view
				    cart.click();				   
				    driver.findElement(By.xpath("//*[@id=\"review-order-checkout\"]/ion-label")).click();
				    //login
				    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-login-popover/ion-content/div/app-login-form/div/div[3]/mat-form-field/div/div[1]/div[4]/input")).sendKeys("greeshmadileepkumar@gmail.com");
				    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-login-popover/ion-content/div/app-login-form/div/div[3]/div[1]/mat-form-field/div/div[1]/div[4]/input")).sendKeys("123");
				    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-login-popover/ion-content/div/app-login-form/div/div[3]/div[2]/ion-button/ion-label")).click();
				    
				    //gift
				    WebElement gift=driver.findElement(By.xpath("//*[@id=\"mat-slide-toggle-1\"]/label/span[1]"));
				    gift.click();
				    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-gift-fields-modal/ion-content/div/app-dynamic-fields/div/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Parvathy");
				    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-gift-fields-modal/ion-content/div/app-dynamic-fields/div/div[2]/app-flag-contact-input/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys("567834567");				    
				    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-gift-fields-modal/ion-content/div/app-dynamic-fields/div/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("greeshmadileepkumar@gmail.com");
				    
				    driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-gift-fields-modal/ion-content/div/app-dynamic-fields/div/mat-form-field/div/div[1]/div[3]/textarea")).sendKeys("Do you like my gift");
				    WebElement ele=driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/app-gift-fields-modal/ion-content/div/ion-button"));
				    JavascriptExecutor executor = (JavascriptExecutor)driver;
				    executor.executeScript("arguments[0].click();", ele);
				   
				    
//				   driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-dashboard/ion-router-outlet/app-menu/ion-router-outlet/app-tabs/ion-content/ion-tabs/div/ion-router-outlet/app-checkout/ion-content/div/div/div/div[1]/ion-button/ion-label")).click();
//				   driver.findElement(By.xpath("//*[@id=\"ion-overlay-5\"]/app-coupons/div/div/div/div/div[2]/button")).click();
//				    //place order
				    
				    WebElement element = driver.findElement(By.xpath("//*[@id=\"checkout-page-container\"]/div/div/div[5]/div/ion-button"));
				    element.click();
				}
				   @Test
				   public void ui() 
				   {
					    
					   
					   
				   }
				   
				    
				   
				   
				
				public void close()
				{
					driver.close();
				}
				
				
				
				
}
