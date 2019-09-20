package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Power4Test {

    private Power4 power4;

    @Test
    public void isPowerOf4() {
        boolean result = Power4.power4(64);

        assertEquals(true,result);
        System.out.println("isPowerOf4 is passed");
    }


    @Test
    public void isZeroPowerOf4() {
        boolean result = Power4.power4(0);

        assertEquals(false,result);
        System.out.println("isZeroPowerOf4 is passed");
    }

    @Test
    public void isNegativePowerOf4() {
        boolean result = Power4.power4(-64);

        assertEquals(false,result);
        System.out.println("isNegativePowerOf4 is passed");
    }

    @Test
    public void isOnePowerOf4() {
        boolean result = Power4.power4(1);

        assertEquals(true,result);
        System.out.println("isOnePowerOf4 is passed");
    }
}