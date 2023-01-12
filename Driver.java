import java.util.ArrayList;
import java.util.Random;

public class Driver{
    public static void main(String[] args){
        int day = 0;
        Random rand = new Random();
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Manager());
        for(int i = 0; i < 99; i++){
            list.add(new Prisoner());
        }

        while(!list.get(0).getStatus()){
            System.out.print("Day " + day + ": ");
            int index = rand.nextInt(100);
            list.get(index).run();
            day++;
        }
    }
    
}