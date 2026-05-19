package WebDriver_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) throws InterruptedException {
		//set browser
		// steps-1. paste url in the default browser
		//       2. verify after click on selenium logo this will redirect to home page
		// setup browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\OneDrive\\Documents\\Wipro_April26_SDET\\setup_files\\chromedriver-win64\\chromedriver.exe");
	    //create webdriver object
		WebDriver driver=new ChromeDriver();
		// navigate to url(Webpage url)
	    driver.get("https://www.selenium.dev/downloads/");
	    Thread.sleep(3000);
	    // find element
	    driver.findElement(By.id("Layer_1")).click();
	    Thread.sleep(3000);
	    driver.close();
	}

}
