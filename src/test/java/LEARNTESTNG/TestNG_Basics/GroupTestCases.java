package LEARNTESTNG.TestNG_Basics;


import org.testng.annotations.Test;

public class GroupTestCases {

    @Test(groups = "regression")
    public void regression1Test(){
        System.out.println("I'm regression 1 testing");
    }
    @Test(groups = "regression")
    public void regression2Test(){
        System.out.println("I'm regression 2 testing");
    }
    @Test(groups = {"regression","smoke"})
    public void regressionAndSmoke1Test(){
        System.out.println("I'm regression and smoke testing");
    }
    @Test()
    public void normalTest(){
        System.out.println("I'm normal testing");
    }


}

