package org.mizutest.ui.DataProvider;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{"merkoc71.on@gmail.com", "12345", true}};
    }

}
