package com.lab.bottomup;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.lab.WeightConverter;



public class WegihtDriver {
     public static void main(String[] args) {
        var weight = new WeightConverter();
        var result = weight.convert(10, "kilogram", "gram");
        double expectedResult = 10000;
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
