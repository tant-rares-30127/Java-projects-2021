package isp.lab8.carparkaccess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarParkingAccessApp {
    public static void main(String[] args) throws Exception {
        
        
        Car car1=new Car("1234");
        Car car2=new Car("1235");
        Car car3=new Car("1236");
        Car car4=new Car("1239");
        Car car5=new Car("2239");
        
        List<Car> carList=new ArrayList<>(Collections.nCopies(10, null));

        carList.set(3,car1);
        carList.set(1,car2);
        carList.set(6,car3);
        carList.set(8,car4);
        
        DriverCarAccess park=new DriverCarAccess(carList, "Park_folder");
        
        park.enterCar(car5);
        park.viewCurrentParkedCars();
        
        park.exitCar(car3);
        park.viewCurrentParkedCars();
        
        park.viewPastEntries();
        System.out.println("It works!");
    }
    
}




