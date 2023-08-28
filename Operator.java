import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        a = sc.nextInt();
        System.out.println("Enter the value of b :");
        b = sc.nextInt();
        // Arithmetic Operators and Assignment Operator
        int c = a + b;
        System.out.println("The sum of a and b is :" + c);
        sc.close();

        // Comparison Operators
        // System.out.println(64<6);

        // 4. Logical Operators
        // System.out.println(64>5 && 64>98);
        // System.out.println(64>5 || 64>98);

        // Associativity in java

        // int a = 10;
        // int b = 0;
        // int c = 0;
        // int k = b * b - (4 * a * c) / (2 * a);
        // System.out.println(k);

    }
}
