// package Inheritance;

import java.util.Scanner;

import VehicleMain.Vehicle;

public class VehicleUse {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        Vehicle2 v = new Vehicle2(10);
        v.print();
        
        Car2 c = new Car2(2, 5, 20);
        c.print();

        Vehicle2 v2 = new Car2(5, 10, 40);
        v2.maxSpeed = 150;
        // Compile-Time Polymorphism : we can access base class specific properties and properties implemented by both base and sub-class;
        // v2.numDoors;

        // Run-Time Polymorphism; call car's print method since v is referring to Car;
        v2.print();

        Vehicle2 v3;
        if(n == 5){
            v3 = new Car2(1, 2, 3);
        }
        else{
            v3 = new Vehicle2(10);
        }
        System.out.println(v3.maxSpeed);
        // v3.numDoors=10;
        v3.print();

        // Class Cast 
        // May give error at run-time if care is not taken while casting
        Vehicle2 v4 = new Car2(1, 2, 3);
        Car2 c2 = (Car2) new Vehicle2(2);

        Vehicle2 v5 = new Car2(1, 2, 3);
        Car2 c3 = (Car2) v5;

    }
}
