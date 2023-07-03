package Generics;

public class Vehicle implements PrintInterface {
    protected String color;
    int maxSpeed;

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void print(){
        System.out.println("Vehicle: " + color + " " + maxSpeed);
    }
}

