package lt.eimantas.vinted.pages;

import lt.eimantas.vinted.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Common {
    public static void setUpChrome(int durationOfSeconds) {
        Driver.setUpChromeDriver();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(durationOfSeconds));
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void quitDriver() {
        Driver.quitDriver();
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

}
