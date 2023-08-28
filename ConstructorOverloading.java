class Lucky {
    Lucky(int id, String name) { // This is Parameterized constructor its takes paremeters and constructor have
                                 // not
        // any return type and it is automatically invoked when we create object

        System.out.println("Id is " + id);
        System.out.println("Name is " + name);
    }

    // overloading constructor
    Lucky(int a) {
        System.out.println("My Faviorite Number is : " + a);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Lucky ld1 = new Lucky(34, "Coder");
        Lucky ld2 = new Lucky(23);

        System.out.println("we can Easily Overload the constructor " + ld1 + ld2);
        // here we write this one -->(+ld1+ld2 ) only for avoiding the show warninng of
        // vs code and its not necessary to write here

    }
}
