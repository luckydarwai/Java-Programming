
class Lakki {
    Lakki() { // This is default constructor its takes no paremeters and constructor have not
              // any return type and it is automatically invoked when we create object
        System.out.println("Hello, User i am a Default Constructor!");
    }
}

public class Default_Construstor {
    public static void main(String[] args) {
    Lakki L1 = new Lakki(); // Constructor called automatically whenever we created a object . it's a
                                // Specialization of constructor it really helpfull for us .
        
        
                                System.out.println(L1); // This will print a Garabej collector because we don't have any arguments and we have a only Default constructor which is takes no arguments on this code.
    }
}
