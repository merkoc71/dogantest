package org.mizutest.api.ValueZeroTest;

import org.junit.Test;
import org.mizutest.api.Base.BaseClass;

public class IntegrationTestForInstalmentValueZero extends BaseClass {

    @Test
    public void getInstallmentForProductZero(){
        installment("0","0","","2","false",200);
    }
    @Test
    public void getInstallmentForProductOne(){
        installment("0","1","","2","false",200);
    }
    @Test
    public void getInstallmentForProductTwo(){
        installment("0","2","","2","false",200);
    }
    @Test
    public void getInstallmentForProductThree(){
        installment("0","3","","2","false",200);
    }
    @Test
    public void getInstallmentForProductFour(){
        installment("0","4","","2","false",200);
    }
    @Test
    public void getInstallmentForProductFive(){
        installment("0","5","","2","false",200);
    }
}
