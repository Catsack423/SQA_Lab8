package com.lab.bottomup;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.lab.DistanceConverter;

public class DistanceDriver {
    public static void main(String[] args) {
        var distance = new DistanceConverter();
        var result = distance.convert(1, "kilometer", "meter");
        double expectedResult = 1000;
        try {
            assertEquals(expectedResult,result );
            
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("Test Faild");
            return;
        }
        System.out.println("TestPass Expcted:"+expectedResult+"  Actual:"+result);
    }
}
