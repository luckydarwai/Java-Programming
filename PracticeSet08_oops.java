class Employeee {
    int salary;
    String name;

    public int getsalary() {
        return salary;
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }

}

class Cellphone {
    public void ring() {
        System.out.println("Ringing the Phone");
    }

    public void vibrat() {
        System.out.println("Vibrating the Phone");
    }

    public void callfriend() {
        System.out.println("Calling Lalit......");
    }
}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class Rectangle {
    int length;
    int width;

    public int rectarea() {
        return length * width;
    }

    public int rectperimeter() {
        return 2 * (length + width);
    }

}

class Tommy {
    public void hit() {
        System.out.println("Hitting the enemy");
    }

    public void run() {
        System.out.println("Running from the enemy");
    }

    public void fire() {
        System.out.println("Firing on the enemy");
    }
}

class circle {
    int r;

    public double area() {
        return Math.PI * (r * r);
    }
    public double perimeter() {
        return 2*(Math.PI)*r;
    }
}

public class PracticeSet08_oops {
    public static void main(String[] args) {

        // 1. Create a class Employee with the following properties and methods:
        // a. Salary (property) (int)
        // b. getSalary (method returning int)
        // c. name (property) (String)
        // d. getName (method returning String)
        // e. setName (method changing name)

        Employeee emp1 = new Employeee();
        emp1.setname("Lucky");
        emp1.salary = 201060;

        System.out.println("Displaying Employoies Details....");
        System.out.println(emp1.getsalary());
        System.out.println(emp1.getname() + "\n");

        // 2. Create a class cellphone with methods to print ringing, vibrating…, etc.
        Cellphone mob = new Cellphone();
        System.out.println("Displaying Phones Details....");
        mob.ring();
        mob.vibrat();
        mob.callfriend();
        System.out.println("\n");

        // 3. Create a class Square with a method to initialize its side, calculating
        // area,
        // perimeter etc.

        Square sq = new Square();
        sq.side = 3;
        System.out.println("Displaying Squares Details....");
        System.out.println(sq.area());
        System.out.println(sq.perimeter() + "\n");

        // 4. Create a class Rectangle & problem 3.

        Rectangle A = new Rectangle();
        A.length = 2;
        A.width = 3;
        System.out.println("Displaying Rectangles Details....");
        System.out.println(A.rectarea());
        System.out.println(A.rectperimeter() + "\n");

        // 5. Create a class TommyVecetti for Rockstar Games capable of hitting (print
        // hitting…), running, firing, etc.
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

        // 6. Repeat problem 4 for a circle.
        circle ar = new circle();
        ar.r=2;
        System.out.println(ar.area());
        System.out.println(ar.perimeter());

    }
}
