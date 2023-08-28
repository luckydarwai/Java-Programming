// class thisKey{
//     int x;

// //    getter of x
//     public  int getX(){
//         return  x;
//     }

//     // Constructor with a parameter
//     thisKey(int x) {
//         this.x = x;
//     }

// }

class EkClass {

     int a;
    EkClass() {
        System.out.println("I am a Ek class Constructor ");
    }
    EkClass(int a){
        System.out.println("The Value of a is "+a);
    }

}
class DoClass extends EkClass{
    int b;
    DoClass(){
        System.out.println("I am Do Class Constructor");
    }

    DoClass(int a,int b){
        super(a);  // it's used to pass Quick Arguments from Derived class to base class.
        System.out.println("The value of a is "+a);
        System.out.println("The value of b is "+b);
    }

    void display(){
        System.out.println("I am a Display functon and i also Getters");
    }
}
public class Super_And_This_Keyword {

    // Call the constructor
    public static void main(String[] args) {

        // for this keyword.................
        // thisKey obj1 = new thisKey(65);
        // System.out.println(obj1.getX());


        // for super keyword...........
         DoClass d2 = new DoClass(10,17);

          d2.display();

    }

}
