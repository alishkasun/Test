package tcore_7;

import tcore_7.model.WeatherResponse;

import java.io.IOException;

public interface WeatherProvider {
    WeatherResponse getWeather(String city, Period period) throws IOException;

    String findCityByUserInput(String userInput) throws IOException;
}
