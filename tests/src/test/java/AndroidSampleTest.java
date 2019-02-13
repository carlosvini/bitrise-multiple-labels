import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;

import com.microsoft.appcenter.appium.Factory;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import org.junit.rules.TestWatcher;
import org.junit.Rule;

public class AndroidSampleTest {
    @Rule
    public TestWatcher watcher = Factory.createWatcher();

    private EnhancedAndroidDriver<MobileElement> driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = Utils.getAndroidDriver();
    }

    @Test
    public void sampleTest() {
        driver.label("start");
        MobileElement elementId = driver.findElement("accessibility id","text1");
        String text = elementId.getAttribute("text");
        Assert.assertEquals(text, "This is the ONE Project");
    }

    @After
    public void tearDown() {
        driver.label("end");
        driver.quit();
    }
}
