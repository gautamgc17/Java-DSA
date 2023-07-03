package Interfaces;

// An interface is pure abstract class with abstract and static data members;
// An interface can extend another interaface;
// A class can extend only 1 class but implement many interfaces;
// A class implementing an interface can either declare itself as abstract or implement all its methods.
public class Cars extends Vehicles implements VehicleInterface, ExtraInterface{
    
    public int getMaxSpeed(){
        return 10;
    }

    public void print(){
        System.out.println("Interface");
    }

    public int getModel(){
        return 2;
    }

    public boolean isGearable(){
        return true;
    }

    public String random(){
        return "Interface";
    }
}
