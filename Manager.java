public class Manager extends Person{
    private static int count = 0;

    public Manager(){
        super();
    }

    @Override
    public void run(){
        //if switch state is true/on
        if(Switch.getState()){
            //increase the count of prisoners who turned on the light
            count++;
            //set switch state to off
            Switch.setState();
            System.out.println("Manager turned light off");
        } else {
            //if off do nothing
            System.out.println("Manager did nothing because the light was off");
        }  

        //check to see if all prisoners flipped the switch
        if(checkCount()){
            //if yes then switch the switch to signify the test is over
            Switch.setState();
            setStatus();
            System.out.println("Manager is done working");
            return;
        }
    }
    
    //checks the count if all prisoners flipped the light
    //there should be 99 people who did but if we are including the last 
    //switch the manager flipped then it would be 100 people
    public static boolean checkCount(){
        if(count >= 99) return true;
        return false;
    }

}