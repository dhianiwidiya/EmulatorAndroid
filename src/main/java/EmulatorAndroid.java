import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class EmulatorAndroid {
    public static void main (String[] args) throws Exception {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");//Android Emulator
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0"); //Version of Android ex: 9.0 (pie)
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        dc.setCapability("appPackage", "id.danafix.ios");
        dc.setCapability("appActivity", "id.danafix.mobile.danafix.MainActivity");

        URL url = new URL("http://localhost:4723/wd/hub");
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
        String sessionId = driver.getSessionId().toString();
        //Thread.sleep(5000);

    }
}
