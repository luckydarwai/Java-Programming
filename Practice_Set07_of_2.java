public class Practice_Set07_of_2 {
    // Problem 7
    // ****
    // ***
    // **
    // *
    static void pattern_recursive(int number) {

        if (number > 0) {
            for (int i = 0; i < number; i++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            pattern_recursive(number - 1);
        }
    }

    // Problem 8
    static void pattern_recursive1(int number) {

        if (number > 0) {
            pattern_recursive1(number - 1);
            for (int i = 0; i < number; i++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    // Problem 9
    static float convert(float calcius) {
        float Fahrenheit = 1.8f * calcius + 32;
        return Fahrenheit;
    }

    // Problem 10
    static int sumIter(int num) {
        int res = 0;
        for (int i = 0; i < num; i++) {
            res = res + i;
        }
        return res;
    }

    public static void main(String[] args) {

        // 7. Repeat problem 4 using Recursion.

        int number = 4;
        System.out.println("Printing pattern Recursivly");
        pattern_recursive(number);

        // 8. Repeat problem 2 using Recursion.
        System.out.println("Printing pattern Recursivly1");
        pattern_recursive1(number);

        // 9. Write a function to convert Celsius temperature into Fahrenheit.
        float calcius = 4;
        System.out.println("Converting celsius temp to Feharenheit");
        convert(calcius);
        System.out.println(convert(calcius));

        // 10 Repeat problem 3 using an iterative approach.
        int num = 6;
        System.out.println("Printing the Sum of n Numbers Iteratively ");
        System.out.println(sumIter(num));
    }
}
