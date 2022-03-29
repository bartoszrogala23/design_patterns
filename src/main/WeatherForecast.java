import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import notification.Observer;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class WeatherForecast implements Observable {
    int temperature;
    int pressure;
    Set<Observer> registeredObservers = new HashSet<>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }
}
