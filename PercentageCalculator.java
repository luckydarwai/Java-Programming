import java.util.Scanner;

/*
Write a program to calculate the percentage of a given student in the CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)

*/
public class PercentageCalculator {
    public static void main(String[] args) {

        float maths;
        float physics;
        float chemistry;
        float hindi;
        float english;
        float total;
        float avg;

        Scanner Scan = new Scanner(System.in);
        System.out.println("****Welcome to our CBSC Marks Get percentege Calculator****");
        System.out.println("Enter the Marks of Maths : ");
        maths = Scan.nextFloat();
        System.out.println("Enter the Marks of Physics : ");
        physics = Scan.nextFloat();
        System.out.println("Enter the Marks of chemistry : ");
        chemistry = Scan.nextFloat();
        System.out.println("Enter the Marks of Hindi : ");
        hindi = Scan.nextFloat();
        System.out.println("Enter the Marks of English : ");
        english = Scan.nextFloat();
        total = maths + physics + chemistry + hindi + english;
        System.out.println("The total marks of Student is : " + total);

        avg = (total / 500) * 100;
        System.out.println("The average of the student is :" + avg);
        System.out.println("\t\t🙌Thankyou🙌 :");
        Scan.close();
    }
}
