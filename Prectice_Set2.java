import java.util.Scanner;

public class Prectice_Set2 {
    public static void main(String[] args) {
        // Que 1.What will be the result of the following expression:
        // float a = 7 / 4.0f * 9 / 2.0f;
        // System.out.println(a);
       
       
        // Que 2.Write a java program to encrypt a grade by adding 8 to it. Decrypt it
        // to show
        // the correct grade.
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println (grade);
        grade = (char)(grade - 8);
        System.out.println ("Bro, The Actual grade is "+grade);

        
        // Que 3.Use comparison operators to find out whether a given number is greater
        // than
        // the user entered number or not.
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println (num>10);
        sc.close();


        // Que 4.Write the following expression in a java program:
        // (v^2-u^2)/2as
        int v=1;
        int u=1;
        int a=1;
        int s=1;
        int result=(v^2-u^2)/2*a*s; 
        System.out.println(result);
        // Que 5.Find the value of 'a' in expression given below :
        int x = 7;
        int r = x*49/x + 35/x;
        System.out.println(r);
    }
}
