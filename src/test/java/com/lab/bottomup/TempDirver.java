package com.lab.bottomup;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.lab.TemperatureConverter;

public class TempDirver {
    public static void main(String[] args) {
        var temp = new TemperatureConverter();
        var result = temp.convert(0, "C", "K");
        double expectedResult = 273.15;
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
