package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OrderProductTest extends BaseTest {

    @Test
    public void orderFirstInStockNonPromoProduct() {
        driver.get("https://teststoreforsouthafri.nextbasket.shop/");

        WebElement product = driver.findElements(By.cssSelector(".product:not(.promo)")).get(0);
        product.findElement(By.xpath(".//button[contains(text(), 'Add to cart')]")).click();

        driver.findElement(By.cssSelector(".cart-checkout")).click();
        driver.findElement(By.id("country")).sendKeys("South Africa");
        driver.findElement(By.id("city")).sendKeys(Alberton);
        driver.findElement(By.id("complete-order")).click();

        WebElement confirmationMessage = driver.findElement(By.xpath("//h1[contains(text(), 'Thank you for your order')]"));
        assert confirmationMessage.isDisplayed();
    }
}
