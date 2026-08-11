package com.lab.topdown.data;

import com.lab.DistanceConverter;

public class DistanceConverterStub  extends DistanceConverter{
    //Convert from kilometer to meter
	
    @Override
    public double convert(double distanceValue, String fromUnit, String toUnit) {
       
        return 1000;
    }
}
