package com.erliang.unit.test.helloworld;

import org.apache.log4j.Logger;

/**
 * @author jiangxing
 * @project unit-test
 * @date 4/24/16
 */
public class SayHello {
    private static final Logger LOGGER = Logger.getLogger(SayHello.class);

    public static String sayHello(){
        return "Hello World!!!";
    }
}
