package tests;

import org.testng.annotations.Test;

public class groupsTest {

    @Test(priority = 1, groups = {"testing feature x"})
    public void test1() {
        System.out.println("first test");
    }

    @Test(priority = 2, groups = {"testing feature y"})
    public void test2() {
        System.out.println("second test");
    }


    @Test(groups = { "windows.checkintest" })
    public void testWindowsOnly() {
    }

    @Test(groups = {"linux.checkintest"} )
    public void testLinuxOnly() {
    }

    @Test(groups = { "windows.functest"} )
    public void testWindowsToo() {
    }


}
