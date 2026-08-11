package com.lab.topdown;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.lab.DistanceConverter;
import com.lab.TemperatureConverter;
import com.lab.WeightConverter;
import com.lab.topdown.data.DistanceConverterStub;
import com.lab.topdown.data.TemperatureConverterStub;
import com.lab.topdown.data.UniversalConveterMain;
import com.lab.topdown.data.WeightCoverterStub;

public class UniversalTest {
    private UniversalConveterMain univer;

    // Undertest UniversalConverter,WeightConverter
    // Stab DistanceConverter TemperatureConverter
    @Test
    void TC01_Weight() {
        /// Test
        univer = new UniversalConveterMain();
        univer.setWeightConverter(new WeightConverter());

        // setStab
        univer.setDistanceConverter(new DistanceConverterStub());
        univer.setTempConverter(new TemperatureConverterStub());

        // testStab
        assertEquals(1000, univer.convert(1, "Distance", "km", "m"));
        assertEquals(273, univer.convert(0, "Temperature", "C", "K"));

        var result = univer.convert(10, "Weight", "kilogram", "gram");
        assertEquals(10000, result);
    }

    @Test
    void TC02_Distance() {
        /// Test
        univer = new UniversalConveterMain();

        univer.setDistanceConverter(new DistanceConverter());

        // setStab
        univer.setTempConverter(new TemperatureConverterStub());
        univer.setWeightConverter(new WeightCoverterStub());

        // testStab
        assertEquals(273, univer.convert(0, "Temperature", "C", "K"));
        assertEquals(1, univer.convert(1000, "Weight", "gram", "kilogram"));

        // test
        assertEquals(1000, univer.convert(1, "Distance", "kilometer", "meter"));

    }

    @Test
    void TC03_Temp() {
        /// Test
        univer = new UniversalConveterMain();

        univer.setTempConverter(new TemperatureConverter());

        // setStab
        univer.setDistanceConverter(new DistanceConverterStub());
        univer.setWeightConverter(new WeightCoverterStub());

        // testStab
        assertEquals(1000, univer.convert(1, "Distance", "kilometer", "meter"));
        assertEquals(1, univer.convert(1000, "Weight", "gram", "kilogram"));

        // test
        assertEquals(273.15, univer.convert(0, "Temperature", "C", "K"));

    }

    @Test
    void TC04_Test_All() {
        /// Test
        univer = new UniversalConveterMain();

        univer.setWeightConverter(new WeightConverter());
        univer.setDistanceConverter(new DistanceConverter());
        univer.setTempConverter(new TemperatureConverter());

        assertEquals(273.15, univer.convert(0, "Temperature", "C", "K"));
        assertEquals(1000, univer.convert(1, "Distance", "kilometer", "meter"));
        assertEquals(1, univer.convert(1000, "Weight", "gram", "kilogram"));
    }
}
