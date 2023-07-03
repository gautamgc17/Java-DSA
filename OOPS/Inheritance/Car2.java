// package Inheritance;

public class Car2 extends Vehicle2{
    int numDoors;
    int maxSpeed;

    public Car2(int numDoors, int maxSpeed, int vehicleMaxSpeed){
        // explicitly make a call to parameterized constructor of the parent class
        super(vehicleMaxSpeed);
        System.out.println("Car Constructor");
        this.maxSpeed = maxSpeed;
        this.numDoors = numDoors;
    }
    
    public void print(){
        super.print();
        System.out.println("Car:" + numDoors + "  " + maxSpeed + "  " + super.maxSpeed);
    }

    public void printMaxSpeed(){
        super.maxSpeed = 200;
        System.out.println(maxSpeed + " - " + super.maxSpeed);
    }
}
