
package isp.lab8.carparkaccess;

import java.io.*;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Car implements Serializable {
    
    private String plateNumber;
    private LocalDateTime enterTime;
    private long cost;

    public Car(String plateNumber) {
        this.plateNumber = plateNumber;
        this.enterTime=LocalDateTime.now();
    }

    public long getCost(LocalDateTime exitTime){
        long cost=exitTime.toEpochSecond(ZoneOffset.UTC)-this.enterTime.toEpochSecond(ZoneOffset.UTC);
        return cost;
    }
    
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" + "plateNumber=" + plateNumber + ", enterTime=" + enterTime + ", cost=" + cost + '}';
    }

    
}
