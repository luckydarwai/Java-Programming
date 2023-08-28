//import java.util.Scanner;

public class Prectice_Set05 {
    public static void main(String[] args) {

        // Question 1: Write a program to print the following pattern :
        // ****
        // ***
        // **
        // *
        // solution
        // for (int i = 4; i > 0; i--) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.println("\n");
        // }

       
       
       
        // Question 2: Write a program to sum first n even numbers using a while loop.
        // solution
        // int sum = 0;
        // int n = 4;
        // int i = 0;
        // while (i < n) {
        // sum = sum + 2 * i;
        // i++;
        // }
        // System.out.println("The sum of n Even's Number is :");
        // System.out.println(sum);

       
       
       
        // Question 3: Write a program to print the multiplication table of a given
        // number n.
        // solution
        // int num;
        // int i = 1;
        // int res;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Number which you want to get table!");
        // num = sc.nextInt();
        // while (i <= 10) {
        // res = i * num;

        // System.out.println(+num + "*" + i + "=" + res);
        // i++;
        // }

        
        
        
        // Question 4: Write a program to print a multiplication table of 10 in reverse
        // order.
        // solution
        // int num=10;
        // int i = 10;
        // int res;
        // while (i > 0) {
        // res = i * num;
        // System.out.println(+num + "*" + i + "=" + res);
        // i--;
        // }

        
        
        
        // Question 5: Write a program to find the factorial of a given number using for
        // loops.
        // solution
        // int no = 5;
        // int fact = 1;
        // // What is factorial n = n * n-1 * n-2 ..... 1
        // // 5! = 5*4*3*2*1==> 120
        // for (int i = 1; i <= no; i++) {
        //     fact = fact * i;
        // }
        // System.out.println("Factorial of given Number is " + fact);
        
        
        
        
        // Question 6: Repeat problem 5 using a while loop.
        // What is factorial n = n * n-1 * n-2 ..... 1
        // 5! = 5*4*3*2*1 = 120
    //     int n = 5;
    //    int i = 1;
    //    int factorial = 1;
    //    while(i<=n){
    //        factorial *= i;
    //        i++;
    //    }
    //    System.out.println(factorial);

        
    
    
    // Question 7: Repeat problem 1 using for/while loop.

      // Try yourself



        // Question 8: What can be done using one type of loop can also be done using
        // the other two types of loops - True or False.
        // Ans is True.

        // Question 9: Write a program to calculate the sum of the numbers occurring in
        // the multiplication table of 8.
        int n = 8;
               int sum = 0;
               //for(int i=0; i<10; i++) - Goes from i=0 to i=9
               for(int i=1;i<=10;i++){
                   sum += n*i;
               }
               System.out.println(sum);

        // Question 10 :A do-while loop is executed:

        // At least once
        // At least twice
        // At most once
        // Ans=> At least once.

        
        // Question 11: Repeat problem 2 using for loop.
         // Solution -> try yourself
        // sc.close();
    }
}
