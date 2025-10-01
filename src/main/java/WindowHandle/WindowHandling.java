package WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
        driver.manage().window().maximize();
        String parentWindowId=driver.getWindowHandle();
        System.out.println(parentWindowId);
        driver.findElement(By.xpath("//button[contains(text(),'New Window')][1]")).click();
    }
}
