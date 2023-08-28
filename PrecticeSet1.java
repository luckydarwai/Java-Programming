import java.util.Scanner;

/*
Write a program to sum three numbers in Java.
Write a program to calculate CGPA using marks of three subjects (out of 100)
Write a Java program that asks the user to enter his/her name and greets them with Hello "<name>", have a good day text.
Write a Java program to convert Kilometers to miles.
Write a Java program to detect whether a number entered by the user is an integer or not.
*/
public class PrecticeSet1 {
    public static void main(String[] args) {
// Answer 1
        int a = 4;
        int b = 5;
        int c = 1;
        int sum = a + b + c;
        System.out.println(sum);
// Answer 2
       float  sub1=99;
       float  sub2=92;
       float  sub3=96;
       float cgpa=(sub1+sub2+sub3)/30;
        System.out.println(" The average of these subjects is :"+cgpa);

// Answer 3
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = Sc.nextLine(); // for get full String
        System.out.println("Hello " + name + " ,have a good day dear ! Take care");
// Answer 4
        // For n number of km = (n × 0.62137119) miles
        System.out.println("Enter the kilometer you want to convert in miles ");
        float n = Sc.nextFloat();
        double miles = (n * 0.62137119);
        System.out.println("In " + n + " Kelometers = " + miles + " miles ");
// Answer 5
        System.out.println("Enter your number");
        System.out.println(Sc.hasNextInt()); // hasNextInt function is use to check weather the digit number or not
        Sc.close();
    }
}