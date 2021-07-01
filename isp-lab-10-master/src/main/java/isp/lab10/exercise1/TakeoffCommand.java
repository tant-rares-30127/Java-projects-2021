
package isp.lab10.exercise1;

public class TakeoffCommand extends AtcCommand {
    
    private int altitudute;

    @Override
    public void execute(int altitude, Aircraft aircraft) {
        aircraft.notify();
    }

    
}
