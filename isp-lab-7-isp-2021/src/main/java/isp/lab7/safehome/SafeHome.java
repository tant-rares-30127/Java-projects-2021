package isp.lab7.safehome;

public class SafeHome {

    public static void main(String[] args) {
        
        DoorLockController ctrl=new DoorLockController();
        
        try{
            ctrl.addTenant("1234", "Rares");
            
        }
        catch (Exception ex){
            System.out.println(ex.getClass().getCanonicalName());
        }
       
        for (int i=0; i<2; i++){
            try{
            ctrl.enterPin("1222");
            }
        catch (Exception ex){
            System.out.println(ex.getClass().getCanonicalName());
        }
        }
        
        try{
            ctrl.enterPin("1222");
            }
        catch (Exception ex){
            System.out.println(ex.getClass().getCanonicalName());
        }
        
     }
}
