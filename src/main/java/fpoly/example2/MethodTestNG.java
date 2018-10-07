package fpoly.example2;

import org.testng.annotations.*;

public class MethodTestNG {

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @Test
    public void test1() {
        System.out.println("Test1");
    }

    @Test
    public void test2() {
        System.out.println("Test2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Parameters({"param"})
    @BeforeMethod
    public void beforeMethod(String p) {
        System.out.println("Before Method With Param : " + p);
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }
}
