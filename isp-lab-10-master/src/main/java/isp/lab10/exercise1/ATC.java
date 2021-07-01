
package isp.lab10.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATC{
    
    List<Aircraft> aircraftList=new ArrayList<>();
    
    public void addAircraft(String id){
        Aircraft aircraft=new Aircraft(id);
        aircraftList.add(aircraft);
        aircraft.start();
    }
    
    public void sendCommand(String aircraftId, AtcCommand cmd){
        Aircraft aircraft=aircraftList.stream().filter(aircraftName -> aircraftName.getAircraftId().equals(aircraftId)).findAny().orElse(null);
        if (aircraft == null) System.out.println("Invalid ID");
        else{
            if (cmd.getClass().getCanonicalName().contains("TakeoffCommand")){
                System.out.print("Insert the altitude ");
                Scanner in = new Scanner(System.in);
                int altitude=in.nextInt();
                aircraft.setAltitude(altitude);
            }
            aircraft.receiveAtcMessage(cmd);
        }
    }
    
    public void showAircrafts(){
        for (Aircraft aircraft: aircraftList){
            System.out.println(aircraft.toString());
        }
    }
}
