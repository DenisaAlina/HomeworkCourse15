package com.fasttrackit;

public class ExerciseTDD {

    public static Double fahrenheitToCelsius( Double temperature){
        if(temperature== null){
            return null;
        }
    return (temperature-32)*5.0/9;
    }

    public static Double celsiusToFahrenheit(Double temperature){
        if(temperature== null){
            return null;
        }
    return temperature*9.0/5+32;
    }
}
