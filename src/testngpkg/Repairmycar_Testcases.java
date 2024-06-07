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

public class Repairmycar_Testcases 


{
	ChromeDriver driver = new ChromeDriver();
	@BeforeTest
    public void setUp() {
        // Set up WebDriver (assuming you're using Chrome)
        
      driver.get("https://mycarsrepair.com/");
        // Maximize browser window
        driver.manage().window().maximize();
        // Navigate to the webpage containing search functionality
        
    }

	@Test
    public void testSearchFunctionality() throws Exception {
        // Find the first select box
		Thread.sleep(3000);
		WebElement view=driver.findElement(By.xpath("/html/body/section[5]/div[2]/div[2]/a"));
		Actions actions = new Actions(driver);

		actions.moveToElement(view).click().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section[2]/div/section/div/div[1]/div/a/div/h4")).click();
		
//		 Thread.sleep(4000);
//        WebElement firstSelectBox = driver.findElement(By.id("selCatFilter"));
//        Select firstSelect = new Select(firstSelectBox);
//        Thread.sleep(4000);
//        // Find the second select box
//        WebElement secondSelectBox = driver.findElement(By.id("selGarFilter"));
//        Select secondSelect = new Select(secondSelectBox);
//        Thread.sleep(4000);
//        // Loop through each option in the first select box
//        for (WebElement firstOption : firstSelect.getOptions()) {
//            // Select the option in the first select box
//            firstOption.click();
//            Thread.sleep(4000);
//            // Loop through each option in the second select box
//            for (WebElement secondOption : secondSelect.getOptions()) {
//            	 Thread.sleep(4000);
//                // Select the option in the second select box
//                secondOption.click();
//
//                // Click the search button
//                WebElement searchButton = driver.findElement(By.xpath("/html/body/section[3]/div/div[2]/form/button"));
//                searchButton.click();
//
//                // Wait for search results to load
//                Thread.sleep(3000);
//                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//                //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("garage")));
//                
//                WebElement searchResults = driver.findElement(By.linkText("garage"));
//                assert searchResults.isDisplayed() : "Search results not displayed";
//
//
//                // Navigate back to the parent page
//                driver.navigate().back();
//                Thread.sleep(4000);
//                
//            }
//        }
        }


    @AfterTest
    public void tearDown() 
    {
        // Close the browser after test execution
        driver.quit();
    }
}

//@Test(priority = 3,description: selectboxsearch)
//public void testSearchFunctionality() {
//    // Find the first select box
//    WebElement firstSelectBox = driver.findElement(By.id("first_select_box_id"));
//    Select firstSelect = new Select(firstSelectBox);
//
//    // Find the second select box
//    WebElement secondSelectBox = driver.findElement(By.id("second_select_box_id"));
//    Select secondSelect = new Select(secondSelectBox);
//
//    // Loop through each option in the first select box
//    for (WebElement firstOption : firstSelect.getOptions()) {
//        // Select the option in the first select box
//        firstOption.click();
//
//        // Loop through each option in the second select box
//        for (WebElement secondOption : secondSelect.getOptions()) {
//            // Select the option in the second select box
//            secondOption.click();
//
//            // Click the search button
//            WebElement searchButton = driver.findElement(By.id("search_button_id"));
//            searchButton.click();
//
//            // Wait for search results to load
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_results_id")));
//
//            // Navigate back to the parent page
//            driver.navigate().back();
//        }
//    }
//}
    


