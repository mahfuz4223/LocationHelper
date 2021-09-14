package com.dark.fristtestlibary;

import android.location.Location;

public class locationhelper {
    public static float getDistanceInKM(double startLatitude,double startLongitude,double endLatitude, double endLongitude){
        float[] result = new float[0];
        Location.distanceBetween(startLatitude,startLongitude,endLatitude,endLongitude,result);

        return result[0] / 1000;
    }
}
