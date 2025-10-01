package PropertiesFileBasics;
import Utilities1.PropertiesFileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.Properties;

public class WebSiteTestWithPropertiesFile {
    private PropertiesFileUtils PropertiesFileUtils;
    Properties prValue= PropertiesFileUtils.getPropertiesFileData();
    WebDriver driver;

    @BeforeMethod
    void loadWebSite(){
        String browser=prValue.getProperty("Browser_Name");
        if(browser.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
        }else{
            driver=new EdgeDriver();
        }
        driver.get(prValue.getProperty("BaseUrl"));
    }
    @Test
    void testerName(){
        System.out.println("Web site url "+ driver.getCurrentUrl());
        System.out.println("Tester Name "+ prValue.getProperty("testerName"));
    }


}

