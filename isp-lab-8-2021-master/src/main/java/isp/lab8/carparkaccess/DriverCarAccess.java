
package isp.lab8.carparkaccess;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DriverCarAccess {
    
    private List<Car> carList;
    private String file;

    public DriverCarAccess(List<Car> carList, String file) {
        this.carList = carList;
        this.file=file;
    }
    
    public void enterCar(Car car){
        if (isTheSameNumberPlate(car)){
            System.out.println("Access denied: same plate number found");
        }
        else{
            int parkingSpot=checkSpaceAvailability();
            if (parkingSpot==-1) System.out.println("Access denied: no available parking slots");
            else{
                System.out.println("Acces allowed on the spot: "+parkingSpot);
                carList.set(parkingSpot, car);
            }
        }
    }
    
    public int checkSpaceAvailability(){
        for (int i=0; i<carList.size(); i++){
            if (carList.get(i)==null){
                return i;
            }
        }
        return -1;
    }
    
    public boolean isTheSameNumberPlate(Car car){
        for (Car c: carList){
            if (c!=null)
                if (c.getPlateNumber().equals(car.getPlateNumber())) {
                    return true;
                }
        }
        return false;
    }
    
    public void exitCar(Car car){
        LocalDateTime exitTime=LocalDateTime.now();
        long cost=car.getCost(exitTime);
        car.setCost(cost);
        System.out.println("It will cost you:"+ cost);
        try {
            saveCar();
        } catch (IOException ex) {
            Logger.getLogger(DriverCarAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        carList.remove(car);
    }
    
    public void viewCurrentParkedCars(){
        System.out.println("Currently parked cars:");
        for (Car c: carList){
            if (c!=null)
                System.out.println(carList.indexOf(c)+1+". "+c.toString()+"with the cost of:"+c.getCost(LocalDateTime.now()));
        }
        System.out.println("Available spaces:");
        for (int i=0; i<carList.size(); i++){
            if (carList.get(i)==null)
                System.out.println(i+1);
        }
    }
    
    public void viewPastEntries(){
        try {
            System.out.println("Past entries:");
            List<Car> pastCarList=readCar();
            for (Car c: pastCarList){
                System.out.println(c.toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(DriverCarAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DriverCarAccess.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void saveCar() throws IOException{
        ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(file));
        o.writeObject(carList);
        o.close();
    }
    
    public List<Car> readCar() throws IOException, ClassNotFoundException{
        ObjectInputStream in=new ObjectInputStream(new FileInputStream(file));
        List<Car> pastCarList=(List<Car>)in.readObject();
        in.close();
        return pastCarList;
    } 
    
}
