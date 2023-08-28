interface Animal{

    // Default Method in java interface
    default void say(){
        System.out.println("HEllo, this is default mathod ");
    }
    void bark();
}
 
class Tom implements Animal{
    public void bark(){
        System.out.println("Dog barks!");
    }
} 

public class DefaultMethod_interface {
    public static void main(String[] args) {
        
        Tom t = new Tom();
        t.bark();
        t.say();
    }
}
