package LEARNTESTNG.TestNG_Basics;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountTest {
     @Test(invocationCount = 8)
    public void multiRun(){
        System.out.println("malik");
    }

    @Test
    void registration(){

        System.out.println("registration");
        Assert.assertTrue(true);

    }
    @Test(alwaysRun = true, dependsOnMethods = "registration",testName = "Validate login page with valid user data"
            , description = "Using valid username and password to validate the login page")
    void login(){
        System.out.println("Login");
    }

}

