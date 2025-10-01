package ExcelLearning;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.File;
import java.time.Duration;

public class FetchExcelDataByDataProvider {
    public static Object[][] getExcelData() {
        String excelFilePath=System.getProperty("user.dir")+ File.separator+
                ".\\src\\test\\resources\\MyExcel.xlsx";
        Object [][] excelData={{}};
        File getExcelFile=new File(excelFilePath);
        if(getExcelFile.exists()){
            Workbook openWorkbook= null;
            try {
                openWorkbook = new XSSFWorkbook(getExcelFile);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            Sheet openSheet=openWorkbook.getSheet("Sheet1");
            int rowNo=openSheet.getPhysicalNumberOfRows();//total row size
            int colNo=openSheet.getRow(0).getPhysicalNumberOfCells(); // total column size of the 0th index row

            excelData =new Object[rowNo-1][colNo];

            for(int i=1; i<rowNo; i++){
                Row getRow=openSheet.getRow(i);
                for(int j=0; j<getRow.getPhysicalNumberOfCells(); j++){
                    Cell getCell=getRow.getCell(j);
                    //We are storing the Excel in the Object [] [] variable.
                    excelData[i-1][j]=getCell.toString();
                }
            }
            return excelData;
        }else{
            System.err.println("File is not found "+getExcelFile.getAbsoluteFile());
        }
        return excelData;
    }

    @DataProvider(name = "Excel Data")
    public Object [][] returnExcelData(){
        return getExcelData();
    }
    WebDriver driver;
    @BeforeMethod
    public void launchWebSite(){
        driver=new ChromeDriver();
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/login.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }
    public void validateLogin(WebDriver driver, String username, String password){
        this.driver=driver;
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    @Test(dataProvider = "Excel Data")
    void testLoginPage(String user, String password){
        validateLogin(driver,user,password);

    }

}
