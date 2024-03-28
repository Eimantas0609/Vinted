package lt.eimantas.vinted.tests.loginTests;

import lt.eimantas.vinted.pages.loginPage.VintedLoginPage;
import lt.eimantas.vinted.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VintedLoginTest extends TestBase {

    @BeforeMethod
    @Override

    public void setUp() {
        VintedLoginPage.openUrl("https://www.vinted.l/");
        VintedLoginPage.dennyCookies();

    }

    @Test
    public void testLogin() {
        VintedLoginPage.clickSignUp();
    }
}
