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
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    
    private float temperature;
    private float humidity;
    private float pressure;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions are: "+temperature+" C degrees "
                + "and "+humidity+" % humidity and "+pressure+
                " mm pressure");
    }
    }