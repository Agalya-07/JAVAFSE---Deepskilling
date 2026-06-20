package com.junit.exercise2;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
@Suite
@SelectClasses({
        CalculatorTest.class,
        StringTest.class
})
public class AllTests {
}