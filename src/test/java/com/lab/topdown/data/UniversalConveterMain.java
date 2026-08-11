package com.lab.topdown.data;

import com.lab.DistanceConverter;
import com.lab.TemperatureConverter;
import com.lab.UniversalConverter;
import com.lab.WeightConverter;

public class UniversalConveterMain extends UniversalConverter {

    DistanceConverter distanceConverter;
    WeightConverter weightConverter;
    TemperatureConverter tempConverter;

    public UniversalConveterMain(

    ) {

    }

    @Override
    public double convert(double value, String choice, String fromUnit, String toUnit) {
        double result = 0.0;
        if (choice.equals("Distance")) {
            result = distanceConverter.convert(value, fromUnit, toUnit);
        } else if (choice.equals("Weight")) {
            result = weightConverter.convert(value, fromUnit, toUnit);
        } else if (choice.equals("Temperature")) {
            result = tempConverter.convert(value, fromUnit, toUnit);
        }

        return result;
    }

    public void setDistanceConverter(DistanceConverter distanceConverter) {
        this.distanceConverter = distanceConverter;
    }

    public void setTempConverter(TemperatureConverter tempConverter) {
        this.tempConverter = tempConverter;
    }

    public void setWeightConverter(WeightConverter weightConverter) {
        this.weightConverter = weightConverter;
    }
}
