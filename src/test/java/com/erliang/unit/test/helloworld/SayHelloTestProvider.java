package com.erliang.unit.test.helloworld;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jiangxing
 * @project unit-test
 * @date 4/24/16
 */
public class SayHelloTestProvider {
    public static final String TEST_SAMPLE = "TEST_SAMPLE";
    private static final Map<String, Object[][]> samples = new HashMap<>();

    static {
        samples.put("sayHello", new Object[][]{
                {"Hello World!!!"}
        });
    }

    @DataProvider(name = TEST_SAMPLE)
    public static Object[][] getSimple(Method method){
        return samples.get(method.getName());
    }


}
