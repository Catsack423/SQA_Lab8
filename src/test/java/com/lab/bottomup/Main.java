package com.lab.bottomup;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.lab.UniversalConverter;

public class Main {
    public static void main(String[] args) {
        UniversalConverter universal = new UniversalConverter();
        
        //Weight
        try {
            assertEquals(10000, universal.convert(10, "Weight", "kilogram", "gram"));
        } catch (Throwable e) {
            System.err.println(e);
        }
        //Distacne
        try {
            assertEquals(1000, universal.convert(1, "Distance", "kilometer", "meter"));
        } catch (Throwable e) {
            System.err.println(e.getMessage());
        }

        //Temp 
        try {
            assertEquals(273.15, universal.convert(0, "Temperature", "C", "K"));
        } catch (Throwable e) {
            // TODO: handle exception
            System.err.println(e.getMessage());
        }

    }

}
