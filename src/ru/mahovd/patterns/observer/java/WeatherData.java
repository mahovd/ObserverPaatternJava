/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mahovd.patterns.observer.java;

import java.util.Observable;

/**
 *
 * @author dmitrijmahov
 */
public class WeatherData extends Observable{
    
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }
    
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        measurementsChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }
    
}
