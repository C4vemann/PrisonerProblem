public class Person{
    private boolean flippedSwitch;

    public Person(){
        flippedSwitch = false;
    }

    public void run(){}

    public boolean getStatus(){
        return flippedSwitch;
    }

    public void setStatus(){
        flippedSwitch = (flippedSwitch) ? false : true;
    }

}