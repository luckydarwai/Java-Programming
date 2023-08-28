/**
 * AbstractClass
 */
// IN Abstract class with the Abstract method as well as other method both are allow but in Interfaces only declared abstract method. 
  abstract class Daddy{
      
    Daddy(){
        System.out.println("I, am your daddy....");
    }
    void SayHello(){
        System.out.println("Good Morning....");
    }
    abstract public void greet();
    abstract public void greet2();
     
 }

 class Beta extends Daddy{
     Beta(){
         System.out.println("I, am Class Beta Constructor");
     }
     @Override
     public void greet() {
        System.out.println("Good Afternoon Dear....");
         
     }
     @Override
     public void greet2(){
         System.out.println("Good Evening Dear....");
     }
 }

 abstract class Beta2 extends Daddy{
     public void gk(){
         System.out.println("okkkkk....");
     }

 }
public class AbstractClass {

    public static void main(String[] args) {

        // Daddy D = new Daddy();    // We cannot create a object of Super class because that is abstract class.
        
        Beta B = new Beta();
        B.SayHello();
        B.greet();
        B.greet2();
         

        // Beta2 B2 = new Beta2();  // we cannot access abstract class without using another class.
        
    }
}