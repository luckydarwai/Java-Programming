

// abstract class pen{
//    abstract void write();
//    abstract void refill();   
// }
//  class batter extends pen{
//     void write(){
//         System.out.println("Writing........");
//     }
//     void refill(){
//         System.out.println("refill.......");
//     }
//     void nib(){
//         System.out.println("change the nib........... ");
//     }
// }

// class Monkey{
//     void jump(){
//         System.out.println("Jumping........");
//     }
//     void bite(){
//         System.out.println("Bite......");
//     }
// }

// interface BasicAnimal{
//     void eat();
//     void sleep();
// }

// class Human extends Monkey implements BasicAnimal{
//     void speak(){
//         System.out.println("Hello sir!");
//     }

//     @Override         // this is a notation
//     public void eat() {
//         System.out.println("Eating");
//     }

//     @Override
//     public void sleep() {
//         System.out.println("Sleeping");
//     }
// }

 class telephone{

    telephone(){
        System.out.println(" i  am a telephone's Constructor");
    }
    void say(){
     System.out.println("Good morning ");
 }
}

class phone4 extends telephone{

     void lift(){System.out.println("lift");

    }
     void disconnected(){
        System.out.println("disconnected");
    }
   
}


public class PracticeSet11 {
    public static void main(String[] args) {
        //1   Create an abstract class pen with methods write () and refill () as abstract
        // methods
    //   batter btr = new batter();
    //      btr.write();
    //      btr.refill();
         
         //2   Use the pen class from Q1 to create a concrete class batter pen with
         // additional method change Nib ()
        //   btr.nib();

          
          
          // 3  Create a class monkey with jump ( ) and bite ( ) methods Create a class human
          // whichinherits this monkey class and implements basicanimal interface with eat
          // ( ) and sleep methods
          
        //   Human human = new Human();
        //   human.speak();
        //   human.sleep();
        //   human.eat();
        


        // Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as
        // abstract methods create another class smart telephone and demonstrate
        // polymorphism
        


        telephone t1 = new phone4();  // polymorphism

        t1.say();
        
       phone4 t2 = new phone4();
                                                                                                            
     t2.lift();
     t2.disconnected();
        // Demonstrate polymorphism using using monkey class from Q3
        

        
        // Create an interface TVremote and use it to inherit another interface smart
        // TVremote
        
        
        
        // Create a class TV which implements TVremote interface from Q6
    }
}
