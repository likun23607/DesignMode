package observer.newobserver;

import observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2016/11/10.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    Observable observable;
    private float tempreature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData=(WeatherData)obs;
            this.tempreature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+tempreature+"F degree and "+humidity+ "% humidity");
    }
}
