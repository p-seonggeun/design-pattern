package ch2;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 64, 30.4f);
        weatherData.setMeasurements(85, 34, 29.2f);
        weatherData.setMeasurements(90, 14, 29.4f);
    }
}
