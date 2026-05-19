package WebDriver_pack;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.ArrayList;

public class Amazon_usecases {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://www.amazon.in/");

        try {
            // 🔐 LOGIN
            driver.findElement(By.id("nav-link-accountList")).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")))
                    .sendKeys("your_email");

            driver.findElement(By.id("continue")).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_password")))
                    .sendKeys("your_password");

            driver.findElement(By.id("signInSubmit")).click();

            // 🔍 SEARCH
            WebElement searchBox = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
            searchBox.sendKeys("laptop");
            driver.findElement(By.id("nav-search-submit-button")).click();

            // 🖱️ CLICK FIRST PRODUCT
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2 a")));
            driver.findElement(By.cssSelector("h2 a")).click();

            // Switch tab
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));

            // 📦 PRODUCT TITLE
            WebElement title = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("productTitle")));
            System.out.println("Title displayed: " + title.isDisplayed());

            // 💰 PRICE
            WebElement price = driver.findElement(By.cssSelector(".a-price-whole"));
            System.out.println("Price displayed: " + price.isDisplayed());

            // ⭐ RATING
            WebElement rating = driver.findElement(By.cssSelector("span.a-icon-alt"));
            System.out.println("Rating displayed: " + rating.isDisplayed());

            // 🔍 IMAGE ZOOM (hover)
            WebElement image = driver.findElement(By.id("landingImage"));
            Actions actions = new Actions(driver);
            actions.moveToElement(image).perform();
            System.out.println("Image hover done");

            // 🛒 ADD TO CART
            WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
            System.out.println("Add to Cart visible: " + addToCart.isDisplayed());

            // ⚡ BUY NOW
            WebElement buyNow = driver.findElement(By.id("buy-now-button"));
            System.out.println("Buy Now visible: " + buyNow.isDisplayed());

            // Click Add to Cart
            addToCart.click();

            // 🧾 GO TO CART
            WebElement cart = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("nav-cart")));
            cart.click();

            // 🧾 CHECKOUT
            WebElement checkout = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.name("proceedToRetailCheckout")));
            System.out.println("Checkout visible: " + checkout.isDisplayed());

        } catch (Exception e) {
            System.out.println("Test failed: " + e.getMessage());
        }

        // Close browser
        driver.quit();
    }
}