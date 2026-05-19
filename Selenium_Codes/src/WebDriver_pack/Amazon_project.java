package WebDriver_pack;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Amazon_project {
	
public static void main(String[] args) throws InterruptedException {
	

	WebDriver d;
 d = new ChromeDriver();
			// d.get("https://www.amazon.com/?ref_=navm_em_header_home");
			d.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			d.manage().window().maximize();
			Thread.sleep(5000);
		

		// 1.login(add to cart,delete from cart) and (change login name)
		
	
		//	d.findElement(By.cssSelector("button[type=\"submit\"]")).click();// when home page is not opened(shows(continue
																				// shopping))
			d.findElement(By.id("nav-link-accountList-nav-line-1")).click();
			d.findElement(By.id("ap_email_login")).sendKeys("xyz");
			d.findElement(By.id("continue")).click();
			Thread.sleep(2000);
			System.out.println("Email taken");
			d.findElement(By.id("ap_password")).sendKeys("xyz");
			System.out.println("password taken");

			d.findElement(By.id("signInSubmit")).click();
			System.out.println("Login successful");
			Thread.sleep(3000);
			// cart and delete
			d.findElement(By.id("nav-cart")).click();
			d.findElement(By.cssSelector("input[data-feature-id=\"item-delete-button\"]")).click();

			// change login name
			Actions a = new Actions(d);
			WebElement change = d.findElement(By.id("nav-link-accountList-nav-line-1"));
			a.moveToElement(change).perform();
			Thread.sleep(3000);
			d.findElement(By.cssSelector("button[data-testid=\"manage-profiles-button\"]")).click();
			Thread.sleep(3000);
			d.findElement(By.xpath("//*[@id=\"a-popover-content-2\"]/div/div/div/ul/li[2]/div/div/div[2]/div[1]")).click();
		

		// 2.Multiple searches using array list or array
		
	
			d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
			List<String> l = new ArrayList<>();
			l.add("Watch");
			l.add("Shoes");
			l.add("Books");
			for (String s : l) {
				WebElement search = d.findElement(By.id("twotabsearchtextbox"));
				search.clear();
				search.sendKeys(s);
				search.sendKeys(Keys.ENTER);
		
		// 3.Add to cart(delete cart also)
	
			d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
			WebElement search1 = d.findElement(By.cssSelector("input[placeholder=\"Search Amazon\"]"));
			search1.clear();
			search1.sendKeys("Mobiles");
			search1.sendKeys(Keys.ENTER);
			d.findElement(By.partialLinkText("Motorola")).click();
			// Thread.sleep(2000);
			d.findElement(By.id("add-to-cart-button")).click();
			Thread.sleep(2000);
			d.findElement(By.id("nav-cart")).click();
			// d.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
			d.findElement(By.cssSelector("input[data-feature-id=\"item-delete-button\"]")).click();
		}

		// 4.delete cart
		
	
			d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
			Thread.sleep(2000);
			d.findElement(By.cssSelector("span[class=\"nav-cart-icon nav-sprite\"]")).click();
			Thread.sleep(3000);
			d.findElement(By.cssSelector("input[data-feature-id=\"item-delete-button\"]")).click();


		// 5.Change Login name

			d.findElement(By.cssSelector("button[type=\"submit\"]")).click();// when home page is not opened(shows(continue
																				// shopping))
			d.findElement(By.id("nav-link-accountList-nav-line-1")).click();
			d.findElement(By.id("ap_email_login")).sendKeys("saidurga0823@gmail.com");
			d.findElement(By.id("continue")).click();
			Thread.sleep(2000);
			System.out.println("Email taken");
			d.findElement(By.id("ap_password")).sendKeys("Ndurga@123sai");
			System.out.println("password taken");

			d.findElement(By.id("signInSubmit")).click();
			System.out.println("Login successful");
			Thread.sleep(4000);

			// change login name
			Actions a1 = new Actions(d);
			WebElement change1 = d.findElement(By.id("nav-link-accountList-nav-line-1"));
			a1.moveToElement(change1).perform();
			Thread.sleep(4000);
			d.findElement(By.cssSelector("button[data-testid=\"manage-profiles-button\"]")).click();
			Thread.sleep(3000);
			d.findElement(By.xpath("//*[@id=\"a-popover-content-1\"]/div/div/div/ul/li[2]/div/div/div[2]/div[1]")).click();
		

		// 6.change current address
		
			d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
			d.findElement(By.cssSelector("div[id=\"nav-packard-glow-loc-icon\"]")).click();
			Thread.sleep(3000);
			d.findElement(By.cssSelector("span[id=\"GLUXCountryValue\"]")).click();
			// d.findElement(By.cssSelector("ul[aria-multiselectable=\"false\"]")).click();
			d.findElement(By.linkText("Australia")).click();
			d.findElement(By.cssSelector("span[class=\"a-button a-button-primary\"]")).click();
		

		// 7.shop by categories(click on checkbox filters
	
			d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
			// d.navigate().refresh();
			WebElement cat = d.findElement(By.id("searchDropdownBox"));
			cat.sendKeys("Computers");
			cat.sendKeys(Keys.ENTER);
			cat.click();
			WebElement search = d.findElement(By.id("twotabsearchtextbox"));
			search.click();
			search.sendKeys(Keys.ENTER);
			d.findElement(By.partialLinkText("Samsung")).click();
			d.findElement(By.partialLinkText("Samsung Galaxy Tab A9+ Tablet 11” 64GB Android")).click();
		

		// 8.select particular product right click for details
		
			d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
			WebElement search2 = d.findElement(By.cssSelector("input[placeholder=\"Search Amazon\"]"));
			search2.clear();
			search2.sendKeys("Motorola Mobiles");
			search2.sendKeys(Keys.ENTER);

			WebElement r = d.findElement(By.cssSelector(
					"img[alt=\"Sponsored Ad - Motorola Moto G - 2025 | Unlocked | Made for US 4/128GB | 50MP Camera | Forest Gray\"]"));
			Actions a2 = new Actions(d);
			a2.contextClick(r).perform();

			d.findElement(By.partialLinkText("Moto G - 2025 | Unlocked | Made for US 4/128GB | 50MP Camera | Forest Gray"))
					.click();
		
		
		//9.shop by categories
		
			d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
			d.navigate().refresh();
			WebElement cat1 = d.findElement(By.id("searchDropdownBox"));
			cat1.sendKeys("All Departments");
			cat1.sendKeys(Keys.ENTER);
			cat1.click();
			Thread.sleep(3000);
			WebElement search3 = d.findElement(By.id("twotabsearchtextbox"));
			//WebElement search=d.findElement(By.cssSelector("input[placeholder=\"Search Amazon\"]"));
			search3.click();
			search3.sendKeys(Keys.ENTER);
			
		
		
		//10.change the language 
	
			// d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
			d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
			Thread.sleep(1000);
			d.navigate().refresh();
			Actions a4 = new Actions(d);
			WebElement change3 = d
					.findElement(By.cssSelector("span[class=\"icp-nav-flag icp-nav-flag-us icp-nav-flag-lop\"]"));
			a4.moveToElement(change3).perform();
			Thread.sleep(3000);
			d.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/ul/li[3]/a/span/span[1]")).click();
	
			d.close();
		}

	}


