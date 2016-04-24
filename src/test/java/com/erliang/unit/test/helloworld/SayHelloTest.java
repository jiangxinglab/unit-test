package com.erliang.unit.test.helloworld;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author jiangxing
 * @project unit-test
 * @date 4/24/16
 */
public class SayHelloTest {

    @Test(dataProvider = SayHelloTestProvider.TEST_SAMPLE, dataProviderClass = SayHelloTestProvider.class)
    public void sayHello(String expected){
        String result = SayHello.sayHello();
        Assert.assertEquals(result, expected);
    }
}
