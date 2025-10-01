package WebTableDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebTableConcept {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List <WebElement>tableCol=driver.findElements(By.xpath("//th[@scope='col']"));//of size 7
        List <WebElement>tableRows=driver.findElements(By.xpath("//td[@scope='row']"));//of size 5
        // it will print the table headers
        for(WebElement col:tableCol){
            System.out.print(col.getText()+"\t");

        }
        System.out.println();
        int row=1,col=1;
        for(int rowCount=0;rowCount<=tableRows.size();rowCount++){
            for(int columnCount = 0; columnCount <=tableRows.size(); columnCount++ ){
                String tableContent=tableCol.get(columnCount).getText();
                System.out.println(tableContent+"\t:");
                String cellText=driver.findElement(By.xpath("//tbody//tr//td[@scope='row']")).getText();
                System.out.println(cellText+"\t");
                row++;
                if(row>6){
                    row=1;
                }
            }
            System.out.println();
            col++;
            if(col>5){
                break;
            }
        }




        driver.quit();
    }
}
