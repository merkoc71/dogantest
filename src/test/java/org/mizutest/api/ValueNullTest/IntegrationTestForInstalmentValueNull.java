package org.mizutest.api.ValueNullTest;

import org.junit.Test;
import org.mizutest.api.Base.BaseClass;

public class IntegrationTestForInstalmentValueNull extends BaseClass {

    @Test
    public void getInstallmentNull(){
        installmentNull(500,null);
    }
    @Override
    public void installmentNull(int statusCode, String installmentNumber) {
        super.installmentNull(statusCode, installmentNumber);
    }




}
