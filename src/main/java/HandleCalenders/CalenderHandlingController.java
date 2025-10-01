package HandleCalenders;

import org.joda.time.DateTime;
import org.joda.time.Months;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class CalenderHandlingController extends BrowserController{

//    public  void selectDataFromCalender( String monthNameWithYear, String dateOfTheMonth){
//        //Click the close button the pop-up
//        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
//
//        WebElement departureDateElement=driver.findElement(By.xpath("//p[@data-cy='departureDate']"));
//        String departureDate=departureDateElement.getText();
//
//        System.out.println("Before click the date");
//        System.out.println(departureDate);
//        departureDateElement.click();
//
//        String month=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']//div[contains(text(),'"+monthNameWithYear+"')]")).getText();
//
//        System.out.println(month);
//        WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofSeconds(100));
//        JavascriptExecutor runJsScript= (JavascriptExecutor) driver;
//        if(month.equalsIgnoreCase(monthNameWithYear)) {
//            List<WebElement> dateList = driver.findElements(By.xpath("//div[@class='dateInnerCell']//p[contains(text(),'"+dateOfTheMonth+"')]"));
//            for (WebElement date : dateList){
//                explicitWait.until(ExpectedConditions.visibilityOf(date));
//                if(date.getText().contains(dateOfTheMonth)){
//                    System.out.println(date.getText());
//                    try {
//                        // runJsScript.executeScript("arguments[0].scrollIntoView(true);", date);
//                        runJsScript.executeScript("window.scrollBy(0,300)");
//                        date.click();
//                    }catch(ElementClickInterceptedException e){
//                        throw new RuntimeException(e);
//                    }
//                    System.out.println("After click the date");
//                    System.out.println(departureDateElement.getText());
//                }
//            }
//        }
//    }
    public void JqueryuiDatePicker(String userGivenDate) throws ParseException {
        driver=new ChromeDriver();
        driver.navigate().to("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement frame=driver.findElement(By.xpath("//*[@id='content']/iframe"));//iframe[@class='demo-frame']
        explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
        explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='datepicker']")))).click();
        String currDateStr = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText(); // MMMM YYYY
        System.out.println(currDateStr);
        Date setDate = new SimpleDateFormat("dd/MM/yyyy").parse(userGivenDate);
        Date currDate = new SimpleDateFormat("MMMM yyyy").parse(currDateStr);
        // fetch the different between current month and desire month
        int monthDiff = Months
                .monthsBetween(new DateTime(currDate).withDayOfMonth(1), new DateTime(setDate).withDayOfMonth(1))
                .getMonths();
        boolean isFuture = true;

        // if month is 0 then convert in to positive for run loop
        if (monthDiff < 0) {
            isFuture = false;
            monthDiff = -1 * monthDiff;
        }

        for (int i = 0; i < monthDiff; i++) {
            if (isFuture) {
                // click on next bar
                driver.findElement(By.xpath("//a[@title='Next'][1]")).click();
            } else {
                // click on previous bar
                driver.findElement(By.xpath("//a[@title='Prev'][1]")).click();
            }
        }

        String day = new SimpleDateFormat("dd").format(setDate);
        driver.findElement(By.xpath("//a[text()='"+day+"']")).click();

    }
}

