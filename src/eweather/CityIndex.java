package eweather;

public class CityIndex {

    public CityIndex() {
    }
       
    public static int getCityCode(int c) {
        
        switch (c) {
            case 0:
                return 264371;
            case 1:
                return 734077;
            case 2:
                return 8133690;
            case 3:
                return 8133786;
            default:
                return 261745;
        }
    }
 
    public static String getCityName(int n) {
        
        switch(n) {
            case 0:
                return "Athens";
            case 1:
                return "Thessaloniki";
            case 2:
                return "Patra";
            case 3:
                return "Larisa";
            default:
                return "Heraklion";
        }
    }
    
    public static String getCityNameFromCode(int n) {
        
        switch (n) {
            case 264371:
                return "Athens";
            case 734077:
                return "Thessaloniki";
            case 8133690:
                return "Patra";
            case 8133786:
                return "Larisa";
            default:
                return "Heraklion";
        }
    }
}
