import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import com.microsoft.appcenter.appium.EnhancedIOSDriver;
import com.microsoft.appcenter.appium.Factory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Utils {

    static EnhancedIOSDriver<IOSElement> getIOSDriver() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iOs Simulator");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "871719EC-D468-40A2-9D9A-283C6E8804B6");
        String appPath = "/Users/diego/Sites/tests-appium/Proj1.app";
        desiredCapabilities.setCapability(MobileCapabilityType.APP, appPath);
        desiredCapabilities.setCapability( "bundleId","com.jp7.proj1");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");

        desiredCapabilities.setCapability("showXcodeLog", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        EnhancedIOSDriver<IOSElement> driver = Factory.createIOSDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

    static EnhancedAndroidDriver<MobileElement> getAndroidDriver()  throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/carlos/Sites/bitrise-multiple-labels/Proj1/android/app/release/Proj1-release.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        EnhancedAndroidDriver<MobileElement> driver = Factory.createAndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

}
