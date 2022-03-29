import observer.forecast.WeatherForecast;
import observer.notification.InternetNews;
import observer.notification.RadioNews;
import observer.notification.TvNews;

public class Main {
    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(25,120);
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();

        weatherForecast.notifyObservers();

    }
}
