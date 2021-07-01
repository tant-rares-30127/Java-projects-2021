package isp.lab7.safehome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoorLockController implements ControllerInterface{
    
    private Map<Tenant,AccessKey> validAccess=new HashMap<>(); 
    private Door door=new Door();
    private AccessLog accesslog;
    private int counter=0;

    public DoorLockController() {
    }

    @Override
    public DoorStatus enterPin(String pin) throws Exception {
        AccessKey key=new AccessKey(pin);

        if (pin.equals(MASTER_KEY)){
                    this.counter=0;
                    this.door.unlockDoor();
        }
        else    if (this.counter==2){
                this.door.lockDoor();
                throw new TooManyAttemptsException();
            }
            else{
                if(validAccess.values().stream().anyMatch(v -> v.getPin().equals(pin))){
                    if (this.door.getStatus().equals(DoorStatus.CLOSE)) this.door.unlockDoor();
                    else this.door.lockDoor();
                }
                else{
                    this.counter++;
                    throw new InvalidPinException();
                }
            }
        return this.door.getStatus();
    }

    @Override
    public void addTenant(String pin, String name) throws Exception {
        AccessKey key=new AccessKey(pin);
        Tenant tenant=new Tenant(name);
        
        if (this.validAccess.keySet().stream().anyMatch(k->k.getName().equals(name))) throw new TenantAlreadyExistsException();
        else this.validAccess.put(tenant, key);
    }

    @Override
    public void removeTenant(String name) throws Exception {
        Tenant tenant=new Tenant(name);
        
        if (this.validAccess.keySet().stream().noneMatch(k->k.getName().equals(name))) throw new TenantNotFoundException();
        else validAccess.keySet().stream()
                .filter(accessKey -> accessKey.getName().equals(name))
                .findFirst().ifPresent(validAccess::remove);
    
    }
    
    public List<AccessLog> getAccessLogs(){
        List<AccessLog> listAccessLog=new ArrayList<>();
        
        return listAccessLog;
    }
    
}
