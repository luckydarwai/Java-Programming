import java.util.Scanner;

public class Prectice_set4 {
    public static void main(String[] args) {
        // 1 What will be the output of this program:
        // int a = 10;
        // // if (a=11)
        // System.out.println("I am 11");
        // else
        // System.out.println("I am not 11"); // This will throw an error .

        /*
         * Question 2: Write a program to find out whether a student is pass or fail; if
         * it requires a total of 40% and at least 33% in each subject to pass. Assume 3
         * subjects and take marks as input from the user.
         */
        // byte m1;
        // byte m2;
        // byte m3;

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your marks in Mathematics");
        // m1 = sc.nextByte();
        // System.out.println("Enter your marks in Physics");
        // m2 = sc.nextByte();
        // System.out.println("Enter your marks in Chemistry");
        // m3 = sc.nextByte();

        // float avg = (m1 + m2 + m3) / 3.0f;
        // System.out.println("your total Average is : " + avg);

        // if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
        // System.out.println("Congraculation, you have been pass!");

        // } else {
        // System.out.println("Sorry, you have not been passed! try next time");

        // }

        // Question 3 :Calculate income tax paid by an employee to the government as per
        // the slabs mentioned below:

        // Income Slab Tax
        // 2.5L – 5.0L 5%
        // 5.0L – 10.0L 20%
        // Above 10.0L 30%
        // Note that there is not tax below 2.5L. Take the input amount as input from
        // // the user.
        // System.out.println("Enter Employee salary in per annum : ");
        // float income =sc.nextFloat() ;
        // float tax = 0;

        // if (income <= 2.5) {
        // tax = tax + 0;
        // } else if (income > 2.5 && income <= 5.0) {
        // tax = tax + 0.05f * (income - 2.5f);

        // } else if (income > 5 && income <= 10.0) {
        // tax = tax + 0.05f * (5.0f - 2.5f);
        // tax = tax + 0.2f * (income - 5f);
        // } else if (income > 10.0) {
        // tax = tax + 0.05f * (5.0f - 2.5f);
        // tax = tax + 0.2f * (10.0f - 5f);
        // tax = tax + 0.3f * (income - 10.0f);
        // }

        // System.out.println("The total tax paid by the employee is: " + tax);

        // Question 4: Write a Java program to find out the day of the week given the
        // number [1 for Monday, 2 for Tuesday … and so on!]
        // System.out.println("Enter Number to get dat !");
        // byte day=sc.nextByte();

        // switch(day){
        // case 1 -> System.out.println("Monday");
        // case 2 -> System.out.println("Tuesday");
        // case 3 -> System.out.println("Wednesday");
        // case 4 -> System.out.println("Thrusday");
        // case 5 -> System.out.println("Friday");
        // case 6 -> System.out.println("Saturday");
        // case 7 -> System.out.println("Sunday");
        // }

        // Question 5:Write a Java program to find whether a year entered by the user is
        // a leap year or not.
        System.out.println(" ***Enter to Year to check leap year or not ! ");
        int year = sc.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Year is a leaf year ");
        } else if ((year % 100 == 0) && (year % 400 == 0)) {
            System.out.println("Year is a leaf year ");

        }

        else {
            System.out.println("year is not a leaf year ");
        }

        // Question 6:Write a program to find out the type of website from the URL:
        // .com – commercial website
        // .org – organization website
        // .in – Indian website
        // System.out.println("Enter your Website ");
        // String website = sc.next();
        // if(website.endsWith(".in")){
        // System.out.println("This is a Indian Website ");
        // }
        // else if(website.endsWith(".com")){
        // System.out.println("This is a Commercial Website ");
        // }
        // else if(website.endsWith(".org")){
        // System.out.println("This is a Organizationals Website ");
        // }
        sc.close();
    }
}
