// package Inheritance;

public class Vehicle2 {
    private String color;
    protected int maxSpeed;

    public Vehicle2(int maxSpeed){
        System.out.println("Vehicle Constructor");
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void print(){
        System.out.println("Vehicle:" + color + "  " + maxSpeed);
    }
}
