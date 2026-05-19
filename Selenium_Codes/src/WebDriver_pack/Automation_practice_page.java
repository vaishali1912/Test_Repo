package WebDriver_pack;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Automation_practice_page {

	    public static void main(String[] args) {


	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        driver.get("https://testautomationpractice.blogspot.com/");

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // ================= FORM =================
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Vaishali");
	        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
	        driver.findElement(By.id("phone")).sendKeys("9876543210");
	        driver.findElement(By.id("textarea")).sendKeys("Pune");

	        driver.findElement(By.id("female")).click();
	        driver.findElement(By.id("monday")).click();

	        Select country = new Select(driver.findElement(By.id("country")));
	        country.selectByVisibleText("India");

	        // ================= DATE =================
	        driver.findElement(By.id("datepicker")).sendKeys("05/19/2026");

	        // ================= ALERT =================
	        js.executeScript("window.scrollBy(0,1000)");

	        WebElement alertBtn = wait.until(
	                ExpectedConditions.elementToBeClickable(By.id("alertBtn"))
	        );

	        alertBtn.click();

	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        System.out.println("Alert text: " + alert.getText());
	        alert.accept();

	        // ================= NEW TAB =================
	        String parent = driver.getWindowHandle();

	        driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();

	        wait.until(driver1 -> driver1.getWindowHandles().size() > 1);

	        Set<String> windows = driver.getWindowHandles();

	        for (String win : windows) {
	            if (!win.equals(parent)) {
	                driver.switchTo().window(win);
	                System.out.println("New Tab Title: " + driver.getTitle());
	                driver.close();
	            }
	        }

	        driver.switchTo().window(parent);

	        // ================= DOUBLE CLICK =================
	        js.executeScript("window.scrollBy(0,500)");

	        WebElement field1 = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.id("field1"))
	        );

	        field1.clear();
	        field1.sendKeys("Hello Selenium");

	        WebElement copyBtn = driver.findElement(By.xpath("//button[text()='Copy Text']"));

	        Actions act = new Actions(driver);
	        act.doubleClick(copyBtn).perform();

	        String copiedText = driver.findElement(By.id("field2")).getAttribute("value");
	        System.out.println("Copied Text: " + copiedText);

	        // ================= DRAG & DROP =================
	        WebElement source = driver.findElement(By.id("draggable"));
	        WebElement target = driver.findElement(By.id("droppable"));

	        act.dragAndDrop(source, target).perform();

	        // ================= SLIDER =================
	        WebElement slider = driver.findElement(By.xpath("(//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"])[1]"));
	        act.dragAndDropBy(slider, 50, 0).perform();

	        // ================= TABLE =================
	        List<WebElement> rows = driver.findElements(
	                By.xpath("//table[@name='BookTable']/tbody/tr")
	        );

	        System.out.println("Total rows: " + rows.size());

	        for (WebElement row : rows) {
	            System.out.println(row.getText());
	        }

	        // ================= END =================
	        driver.quit();
	    }
	}