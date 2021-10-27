package exercises;

public class SmartPhone implements GPS, Radio {
    
    /*
     * The smart phone should implement 2 features Radio, GPS 
     * The radio has 2 functions -to switch on the radio and -switch off the radio
     * The GPS has 3 functions  -to switch on the GPS, -switch off the GPS, -get location
     * You can fill in all these methods with a print statement about the performed functionalities
     */
    
    @Override
    public void switchRadioOn() {
        System.out.println("Turning radio on.");
    }
    
    @Override
    public void switchRadioOff() {
        System.out.println("Turning radio off.");
    }
    
    @Override
    public void switchGPSOn() {
        System.out.println("Turning GPS on");
    }
    
    @Override
    public void switchGPSOff() {
        System.out.println("Turning GPS off.");
    }
    
    @Override
    public void getLocation() {
        System.out.println("Getting the location now.");
    }
    
    

}
