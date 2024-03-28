package lt.eimantas.vinted.pages;

import org.openqa.selenium.By;

public class Locator {

    public static class Login {

        public static By buttonDennyCookies = By.xpath(
                "//button[@id='onetrust-reject-all-handler']"
        );
        public static By buttonSignUp = By.xpath(
                "//span[@class='web_ui__Button__label' and contains(text(), 'Registruotis')]");
    }
}
