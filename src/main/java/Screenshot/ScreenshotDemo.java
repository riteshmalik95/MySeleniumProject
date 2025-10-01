package Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotDemo {

    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws IOException {


        driver.navigate().to("https://www.google.com");
        takeFullPageScreenSotController("RiteshScreenshot");
        takeSpecificElementScreenShot("SpecificElementScreenshot");
    }


    private static void takeSpecificElementScreenShot(String specificElementScreenshot) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;

        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        String screenshotFileName = "";
        File destinationPath = new File(System.getProperty("user.dir") + File.separator + "/src/main/java/Screenshot/" + screenshotFileName + ".png");
        FileUtils.copyFile(sourceFile, destinationPath);
    }

    private static void takeFullPageScreenSotController(String riteshScreenshot) throws IOException {
        String screenshotFileName = "";
        WebElement element=driver.findElement(By.name("q"));
        File sourceFile =element.getScreenshotAs(OutputType.FILE);
        File destinationPath =new File(System.getProperty("user.dir")+File.separator+ "/src/main/java/Screenshot/Specific"+screenshotFileName+".png");
        FileUtils.copyFile(sourceFile, destinationPath);

    }

}