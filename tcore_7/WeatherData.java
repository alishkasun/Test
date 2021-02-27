package tcore_7;

public class WeatherData {

    private static String city;
    private static String date;
    private static String weatherText;
    private static Double temperature;


    public WeatherData(String city, String localDate, String weatherText, Double temperature) {
        this.city = city;
        this.date = localDate;
        this.weatherText = weatherText;
        this.temperature = temperature;
    }

    public static String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static String getDate() {
        return date;
    }

    public void setLocalDate(String localDate) {
        this.date = localDate;
    }

    public static String getText() {
        return weatherText;
    }

    public void setText(String text) {
        this.weatherText = weatherText;
    }

    public static Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}

