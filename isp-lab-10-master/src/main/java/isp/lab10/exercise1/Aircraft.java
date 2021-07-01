
package isp.lab10.exercise1;

public class Aircraft extends Thread{
    private String aircraftId;
    private int altitude;
    private boolean isOnCruisingState;

    public Aircraft(String id) {
        this.aircraftId = id;    
        this.isOnCruisingState=false;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
    
    public synchronized void receiveAtcMessage(AtcCommand cmd){
        cmd.execute(altitude,this);
    }

    public String getAircraftId() {
        return aircraftId;
    }

    public boolean isIsOnCruisingState() {
        return isOnCruisingState;
    }
    
    @Override
    public String toString() {
        return "Aircraft{" + "id=" + aircraftId + '}';
    }

    public synchronized void run(){
        System.out.println("Aircraft{" + "id=" + aircraftId + "} is on stand");
        try {
            this.wait();
        } catch (InterruptedException ex) {
        }
        System.out.println("Aircraft{" + "id=" + aircraftId + "} is taxing");
        try {
            this.sleep(10*1000);
        } catch (InterruptedException ex) {
        }
        System.out.println("Aircraft{" + "id=" + aircraftId + "} is taking off");
        try {
            this.sleep(5*1000);
        } catch (InterruptedException ex) {
        }
        System.out.println("Aircraft{" + "id=" + aircraftId + "} is ascending");
        try {
            for(int i=1; i<=altitude; i++){
              System.out.println("Aircraft{" + "id=" + aircraftId + "} is ascending to "+(i*1000)+" meters");
              this.sleep(10*1000);  
            }
        } catch (InterruptedException ex) {
        }
        System.out.println("Aircraft{" + "id=" + aircraftId + "} is cruising");
        this.isOnCruisingState=true;
        Seconds seconds=new Seconds();
        try {
            this.wait();
        } catch (InterruptedException ex) {
        }
        int time=seconds.numberOfSeconds();
        System.out.println("Aircraft{" + "id=" + aircraftId + "} is descending");
        try {
            for(int i=1; i<=altitude; i++){
              System.out.println("Aircraft{" + "id=" + aircraftId + "} is descending to "+((altitude-i)*1000)+" meters");
              this.sleep(10*1000);  
            }
        } catch (InterruptedException ex) {
        }
        System.out.println("Aircraft{" + "id=" + aircraftId + "} landed, with a cruising time of "+time+" seconds");
    }
}

class Seconds{
    
    private final long seconds=System.currentTimeMillis();
    
    public int numberOfSeconds(){
        long seconds=System.currentTimeMillis(); 
        return (int)((seconds-this.seconds)/1000);
    }
    
}