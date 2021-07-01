package isp.lab4.exercise1;

//import isp.lab4.exercise0.CarAlarm; //NU ASA

public class Exercise1 {

    public static void main(String[] args) {
        //instantiati obiect
        TemperatureSensor mare;
        mare=new TemperatureSensor(40, "Casa");
        System.out.println(mare.toString());
        System.out.println(mare.getValue() + " " + mare.getLocation());
    }
}
