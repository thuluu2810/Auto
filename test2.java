package test1;

import static org.junit.Assert.assertEquals;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test2 {
private WebDriver driver;
	
	@Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("version", "latest");
        capabilities.setCapability("platform", Platform.WINDOWS);
        capabilities.setCapability("name", "Testing Selenium");

        this.driver = new RemoteWebDriver(
           new URL("http://key:secret@hub.testingbot.com/wd/hub"),
           capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testSimple() throws Exception {
        this.driver.get("http://www.google.com");
        assertEquals("Google", this.driver.getTitle());
    }

    @After
    public void tearDown() throws Exception {
        this.driver.quit();
    }

}
