
package isp.lab10.exercise1;

public class LandCommand extends AtcCommand{

    @Override
    public void execute(int altitude, Aircraft aircraft) {
        aircraft.notify();
    }
    
}
