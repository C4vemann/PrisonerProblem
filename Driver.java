import java.util.ArrayList;
import java.util.Random;

public class Driver{
    public static void main(String[] args){
        int turn = 0;
        Random rand = new Random();
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Manager());
        for(int i = 0; i < 99; i++){
            list.add(new Prisoner());
        }

        Manager manager1 = (Manager) list.get(0);
        while(manager1.getState() == false){
            System.out.print("Turn: " + turn + "; ");
            int index = rand.nextInt(100);

            if(list.get(index) instanceof Manager){
                Manager manager2 = (Manager) list.get(index);
                manager2.run();
            } else if(list.get(index) instanceof Prisoner){
                Prisoner prisoner = (Prisoner) list.get(index);
                prisoner.run();
            } else {
                System.out.println("ELSE???");
            }
            turn++;
        }
    }
}