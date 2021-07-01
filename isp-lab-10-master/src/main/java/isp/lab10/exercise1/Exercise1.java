package isp.lab10.exercise1;

import java.util.Scanner;

public class Exercise1 extends Thread {

    public static void main(String[] args) throws InterruptedException {
        ATC control=new ATC();
        boolean operating=true;
        
        while (operating){
            System.out.println("Chose aircraft action:");
            System.out.println("Insert 1 for adding new aircraft");
            System.out.println("Insert 2 to see all aircrafts");
            System.out.println("Insert 3 if you want the aircraft to take off");
            System.out.println("Insert 4 if you want the aircraft to land");
            System.out.println("Insert 5 to close the controller");
            Scanner in = new Scanner(System.in);
            int command=in.nextInt();
            switch(command){
                case 1:{
                    System.out.print("Insert the aircraft ID");
                    String id=in.nextLine();
                    id=in.nextLine();
                    control.addAircraft(id);
                    break;
                }
                case 2:{
                    control.showAircrafts();
                    break;
                }
                case 3:{
                    TakeoffCommand com=new TakeoffCommand();
                    System.out.print("Insert the aircraft ID");
                    String id=in.nextLine();
                    id=in.nextLine();
                    control.sendCommand(id, com);
                    break;
                }
                case 4:{
                    LandCommand com=new LandCommand();
                    System.out.print("Insert the aircraft ID");
                    String id=in.nextLine();
                    id=in.nextLine();
                    control.sendCommand(id, com);
                    break;
                }
                case 5:{
                    operating=false;
                    break;
                }
            }
        }
        return;

    }
}
