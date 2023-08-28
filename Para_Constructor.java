
class Lucky1 {
    Lucky1(int id, String name) { // This is Parameterized constructor its takes paremeters and constructor have
                                 // not
        // any return type and it is automatically invoked when we create object

        System.out.println("Id is " + id);
        System.out.println("Name is " + name);
    }
}

public class Para_Constructor {
    public static void main(String[] args) {
        Lucky1 lucky = new  Lucky1(45,"Lalit");
        System.out.println(lucky);
        

    }
}
