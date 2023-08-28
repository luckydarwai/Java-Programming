/**
 * MehodeOverriding
 */

 class A {
     public void greet(){
         System.out.println("Good Afternoom");
     }
 }
 class B  extends A{

    @Override
     public void greet(){
         System.out.println("Good Evening");
     }
 }
public class MehodeOverriding {

    public static void main(String[] args) {

       //  Calling class A's method
           A a= new A();
           a.greet();

      System.out.println("");

       //  Calling class B's method
        B b = new B();
        b.greet();
        
    }
}