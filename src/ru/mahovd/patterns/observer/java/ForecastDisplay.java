/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mahovd.patterns.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author dmitrijmahov
 */
public class ForecastDisplay implements Observer, DisplayElement{
    
    private Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Forecast conditions are: "
                +lastPressure+" % lastPressure and "+currentPressure+
                " mm pressure");
    }
    
    
    
}
