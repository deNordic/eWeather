package eweather;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;

public class DataController {
    
    //Μέθοδος που διαβάζει τo JSON API του OpenWeatherMap για τον τρέχων καιρό από το όρισμα s. Δημιουργεί αντικείμενα MeteoData και τα περνάει στις ArrayLists που δίνονται στο όρισμα
    public void fillArrayListWeatherNow(ArrayList <MeteoData>a, String s) {
        
        String j = URLReader.callURL(s);
        JsonObject obj = new JsonParser().parse(j).getAsJsonObject();
               
        for(int i=0; i<5; i++) {
            
            MeteoData md = new MeteoData();
            md.setCity_name(CityIndex.getCityName(i));
            md.setMain_temp(obj.get("list").getAsJsonArray().get(i).getAsJsonObject().get("main").getAsJsonObject().get("temp").getAsDouble());
            md.setWeather_description(obj.get("list").getAsJsonArray().get(i).getAsJsonObject().get("weather").getAsJsonArray().get(0).getAsJsonObject().get("description").getAsString());
            md.setClouds_all(obj.get("list").getAsJsonArray().get(i).getAsJsonObject().get("clouds").getAsJsonObject().get("all").getAsInt());
            md.setWind_speed(obj.get("list").getAsJsonArray().get(i).getAsJsonObject().get("wind").getAsJsonObject().get("speed").getAsDouble());
            md.setId(obj.get("list").getAsJsonArray().get(i).getAsJsonObject().get("id").getAsInt());
            md.setDt(obj.get("list").getAsJsonArray().get(i).getAsJsonObject().get("dt").getAsInt());

            a.add(md);
        }
    }
    
    //Μέθοδος που διαβάζει τo JSON file για την πρόγνωση από το όρισμα id που είναι ο κωδικός της πόλης. Δημιουργεί αντικείμανα MeteoData και τα περνάει στις ArrayLists που δίνονται στο όρισμα
    public void fillArrayListForecast(ArrayList <MeteoData>a, int id) {
        
        String j = URLReader.callURL("http://api.openweathermap.org/data/2.5/forecast?id="+id+"&appid=0824de274b24b37fe7eb81bc547f7a7c&units=metric");
        JsonObject obj = new JsonParser().parse(j).getAsJsonObject();       
                
        for(int l=0; l<obj.get("list").getAsJsonArray().size(); l++) {
            
            MeteoData md = new MeteoData();
            md.setCity_name(CityIndex.getCityNameFromCode(id));
            md.setMain_temp(obj.get("list").getAsJsonArray().get(l).getAsJsonObject().get("main").getAsJsonObject().get("temp").getAsDouble());
            md.setWeather_description(obj.get("list").getAsJsonArray().get(l).getAsJsonObject().get("weather").getAsJsonArray().get(0).getAsJsonObject().get("description").getAsString());
            md.setClouds_all(obj.get("list").getAsJsonArray().get(l).getAsJsonObject().get("clouds").getAsJsonObject().get("all").getAsInt());
            md.setWind_speed(obj.get("list").getAsJsonArray().get(l).getAsJsonObject().get("wind").getAsJsonObject().get("speed").getAsDouble());
            md.setId(obj.get("city").getAsJsonObject().get("id").getAsInt());
            md.setDt(obj.get("list").getAsJsonArray().get(l).getAsJsonObject().get("dt").getAsInt());
            try{
                obj.get("list").getAsJsonArray().get(l).getAsJsonObject().get("rain").getAsJsonObject().get("3h").getAsDouble();
                md.setRain(obj.get("list").getAsJsonArray().get(l).getAsJsonObject().get("rain").getAsJsonObject().get("3h").getAsDouble());
            }catch(NullPointerException nullPointer){
                md.setRain(0);
            }
            try{
                obj.get("list").getAsJsonArray().get(l).getAsJsonObject().get("snow").getAsJsonObject().get("3h").getAsDouble();
                md.setSnow(obj.get("list").getAsJsonArray().get(l).getAsJsonObject().get("snow").getAsJsonObject().get("3h").getAsDouble());
             }catch(NullPointerException nullPointer){
                md.setSnow(0);
            }
                
            a.add(md);
        }
        
    }
}
