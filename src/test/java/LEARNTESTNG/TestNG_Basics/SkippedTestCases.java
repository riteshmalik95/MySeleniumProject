package LEARNTESTNG.TestNG_Basics;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippedTestCases {
    //Enable = false also skip the test case but skip count not it disable the test so testng will not execute
    @Test(testName = "Skip test case ")
//    @Test(enabled = false)
    void skipTestCase(){
        throw new SkipException("Skipped test case"); //Test run count will add
    }
    @Test(testName = "Pass Test case")
    void pass(){
        Assert.assertTrue(true);
    }
    @Test(testName = "Failed test")
    void failed(){
        Assert.assertTrue(false);
    }
}
