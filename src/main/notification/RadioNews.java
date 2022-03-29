package notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class RadioNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {

    }
}
