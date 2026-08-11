package com.lab.topdown.data;

import com.lab.TemperatureConverter;

public class TemperatureConverterStub extends TemperatureConverter {
    @Override
    public double convert(double tempValue, String fromUnit, String toUnit) {
        // 0 C to 273 K
        return 273;
    }
}
