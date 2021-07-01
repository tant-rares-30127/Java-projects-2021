package isp.lab3.exercise3;

import java.util.Objects;

public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuelType;
    static int count;
    
    public Vehicle(String mod, String tip, int vit, char comb ){
        this.model=mod;
        this.type=tip;
        this.speed=vit;
        this.fuelType=comb;
    }
    
    public static void numberOfVehicles(){
        System.out.println("The number of Vehicles are:"+count);
    }
    
    @Override
    public String toString() {
        return "Vehicle{" + "model=" + model + ", type=" + type + ", speed=" + speed + ", fuelType=" + fuelType + '}';
    }
    
     public static void main(String[] args) {
         Vehicle v1=new Vehicle("Dacia", "Logan", 160, 'B');
         v1.count++;
         Vehicle v2=new Vehicle("Mercedes-Benz", "E250", 280, 'D');
         v2.count++;
         if (v1.equals(v2)) System.out.println("Equal vehicles");
         else System.out.println("Not equal vehicles");
         v2.numberOfVehicles();
         
     }
}
