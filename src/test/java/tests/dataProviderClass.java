package tests;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class dataProviderClass {


    @DataProvider(name = "DataDrivenTests2")
    public Object[][] dataSet() {
        Object[][] dataSeed = new Object[2][2];

        dataSeed[0][0] = "username1";
        dataSeed[0][1] = "pass1";

        dataSeed[1][0] = "username2";
        dataSeed[1][1] = "pass2";

        return dataSeed;
    }

    @DataProvider(name = "DataDrivenTests")
    public Object[][] dataSet2() {
        return new Object[][]{
                {"user1", "pass1"},
                {"user2", "pass2"},
                {"user3", "pass3"}
        };
    }


    @DataProvider(name = "DDT")
    public Object[][] SetDDT(Method method) {
        Object[][] testData = null;
        if (method.getName().equals("testDataProviderCombined")) {
            testData = new Object[][]{
                    {"userCom1", "passCom1"},
                    {"userCom2", "passCom2"},
            };

        } else if (method.getName().equals("testDataProviderCombined2")) {
            testData = new Object[][]{
                    {"userCom1", "passCom1 ", 123},
                    {"userCom2", "passCom2 ", 456},
            };
        }
        return testData;
    }


}
