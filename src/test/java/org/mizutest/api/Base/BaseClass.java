package org.mizutest.api.Base;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import static io.restassured.RestAssured.*;


public class BaseClass {
    public void installment(String installmentNumber, String product, String installmentTextValue,String productGroupIdValue, String installmentValue, int statusCode){
        baseURI="https://2c9889a3-719f-4417-ba0a-2938d8eab343.mock.pstmn.io/";
        Response response = get("test/installment=" + installmentNumber);
        JsonPath js = new JsonPath(response.asString());
        if ( response.getStatusCode()==200 && response.body().asString()!= " " ) {
            response.getStatusCode();
            String installment = js.get("result.data.products[" + product + "].installment").toString();//Responsta gelen ürünlerin installment datasına erişim
            String installmentText = js.get("result.data.products[" + product + "].installmentText").toString();//Responsta gelen ürünlerin installmentText datasına erişim
            String productGroupId = js.get("result.data.products[" + product + "].productGroupId").toString();//Responsta gelen ürünlerin productGroupId datasına erişim
            Assert.assertEquals(installment, installmentValue, "Test başarısız oldu.Veriler eşleşmedi.Gelen veri:" + installment);//installment datası kontrolü
            Assert.assertEquals(installmentText, installmentTextValue, "Test başarısız oldu.Veriler eşleşmedi.Gelen veri:" + installmentText);//installmentText datası kontrolü
            Assert.assertEquals(productGroupId, productGroupIdValue, "Test başarısız oldu.Veriler eşleşmedi.Gelen veri:" + productGroupId);//productGroupId datası kontrolü
            Assert.assertEquals(response.getStatusCode(), statusCode, "Test başarısız oldu.Veriler eşleşmedi.Gelen veri:" + response.getStatusCode());//Status code kontrolü
            Assert.assertEquals(HttpStatus.SC_OK,response.getStatusCode());//Status code kontrolü
        }
        else{
            response.getStatusCode();
           Assert.assertEquals(response.body().asString()," ");
            Assert.assertEquals(HttpStatus.SC_OK,response.getStatusCode());
            Assert.assertEquals(response.getStatusCode(), statusCode, "Yanlış Statü Kodu " + response.getStatusCode());
        }
    }
    public void installmentNull(int statusCode,String installmentNumber){
        baseURI="https://2c9889a3-719f-4417-ba0a-2938d8eab343.mock.pstmn.io/";
        Response response = get("/test/?installment="+installmentNumber);
        Assert.assertEquals(response.body().asString(),"");//Response data kontrolü
        Assert.assertEquals(HttpStatus.SC_INTERNAL_SERVER_ERROR,response.getStatusCode());//Status code kontrolü
        Assert.assertEquals(response.getStatusCode(),statusCode,"Test başarısız oldu.Veriler eşleşmedi.Gelen veri:" + response.getStatusCode());//Status code kontrolü
    }


}
