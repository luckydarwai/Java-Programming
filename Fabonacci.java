// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …  print fabonacci series.
/**
 * Fabonacci
 */
public class Fabonacci {

    static void fib(int n) {
        int a = -1, b = 1, c = 0;
        for (int i = 1; i <= n; i++) {
            c = a + b;
            System.out.print(c+"\t");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println();
        fib(n);
        System.out.println("\n");
    }
}