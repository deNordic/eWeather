package eweather;

public class MeteoData {

    private String city_name;
    private double main_temp;
    private String weather_description;
    private int clouds_all;
    private double wind_speed;
    private int dt;
    private int id;
    private double rain;
    private double snow;

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public double getMain_temp() {
        return main_temp;
    }

    public void setMain_temp(double main_temp) {
        this.main_temp = main_temp;
    }

    public String getWeather_description() {
        return weather_description;
    }

    public void setWeather_description(String weather_description) {
        this.weather_description = weather_description;
    }

    public int getClouds_all() {
        return clouds_all;
    }

    public void setClouds_all(int clouds_all) {
        this.clouds_all = clouds_all;
    }

    public double getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(double wind_speed) {
        this.wind_speed = wind_speed;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public double getSnow() {
        return snow;
    }

    public void setSnow(double snow) {
        this.snow = snow;
    }   

    @Override
    public String toString() {
        return "MeteoData{" + "city_name=" + city_name + ", main_temp=" + main_temp + ", weather_description=" + weather_description + ", clouds_all=" + clouds_all + ", wind_speed=" + wind_speed + ", dt=" + dt + ", id=" + id + ", rain=" + rain + ", snow=" + snow + '}';
    }
}