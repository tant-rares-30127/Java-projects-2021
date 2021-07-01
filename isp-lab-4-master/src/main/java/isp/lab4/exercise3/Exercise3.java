package isp.lab4.exercise3;

public class Exercise3 {
    public static void main (String[] args){
        TemperatureSensor s1=new TemperatureSensor(25,"casa");
        FireAlarm a1=new FireAlarm(false);
        Controler controler=new Controler(s1, a1);
        controler.controlStep();
        TemperatureSensor s2=new TemperatureSensor(60,"casa");
        Controler controler2=new Controler(s2, a1);
        controler2.controlStep();
    }
}
