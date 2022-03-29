package observer.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import observer.forecast.WeatherForecast;

@AllArgsConstructor
@Setter
@Getter
public class InternetNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet News: temperature: " + weatherForecast.getTemperature() + ", pressure: " + weatherForecast.getPressure());
    }
}
