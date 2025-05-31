package com.juaracoding.appium;

import java.util.Arrays;

import org.testng.TestNG;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        testNG.setTestSuites(Arrays.asList("testng.xml"));
        testNG.setPreserveOrder(true);
        testNG.run();
    }
}
