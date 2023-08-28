import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter first Number :");
        int num1 = Sc.nextInt();
        System.out.println("Enter second Number :");
        int num2 = Sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is " + sum);
        Sc.close(); // for closing a Scanner class.
    }
}

// import java.util.Scanner; // this is for using a Scanner class becaue it's
// define in this.