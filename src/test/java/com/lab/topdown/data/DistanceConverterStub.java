package com.lab.topdown.data;

import com.lab.DistanceConverter;

public class DistanceConverterStub  extends DistanceConverter{
    //Convert from kilometer to meter
	
    @Override
    public double convert(double distanceValue, String fromUnit, String toUnit) {
        // TODO Auto-generated method stub
        return 1000;
    }
}
