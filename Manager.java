public class Manager extends Person{
    private static int count = 0;
    private boolean state = false;
    
    public Manager(){
        super();
    }

    public void run(){
        if(checkCount() == false){
            flipLightSwitch();
            return;
        } 
        state = true;
        System.out.println("Manager is done working");
    }
    
    public void flipLightSwitch(){
        if(Switch.getState() == false){
            System.out.println("Manager did nothing because the light was off");
            return;
        }
        Switch.setState();
        count++;
        System.out.println("Manager turned light off");
        return;
    }
    
    public static boolean checkCount(){
        if(count == 99) return true;
        return false;
    }

    public boolean getState(){
        return state;
    }

}