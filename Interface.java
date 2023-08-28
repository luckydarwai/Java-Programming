
/**
 * Interface
 */
interface Bicycle{

    void applyBreak(int decrement);
    void speedUp(int increment);
}
class Avoncycle implements Bicycle{
    public void applyBreak(int decrement){
        System.out.println("Applying  Break..."+decrement+" stop");
    }
    public void speedUp(int increment){
        System.out.println("Applying  Speed..."+increment+" km/h");
       
    }
}


 public class Interface {

    public static void main(String[] args) {
        Avoncycle a = new Avoncycle();
       a.applyBreak(3);
       a.speedUp(30);
        

    }
}