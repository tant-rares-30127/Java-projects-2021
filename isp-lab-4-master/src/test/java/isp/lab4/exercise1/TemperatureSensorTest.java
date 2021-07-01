package isp.lab4.exercise1;

import org.junit.Test;

import isp.lab4.exercise1.TemperatureSensor;

import static org.junit.Assert.assertEquals;

public class TemperatureSensorTest {
    //implement minimal tests
    @Test
    public void testgetValueandgetLocation() {
        TemperatureSensor sensor1=new TemperatureSensor(5, "cladire");
        assertEquals("Marimea", 5, sensor1.getValue());
        assertEquals("Locatia", "cladire", sensor1.getLocation());
    }
}
