// inheritance
public class Car extends Vehicle{
    int numDoors;

    // method over-riding;
    @Override
    public void print(){
        // refer to parent class
        super.print();
        super.setColor("Purple");
        super.maxSpeed = 100;
        System.out.println("Car: " + getColor() + " " + maxSpeed + " " + numDoors);
    }
}
