class __Circle{
    public int radius;
    __Circle(){
        System.out.println("I am non param of circle");
    }
    __Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends __Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);   // This keyword is used to passed quick refrence in a parent class.
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Area_circle_cylinder {
    public static void main(String[] args) {
        // Problem 1
        // Circle objC = new Circle(12);
        Cylinder1 obj = new Cylinder1(12, 4);
        System.out.println(obj.area());
        System.out.println(obj.volume());
}
}
