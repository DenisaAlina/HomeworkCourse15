package com.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExerciseTDDTest {

    @Test
    public void instantiateClass(){
        ExerciseTDD exerciseTDD = new ExerciseTDD();
    }

    @Test
    public void callMethod(){
        ExerciseTDD exerciseTDD = new ExerciseTDD();
        exerciseTDD.fahrenheitToCelsius(100.0);
    }

    @Test
    public void methodReturnsADouble(){
        ExerciseTDD exerciseTDD = new ExerciseTDD();
        Double temperature = 100.0;
        Double result= exerciseTDD.fahrenheitToCelsius(temperature);
    }

    @Test
    public void returnNullIfTemperatureIsNull(){

        //GIVEN
        ExerciseTDD exerciseTDD = new ExerciseTDD();
        Double temperature=null;

        //WHEN
        Double result=exerciseTDD.fahrenheitToCelsius(temperature);

        //THEN
        Assertions.assertThat(result).isNull();
    }

    @Test
    public void returnCelsiusTemperature(){

        //GiVEN
        ExerciseTDD exerciseTDD = new ExerciseTDD();
        Double temperature = 100.0;


        //WHEN
        Double result= exerciseTDD.fahrenheitToCelsius(temperature);

        //THEN
        Assertions.assertThat(result).isEqualTo(37.77777777777778);

    }

    @Test
    public void returnCelsiusTemperature1(){

        //GiVEN
        ExerciseTDD exerciseTDD = new ExerciseTDD();
        Double temperature = 50.0;


        //WHEN
        Double result= exerciseTDD.fahrenheitToCelsius(temperature);

        //THEN
        Assertions.assertThat(result).isEqualTo(10);

    }

    @Test
    public void callSecondMethod(){
        ExerciseTDD exerciseTDD = new ExerciseTDD();
        exerciseTDD.celsiusToFahrenheit(10.0);
    }

    @Test
    public void secondMethodReturnsADouble(){
        ExerciseTDD exerciseTDD = new ExerciseTDD();
        Double temperature = 10.0;
        Double result= exerciseTDD.celsiusToFahrenheit(temperature);
    }

    @Test
    public void returnNullIfCelsiusTemperatureIsNull(){

        //GIVEN
        ExerciseTDD exerciseTDD = new ExerciseTDD();
        Double temperature=null;

        //WHEN
        Double result=exerciseTDD.celsiusToFahrenheit(temperature);

        //THEN
        Assertions.assertThat(result).isNull();
    }

    @Test
    public void returnFahrenheitTemperature1(){

        //GiVEN
        ExerciseTDD exerciseTDD = new ExerciseTDD();
        Double temperature = 37.77777777777778;


        //WHEN
        Double result= exerciseTDD. celsiusToFahrenheit(temperature);

        //THEN
        Assertions.assertThat(result).isEqualTo(100.0);

    }
    @Test
    public void returnFahrenheitTemperature(){

        //GiVEN
        ExerciseTDD exerciseTDD = new ExerciseTDD();
        Double temperature = 10.0;


        //WHEN
        Double result= exerciseTDD. celsiusToFahrenheit(temperature);

        //THEN
        Assertions.assertThat(result).isEqualTo(50);

    }

}
