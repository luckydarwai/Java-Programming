

class theCircle{
      public  int radius;
      
     void setRadius(int radius){
        this.radius = radius;
     }
      public double getCircleArea(){
         return Math.PI *radius *radius;

     }
     
}
class theCylinder extends theCircle{
    public int height;
     public void setheight(int height){
                   this.height  =  height;
     }
      double getCylinderArea(){
          return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
      }

}
public class PracticeSet10 {
    public static void main(String[] args) {

        // Create a class circle and use inheritance to create another class cylinder
        // from 
        
        // Creating Super class object
        theCircle circle = new theCircle();
        circle.setRadius(4);
        System.out.println(circle.getCircleArea());

        // creating sub class object
        theCylinder cylinder = new theCylinder();
        cylinder.setRadius(4);
        cylinder.setheight(4);
        System.out.println(cylinder.getCylinderArea());
        // Create a class rectangle and use inheritance to create another class cuboid,
        // try to keep it as close to the real-world scenario as possible
        // this have also created in my earlier codes
        // Create a method for area and volume in 1
        // create methods for area & volume in 2 also create getters and setters
        // What is the order of constructor execution for the following inheritance
        // hierarchy
        // Base
        
        // Derived 1
        // Derived 2
        
        // Derived obj = new Derived 2( );
        // Which constructor(s) will be executed & in what order?
        // this have also created in my earlier codes
    }
}
