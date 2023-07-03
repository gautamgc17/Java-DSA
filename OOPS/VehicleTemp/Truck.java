package VehicleTemp;

import VehicleMain.Vehicle;

public class Truck extends Vehicle {
    int numCapacity;

    public void print(){
        System.out.println(getColor() + " " + maxSpeed +  " " + numCapacity);
    }
}
