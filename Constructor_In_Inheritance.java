class Base1{
    Base1(){
        System.out.println("I am a Constructor of Base class");
    }
    Base1(int x){
        System.out.println("The value of x is in Base class is "+x);
    }
    public void PrintBase(){
         System.out.println("Hey, I am Printer of Base1");
    }
}
class Derived1 extends Base1{
    Derived1(){
        //super(0);
        super();
        System.out.println("I am a Default Constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println(" The value of X is : "+x);
        System.out.println(" The value of X is : "+y);
    }
    public void PrintDerived(){
        System.out.println("Hey, I am Printer of Derived1");
   }
}
class childDerived1 extends Derived1{
    childDerived1(){
        //super(0);
        super();
        System.out.println("I am a Default Constructor");
    }
    childDerived1(int x,int y,int z){
        super(x,y);   // This is a reference variable used to pass quick reference.
        System.out.println(" The value of X is : "+x);
        System.out.println(" The value of X is : "+y);
        System.out.println(" The value of X is : "+z);
    }
    public void PrintchildDerived(){
        System.out.println("Hey, I am Printer of childDerived ");
   }
}
public class Constructor_In_Inheritance {
        public static void main(String[] args) {


            // calling base class using 
           //   Base1 b1 = new Base1(); // here constructor is Automatically invoked
           //   b1.PrintBase();

           System.out.println("");
            // Calling with Derived Class
            Derived1 d1 = new Derived1(23,10);
           d1.PrintDerived();
             
           System.out.println("\n");
            // calling childDerived Constructor
            childDerived1 d2 = new childDerived1(23,10,55);
            d2.PrintchildDerived();

            
        }
}
