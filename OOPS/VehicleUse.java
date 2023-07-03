import VehicleMain.Vehicle;

public class VehicleUse {
    public static void main(String[] args){
        Vehicle v = new Vehicle();
        v.setColor("Black");
        v.print();

        Car c = new Car();
        c.setColor("Red");
        c.numDoors = 2;
        c.print();
    }
}
