package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    private EvenNumTest evenNumTest;
    @Test
    public void isPositiveEven() {
        boolean result = EvenNumTest.isEven(64);

        assertEquals(true,result);
        System.out.println("Positive even numbers passed");
    }

    @Test
    public void isNegativeEven() {
        boolean result = EvenNumTest.isEven(-64);

        assertEquals(true,result);
        System.out.println("Positive even numbers passed");
    }


    @Test
    public void isOddEven() {
        boolean result = EvenNumTest.isEven(33);

        assertEquals(false,result);
        System.out.println("Positive Odd number test case numbers passed");
    }

    @Test
    public void isNegativeOddEven() {
        boolean result = EvenNumTest.isEven(-33);

        assertEquals(false,result);
        System.out.println("Negative Odd number test case numbers passed");
    }

    @Test
    public void isZeroEven() {
        boolean result = EvenNumTest.isEven(0);

        assertEquals(true,result);
        System.out.println("Zero number test case numbers passed");
    }
}