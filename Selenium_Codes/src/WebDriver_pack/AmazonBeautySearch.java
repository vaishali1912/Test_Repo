package WebDriver_pack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class AmazonBeautySearch {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        try {
           driver.get("https://www.amazon.in/");
          
            WebElement searchBox = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox"))
            );
            searchBox.sendKeys("beauty products");
     
            driver.findElement(By.id("nav-search-submit-button")).click();
          
            wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("div.s-main-slot"))
            );
          
            List<WebElement> products = driver.findElements(
                    By.xpath("//div[@data-component-type='s-search-result']//h2//span")
            );
            System.out.println("Total products found: " + products.size());
            System.out.println("----- Product Titles -----");
          
            int count = 1;
            for (WebElement product : products) {
                String title = product.getText().trim();

                if (!title.isEmpty()) {
                    System.out.println(count + ". " + title);
                    count++;
                }
            }

        } catch (Exception e) {
            System.out.println("Error occurred:");
            e.printStackTrace();

        } finally {
           driver.quit();
        }
    }
}