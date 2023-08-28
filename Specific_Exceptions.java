import java.util.Scanner;

public class Specific_Exceptions {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 23;
        marks[1] = 63;
        marks[2] = 73;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int index = sc.nextInt();

        System.out.println("Enter the number you want to divide with the index number");
        int number = sc.nextInt();

        try {
            System.out.println("The value of array index is :" + marks[index]);
            System.out.println("The value of array_index/ number is =" + marks[index] / number);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Other Excepotion Occured");
            System.out.println(e);
        }
        sc.close();

    }
}
