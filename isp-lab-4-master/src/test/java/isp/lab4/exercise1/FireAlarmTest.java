/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab4.exercise1;

import org.junit.Test;

import isp.lab4.exercise2.FireAlarm;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Rares
 */
public class FireAlarmTest {
    @Test
    public void testePornita() {
        FireAlarm alarma=new FireAlarm(true);
        assertEquals("E pornita", true, alarma.isActive());
        alarma.setActive(false);
        assertEquals("E oprita", false, alarma.isActive());
    }
    
}
