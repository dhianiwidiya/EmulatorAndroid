import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AutomateCalculatorAPK {
    public static void main (String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "App Info Automation");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0"); //Version of Android ex: 9.0 (pie)
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Andrroid Emulator");
        //dc.setCapability(MobileCapabilityType.APP, "D:\\app-danafix\\Apk Info_2.2.8_apkcombo.com.apk");
        URL url=new URL("http://localhost:4723/wd/hub");

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
        // String sessionId = driver.getSessionId().toString();


        //driver.quit(); //for quit after installation
    }
}
