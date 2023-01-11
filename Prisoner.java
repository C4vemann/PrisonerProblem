public class Prisoner extends Person{

    public Prisoner(){
        super();
    }

    public void run(){
        flipLightSwitch();
    }

    public void flipLightSwitch(){
        if(getStatus()){
            System.out.println("Prisoner did nothing because they already switched the light");
            return;
        }
        if(Switch.getState()){
            System.out.println("Prisoner did nothing because the light was already on");
            return;
        }
        Switch.setState();
        setStatus();
        System.out.println("Prisoner turned light on");
        return;
    }

}