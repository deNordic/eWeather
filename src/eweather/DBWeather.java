package eweather;

import model.*;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBWeather {
    
    //Μεθοδος για την εισαγωγή δεδομένων του Καιρού τώρα και ανανέωσης
    public void insertWeather(ArrayList<MeteoData> w) {
        for (int i=0; i<5; i++) {
            
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("eWeatherPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
        
            Dbweathernow wndb = new Dbweathernow();
            
            wndb.setCityid(w.get(i).getId());
            wndb.setCityname(w.get(i).getCity_name());
            wndb.setWeatherDescription(w.get(i).getWeather_description());
            wndb.setTemp(w.get(i).getMain_temp());
            wndb.setClouds(w.get(i).getClouds_all());          
            wndb.setWindSpeed(w.get(i).getWind_speed());
            Date dt = new Date((long)w.get(i).getDt()*1000);
            wndb.setDt(dt);      
            em.persist(wndb);
            em.getTransaction().commit();
        
            em.close();
            emf.close();  
        }
    }
    
    //Μεθοδος για την εισαγωγή δεδομένων της Πρόβλεψης
    public void insertForecast(ArrayList<MeteoData> city){
        for(int i=0; i<40; i++) {
            
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("eWeatherPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            
            Dbforecast fdb = new Dbforecast();
            
            fdb.setCityid(city.get(i).getId());
            fdb.setCityName(city.get(i).getCity_name());
            fdb.setWeatherDescription(city.get(i).getWeather_description());
            fdb.setTemp(city.get(i).getMain_temp());
            fdb.setClouds(city.get(i).getClouds_all());
            fdb.setWindSpeed(city.get(i).getWind_speed());
            Date dateTime = new Date((long)city.get(i).getDt()*1000);
            fdb.setDt(dateTime);
            fdb.setRain(city.get(i).getRain());
            fdb.setSnow(city.get(i).getSnow());
        
            em.persist(fdb);
            em.getTransaction().commit();

            em.close();
            emf.close();   
        }
    }
}