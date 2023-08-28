class Base{
    public int x;
     
    public void setDatax(int x){
        this.x=x;
    }
    public int getDatax(){
        return x;
    }
    public void printData(){

        System.out.println("The value of x is :"+x);

    }
}
class Derived  extends Base{
    public int y;
    public void setDatay(int y){
        this.y=y;
    }
    public int getDatay(){
        return y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("This Program for inheritance code....");
           
        System.out.println("\n");
        // Creating an object of base class
        // Base b = new Base();
        // b.setDatax(8);
        // System.out.println(b.getDatax());
     
     
        
        System.out.println("\n");
        // Creating an object of derived class
        // Derived d = new Derived();
        // d.setDatay(78);
        // System.out.println(d.getDatay());
        
        
        // We can access all the property of from base class to Derived class by the help of Derived class object. its easy to for us.
        Derived d = new Derived();
        d.setDatax(8);
        System.out.println(d.getDatax());
    }
}
