package tests;

import org.testng.annotations.*;


public class test {

    @BeforeGroups(value = {"test 1 group"})
    public void BeforeGroupsAnnotation() {
        System.out.println("Before groups ");
    }

    @BeforeClass
    public void BeforeClassAnnotation() {
        System.out.println("Before class");
    }


    @BeforeTest
    public void BeforeTestAnnotation() {
        System.out.println("Before test");
    }

    @BeforeMethod
    public void BeforeMethodAnnotation() {
        System.out.println("Before method");
    }

    @Test(priority = 1, groups = {"test 1 group"})
    public void test1() {
        System.out.println("first test");
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("second test");
    }

    @AfterMethod
    public void AfterMethodAnnotation() {
        System.out.println("After method");
    }

    @AfterTest
    public void AfterTestAnnotation() {
        System.out.println("After test");
    }

    @AfterClass
    public void AfterClassAnnotation() {
        System.out.println("After class");
    }

    @AfterGroups(value = {"test 1 group"})
    public void AfterGroupsAnnotation() {
        System.out.println("After groups ");
    }

}
