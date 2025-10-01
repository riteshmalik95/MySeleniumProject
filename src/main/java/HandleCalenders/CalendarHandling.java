package HandleCalenders;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.ParseException;

public class CalendarHandling extends BrowserController {
    WebDriver driver;

    @BeforeMethod
    void lunchWebPage(){
        launchBrowser();
    }
//    @Test(testName = "Get the departure data")
//    public void testMakeMyTrip() {
//        CalenderHandlingController cl=new CalenderHandlingController();
//        cl.selectDataFromCalender("September 2025", "30");
//
//    }
    @Test
    void testCalendar() throws ParseException {
        CalenderHandlingController obj=new CalenderHandlingController();
        obj.JqueryuiDatePicker("24/10/1995");
    }

}

