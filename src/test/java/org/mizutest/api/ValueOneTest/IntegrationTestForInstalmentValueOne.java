package org.mizutest.api.ValueOneTest;
import org.junit.Test;
import org.mizutest.api.Base.BaseClass;

public class IntegrationTestForInstalmentValueOne extends BaseClass {

    @Test
    public void getInstallmentForProductZero(){
        installment("1","0","6 x 13,33 TL Taksit Seçeneği","1","true",200);
    }
    @Test
    public void getInstallmentForProductOne(){

        installment("1","1","6 x 11,66 TL Taksit Seçeneği","1","true",200);
    }
    @Test
    public void getInstallmentForProductTwo(){

        installment("1","2","6 x 6,66 TL Taksit Seçeneği","1","true",200);
    }
    @Test
    public void getInstallmentForProductThree(){

        installment("1","3","6 x 11,66 TL Taksit Seçeneği","1","true",200);
    }
    @Test
    public void getInstallmentForProductFour(){

        installment("1","4","6 x 16,66 TL Taksit Seçeneği","1","true",200);
    }
    @Test
    public void getInstallmentForProductFive(){

        installment("1","5","6 x 23,16 TL Taksit Seçeneği","1","true",200);
    }
    @Test
    public void getInstallmentForProductSix(){

        installment("1","6","6 x 11,66 TL Taksit Seçeneği","1","true",200);
    }



}
