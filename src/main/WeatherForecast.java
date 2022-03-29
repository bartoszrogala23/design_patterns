import notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {
    int temperature;
    int pressure;
    Set<Observer> registeredObservers = new HashSet<>();
}
