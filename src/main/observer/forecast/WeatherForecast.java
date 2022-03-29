package observer.forecast;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import observer.notification.Observer;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class WeatherForecast implements Observable {
    int temperature;
    int pressure;
    Set<Observable> registeredObservers = new HashSet<>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : registeredObservers) {
            observer.updateForecast(this);
        }
    }
}
