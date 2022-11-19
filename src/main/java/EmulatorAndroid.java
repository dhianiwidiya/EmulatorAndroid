import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class EmulatorAndroid {
    public static void main (String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");//Android Emulator
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0"); //Version of Android ex: 9.0 (pie)
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
       // dc.setCapability(MobileCapabilityType.APP, "D:\\app-danafix\\mobile-dev-221117-2.apk");
        dc.setCapability("appPackage", "id.danafix.ios");
        dc.setCapability("appActivity", "id.danafix.mobile.danafix.MainActivity");
        dc.setCapability("ensureWebviewsHavePages", true);
        dc.setCapability("nativeWebScreenshot", true);
        dc.setCapability("newCommandTimeout", 3600);
        dc.setCapability("connectHardwareKeyboard", true);

        URL url = new URL("http://localhost:4723/wd/hub");
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
        System.out.println("Install Success");

        WebElement skip = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Skip\"]"));
        skip.click();
        //WebElement inputphonenumber = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
        //inputphonenumber.sendKeys("0809791539187");
        //inputphonenumber.click();
        //String text = inputphonenumber.getText();
       // WebElement login = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Login\"]"));
       // login.click();

    }
}
