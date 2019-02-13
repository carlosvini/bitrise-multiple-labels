import com.microsoft.appcenter.appium.EnhancedIOSDriver;
import com.microsoft.appcenter.appium.Factory;
import io.appium.java_client.ios.IOSElement;
import org.junit.*;
import org.junit.rules.TestWatcher;

import java.net.MalformedURLException;

public class iOsSampleTest {
    @Rule
    public TestWatcher watcher = Factory.createWatcher();

    private EnhancedIOSDriver<IOSElement> driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = Utils.getIOSDriver();
    }

    @Test
    public void sampleTest() {
        driver.label("start");
        IOSElement elementId = driver.findElement("accessibility id","text1");
        String visible = elementId.getAttribute("visible");
        Assert.assertEquals(visible, "true");
    }

    @After
    public void tearDown() {
        driver.label("end");
        driver.quit();
    }
}
