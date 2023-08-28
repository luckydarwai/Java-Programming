class cylinder {
    private int radius;
    private int height;

    cylinder(int radius, int height) { // Creating constructor

        this.radius = radius;
        this.height = height;
    }

    public void setRadius(int radius) { // creating Seteers with an arguments
        this.radius = radius;
    }

    public int getRadius() { // Creating Getters its take no agruments

        return radius;
    }

    public void setHeight(int height) { // creating Seteers with an arguments
        this.height = height;
    }

    public int getHeight() { // Creating Getters its take no agruments

        return height;
    }

    // A=2πrh+2πr2
    public double surface() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }
    // v = PI*r*r*h
    public double volume(){
        return (Math.PI*radius*radius*height);
    }
    public double sphereVolume(){
        return (4/3*Math.PI)*(radius*radius*radius);
    }
}

class Rectangle1{
    private int length;
    private int breadth;

       Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }

    Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
}
public class PracticeSet09_OOPM {
    public static void main(String[] args) {
        // 1 create a class cylinder and use getter and setters to set its radius and
        // height
        cylinder cy = new cylinder(2, 3);
        // get value by constructor invoking
        System.out.println(cy.getRadius());
        System.out.println(cy.getHeight());
        System.out.println(cy.surface());
        System.out.println(cy.volume());

        System.out.println("\n");
        // by passing an arguments
        cy.setHeight(4);
        cy.setRadius(5);
        System.out.println(cy.getRadius());
        System.out.println(cy.getHeight());
        
        //2 use 1 to calculate surface and volume of the cylinder
        System.out.println(cy.surface());
        System.out.println(cy.volume());
        
        //3 Use a constructor and repeat 1
        // this also done is 1 and as well as using constructor
        
        
        System.out.println("\n"); 
        //4 Overload a constructor used to initialize a rectangle of length and breath 5
        // for using custom parameters
        System.out.println("Ractangle ....");
        Rectangle1 r = new Rectangle1(6, 7);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        
        System.out.println("\n");
        // Repeat 1 for a sphere
        System.out.println("Sphere volue is .......");
        System.out.println(cy.sphereVolume());
        
    }
}
