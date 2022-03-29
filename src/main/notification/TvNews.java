package notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class TvNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        
    }
}
