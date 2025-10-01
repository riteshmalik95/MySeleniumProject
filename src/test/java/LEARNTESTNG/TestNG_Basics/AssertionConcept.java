package LEARNTESTNG.TestNG_Basics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionConcept {
    @Test
    void softAssertion(){
        SoftAssert softAssert=new SoftAssert();
        int i=5;
        softAssert.assertEquals(i,15);
        System.out.println("Code after soft assertion");
    }
    @Test
    void hardAssertion(){
        int i=100;
        Assert.assertEquals(i,100);
        System.out.println("Code after hard assertion");
    }
}
