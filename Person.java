public class Person{
    private boolean flippedSwitch;

    public Person(){
        flippedSwitch = false;
    }

    public boolean getStatus(){
        return flippedSwitch;
    }

    public void setStatus(){
        flippedSwitch = (flippedSwitch) ? false : true;
    }
    
    public void print(){
        System.out.println(flippedSwitch);
    }

}