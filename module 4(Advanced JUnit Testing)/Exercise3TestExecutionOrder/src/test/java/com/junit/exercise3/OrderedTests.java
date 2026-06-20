package com.junit.exercise3;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {
    @Test
    @Order(1)
    void testOne() {
        System.out.println("Test One Executed");
    }
    @Test
    @Order(2)
    void testTwo() {
        System.out.println("Test Two Executed");
    }
    @Test
    @Order(3)
    void testThree() {
        System.out.println("Test Three Executed");
    }
}