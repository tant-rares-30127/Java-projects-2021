/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab4.exercise2;

/**
 *
 * @author Rares
 */
public class FireAlarm {
    private boolean active;

    public FireAlarm(boolean active) {
        this.active = active;
    }

    public boolean isActive(){
        if (this.active)return true;
        else return false;
      
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "FireAlarm{" + "active=" + active + '}';
    }
    
}
