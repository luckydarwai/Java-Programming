import java.util.Scanner;

public class Check_error {
    public static void main(String[] args) {

        // Syntax error
        // int a=5 // Syntax Error
        // int b=3;
        // System.out.println(a+b);



        // LOGICAL ERROR DEMO
        // Write a program to print all prime numbers between 1 to 10
        System.out.println("2");
        for (int i = 0; i < 5; i++) {
            System.out.println(2 * i + 1);  // Here 9 is a Logical error.
        }


        // Runtime Error
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();

        System.out.println(a/0);
        sc.close();
    }

}