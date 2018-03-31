package eweather;

import java.util.ArrayList;

public class Refresh {
    
    //Μέθοδος που διαβάζει τa JSON files, τα περνάει σε ArrayLists και τα αποθηκευει στην ΒΔ για όλες τις πόλεις.
    public void fillArrayLists() {
        
        //Αρχικοποίηση λιστών
        ArrayList<MeteoData> w = new ArrayList<>();
        ArrayList<MeteoData> ath = new ArrayList<>();
        ArrayList<MeteoData> thess = new ArrayList<>();
        ArrayList<MeteoData> pat = new ArrayList<>();
        ArrayList<MeteoData> lar = new ArrayList<>();
        ArrayList<MeteoData> her = new ArrayList<>();
        
        //Αρχικοποίηση DataController 
        DataController d = new DataController();
        
        //Γεμισμα των λιστών
        d.fillArrayListWeatherNow(w, "http://api.openweathermap.org/data/2.5/group?id=264371,734077,8133690,8133786,261745&units=metric&appid=0824de274b24b37fe7eb81bc547f7a7c");
        d.fillArrayListForecast(ath, CityIndex.getCityCode(0));
        d.fillArrayListForecast(thess, CityIndex.getCityCode(1));
        d.fillArrayListForecast(pat, CityIndex.getCityCode(2));
        d.fillArrayListForecast(lar, CityIndex.getCityCode(3));
        d.fillArrayListForecast(her, CityIndex.getCityCode(4));
        
        //Εισαγωγή δεδομένων στον πίνακα DBWEATHERNOW της ΒΔ
        DBWeather insW = new DBWeather();
        insW.insertWeather(w);
        
        //Εισαγωγή δεδομένων στον πίνακα DBFORECAST της ΒΔ
        DBWeather insF = new DBWeather();
        insF.insertForecast(ath);
        insF.insertForecast(thess);
        insF.insertForecast(pat);
        insF.insertForecast(lar);
        insF.insertForecast(her);
    }  
}