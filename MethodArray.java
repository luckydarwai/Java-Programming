/**
 * MethodArray
 */
public class MethodArray {
    static void change(int []arr){
       arr[0]=90;
    }

    public static void main(String[] args) {
        int []arr = { 11,14,15,22,31,18,23};
        change(arr);         // We can changes in our array values by the help of array references . its easy to make changes out value in the program  , Without passing Reference we cannot change the out values by the functon or methode.
        System.out.println(arr[0]);
    }
}