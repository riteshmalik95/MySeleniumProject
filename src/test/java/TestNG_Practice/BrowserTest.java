package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTest {
    @Test
    @Parameters({"browser","url"})
    public void LaunchBrowser(String browser,String url){
        System.out.println("Browser Received "+browser);
        System.out.println("URL Received "+url);

        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("Launching Chrome Browser and navigating to URL"+url);
            WebDriver driver = new ChromeDriver();
             driver.get(url);
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("Launching Firefox Browser and navigating to URL"+url);
            WebDriver driver = new FirefoxDriver();
            driver.get(url);
        }else if (browser.equalsIgnoreCase("edge")) {
            System.out.println("Launching Firefox Browser and navigating to URL"+url);
            WebDriver driver = new EdgeDriver();
            driver.get(url);
        }else {
            System.out.println("Invalid browser name! Provide chrome/firefox/edge");
        }
    }
}
