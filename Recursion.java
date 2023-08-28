
/**
 * Recursion
 */
public class Recursion {
    // static void fun(int n) {
    // if (n > 0) {
    // fun(n - 1);
    // System.out.println(n);
    // }
    // }

    static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    static int factorial_Iterative(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;

        }

    }

    public static void main(String[] args) {
        int n = 5;
        // fun(n);

        System.out.println("Printing a factorial");
        int fact = factorial(n);
        System.out.println(fact);
       
        System.out.println("Printing a factorial_Iterative");
        int itrative = factorial_Iterative(n);
        System.out.println(itrative);

    }
}