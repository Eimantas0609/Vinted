package lt.eimantas.vinted.tests;

import lt.eimantas.vinted.pages.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    @BeforeMethod
    public abstract void setUp();

//    @AfterMethod
//    public void tearDown() {
//        Common.quitDriver();
//    }
}
