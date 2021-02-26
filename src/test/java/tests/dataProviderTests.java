package tests;

import org.testng.annotations.Test;

public class dataProviderTests {


    @Test(dataProvider = "DataDrivenTests", dataProviderClass = dataProviderClass.class)
    public void testDataProvider(String userName, String password){
        System.out.println(userName + "--" + password);
    }

    @Test(dataProvider = "DataDrivenTests2", dataProviderClass = dataProviderClass.class)
    public void testDataProvider2(String userName, String password){
        System.out.println(userName + "--" + password);
    }



    @Test(dataProvider = "DDT", dataProviderClass = dataProviderClass.class)
    public void testDataProviderCombined(String userName, String password){
        System.out.println(userName + "--" + password);
    }

    @Test(dataProvider = "DDT", dataProviderClass = dataProviderClass.class)
    public void testDataProviderCombined2(String userName, String password, int ID){
        System.out.println(userName + "--" + password + ID );
    }




}
