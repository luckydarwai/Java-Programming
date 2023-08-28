
public class Practice_Set07 {

    // Problem 1
    static void table(int n) {
        int res;
        for (int i = 1; i <= 10; i++) {
            res = n * i;
            System.out.println(res);

        }
    }

    // Problem 2
    static void pattern(int no) {
        for (int i = 0; i < no; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    // Problem 3

    // sum(n) = 1 + 2 + 3... + n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n // logic of recursion in sum program.
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1
    static int sumRec(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sumRec(num - 1);
        }
    }

    // Problem 4
    static void pattern2(int no) {
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    // Problem 5
    static int fib(int nth) {
        if (nth == 1 || nth == 2) {
            return nth - 1;
        } else {
            return fib(nth - 1) + fib(nth - 2);
        }
    }

    // Problem 6
    static int varargs(int... arr) {
        int res = 0;
        int avg = 0;
        for (int i : arr) {
            res = res + i;
            avg = res / 3;
        }
        return avg;
    }

   

    public static void main(String[] args) {

        // 1. Write a Java method/function to print the multiplication table of a number
        // n.
        int n = 7;
        System.out.println("Printing the table of n ");
        table(n);

        // 2. Write a program using functions to print the following pattern:
        // *
        // **
        // ***
        // ****
        int no = 4;
        System.out.println("Printing the Pattern of n ");
        pattern(no);

        // 3. Write a recursive function to calculate the sum of first n natural
        // numbers.
        int num = 7;
        System.out.println("Printing the Sum of n Numbers ");
        System.out.println(sumRec(num));
        // 4. Write a function to print the following pattern:
        // ****
        // ***
        // **
        // *
        // int no = 4;
        System.out.println("Printing the Pattern2 of n ");
        pattern2(no);

        // 5.Write a function to print the nth term of the Fibonacci series using
        // recursion.
        int nth = 5;
        System.out.println(fib(nth));

        // 6. Write a function to find the average of a set of numbers passed as
        // arguments. using variable arguments (varArgs)

        int avg = varargs(2, 3, 4);
        System.out.println("The average is :" + avg);

     
    }
}
