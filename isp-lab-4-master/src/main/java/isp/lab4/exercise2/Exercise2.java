package isp.lab4.exercise2;

public class Exercise2 {
    public static void main (String[] args){
        FireAlarm alarma1=new FireAlarm(true);
        
        System.out.println(alarma1.toString());
        if (alarma1.isActive()) System.out.println("Is active");
        else System.out.println("Isn't active");
        
        alarma1.setActive(false);
        System.out.println(alarma1.toString());
        if (alarma1.isActive()) System.out.println("Is active");
        else System.out.println("Isn't active");
        
    }
}
