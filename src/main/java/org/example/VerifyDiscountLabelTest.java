package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VerifyDiscountLabelTest extends BaseTest {

    @Test
    public void verifyDiscountLabelIsVisible() {
        driver.get("https://teststoreforsouthafri.nextbasket.shop/");

        WebElement discountLabel = driver.findElement(By.xpath("//*[contains(text(), '50% off')]"));
        assert discountLabel.isDisplayed();
    }
}

