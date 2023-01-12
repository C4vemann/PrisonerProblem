public class Switch{
    private static boolean state = false;
    
    public static void setState(){
       state = (state) ? false : true;
    }

    public static boolean getState(){
        return state;
    }

}