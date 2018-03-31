package eweather;

public class Temp {
    
    private String cityName;
    private double minTemp;
    private double maxTemp;
    private double avgTemp;

    public Temp(String cityName, double minTemp, double maxTemp) {
        this.cityName = cityName;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }
    
    public Temp(String cityName, double minTemp, double maxTemp, double avgTemp) {
        this.cityName = cityName;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.avgTemp = avgTemp;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(double avgTemp) {
        this.avgTemp = avgTemp;
    }
}