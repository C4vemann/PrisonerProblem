public class Prisoner extends Person{

    public Prisoner(){
        super();
    }

    @Override
    public void run(){
        //if the prisoner had already switched the light on then do nothing
        if(getStatus()){
            System.out.println("Prisoner did nothing because they already switched the light");
            return;
        }
        //if the switch has already been turned on by another prisoner do nothing
        if(Switch.getState()){
            System.out.println("Prisoner did nothing because the light was already on");
        } else {
            //if the switch hadn't been turned on then turn on the light
            Switch.setState();
            setStatus();
            System.out.println("Prisoner turned light on");
        }
    }
    
}