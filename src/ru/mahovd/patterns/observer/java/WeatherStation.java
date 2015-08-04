/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mahovd.patterns.observer.java;

/**
 *
 * @author dmitrijmahov
 */
public class WeatherStation {
    
    public static void main(String[] args) {
        
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay conditionsDisplay = 
                new CurrentConditionsDisplay(weatherData);
        
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        
        weatherData.setMeasurements(32, 75, 98);
        
    }
    
}
