package observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jianweilin
 * @date 2018/8/6
 */
public class Weather {
    private WeatherType currentWeather;
    private List<WeatherObserver> observers;

    public Weather() {
        observers = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver observer){
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer){
        observers.remove(observer);
    }

    public void timePass(){
        WeatherType[] enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.println(String.format("The weather changed to %s",currentWeather));
        notifyObservers(currentWeather);

    }

    private void notifyObservers(WeatherType weatherType){
        for (WeatherObserver observer : observers){
            observer.update(weatherType);
        }
    }
}
