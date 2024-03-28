package lt.eimantas.vinted.pages.loginPage;

import lt.eimantas.vinted.pages.Common;
import lt.eimantas.vinted.pages.Locator;

public class VintedLoginPage {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void clickSignUp() {
       Common.clickOnElement(Locator.Login.buttonSignUp);
    }

    public static void dennyCookies() {
        Common.clickOnElement(Locator.Login.buttonDennyCookies);
    }

}
