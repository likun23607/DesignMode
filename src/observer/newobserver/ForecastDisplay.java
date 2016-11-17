package observer.newobserver;

import observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2016/11/10.
 */
public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure=29.92f;
    private float lastPressure;

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData=(WeatherData)obs;
            lastPressure=currentPressure;
            currentPressure=weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {

    }
}
