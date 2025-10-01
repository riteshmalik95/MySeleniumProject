package TestNG_Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 {

    @DataProvider(name = "user data")
    Object[][] datatest() {

        return new Object[][]{
                {"user01", "pass1"},
                {"user2", "pass2"}

        };
    }

    @DataProvider()
    Object[][] myData() {

        return new Object[][]{
                {1, 2},
                {3, 4}

        };
    }

    @Test(dataProvider = "user data")
    public void testdata(String user, String password) {
        System.out.println(user + " " + password);
    }

    @Test(dataProvider = "myData")
    void testwithoutdataname(int a, int b) {
        System.out.println(a + " " + b);
    }

}

