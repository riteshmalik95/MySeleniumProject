package LEARNTESTNG.TestNG_Basics;
import Utilities.TestReportListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestReportListener.class)
public class ReportTest   {

    @Test
    public void passTestExample() {
        Assert.assertTrue(true);
    }

    @Test
    public void failTestExample() {

        Assert.assertTrue(false);
    }

    @Test()
    public void skipTestExample() {
        System.out.println("i am not a testcase so i am skipped");
    }
}

