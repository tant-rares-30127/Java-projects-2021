
package isp.lab9.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 
class Observable {
 
   private List<Observer> observers = new ArrayList<Observer>();
 
   public void changeState(String type, int value) {
      notifyAllObservers(type, value);
   }
 
   public void register(Observer observer) {
      observers.add(observer);		
   }
 
   private void notifyAllObservers(String type, int value) {
      for (Observer observer : observers) {
         observer.update(type, value);
      }
   } 	
}
 
interface Observer {
   public abstract void update(String type, int value);
}
 
//usage example
 
class TemperatureSensor extends Observable{
    public void readSensor(){
        Random rand = new Random();
        int randomNumber=rand.nextInt(100);
        this.changeState("Temperature", randomNumber);
    }
}

class HumiditySensor extends Observable{
    public void readSensor(){
        Random rand = new Random();
        int randomNumber=rand.nextInt(100);
        this.changeState("Humidity", randomNumber);
    }
}

class PressureSensor extends Observable{
    public void readSensor(){
        Random rand = new Random();
        int randomNumber=rand.nextInt(100);
        this.changeState("Pressure", randomNumber);
    }
}

class Controller implements Observer{

    @Override
    public void update(String type, int value) {
        System.out.println("Received event: Event type:"+type+" Event value:"+value);
    }
    
}