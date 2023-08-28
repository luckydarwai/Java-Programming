import java.util.Scanner;

public class Way_Print {
    public static void main(String[] args) {
        System.out.println("Hello user");
        System.out.print("Hello user\n");
        System.out.printf("Hello user\n");
        System.out.format("Hello user");  // format just like a printf

        int a;
        int b;

        Scanner sc= new Scanner(System.in);
        System.out.println ("Enter two values for an additon :");
         a = sc.nextInt();
         b=sc.nextInt();  
         int sum = a+b;


         System.out.printf("The value of sum is %d ",sum);
        sc.close();

        // we can use the printing the element property of c , in java Programing.
        
        }
}
