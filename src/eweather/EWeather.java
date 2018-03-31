package eweather;

import gui.MainMenu;

public class EWeather {
    
    public static void main(String[] args) {
               
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
        
        Refresh ref = new Refresh();
        ref.fillArrayLists();
    }
}