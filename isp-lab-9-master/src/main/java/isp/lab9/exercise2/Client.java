
package isp.lab9.exercise2;

public class Client {
    public static void main(String[] args) throws InterruptedException{
        TemperatureSensor tempSens = new TemperatureSensor();
        HumiditySensor humidSens = new HumiditySensor();
        PressureSensor pressSens = new PressureSensor();
        Controller controller = new Controller();
        
        tempSens.register(controller);
        humidSens.register(controller);
        pressSens.register(controller);
        
        tempSens.readSensor();
        Thread.sleep(5000);
        humidSens.readSensor();
        Thread.sleep(5000);
        pressSens.readSensor();
    }
}
