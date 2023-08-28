/**
 * Array
 */
public class Array {

    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("Size of the array is " +arr.length);
        arr[0]=199;
        arr[1]=299;
        arr[2]=399;
        arr[3]=499;
        arr[4]=599;

       // One(normal) way to printing the data
       System.out.println("Printing the data elements !");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

       // Using loop to printing the data
       System.out.println("Printing using for loop !");
       for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
       }


       System.out.println("Accessing by direct index");
       int []flat = {22,43,54,23,76,12};
       System.out.println(flat[3]);


       // Displaying The array using for loop in reverse order : 
       System.out.println("Printing Array in Reverse Order !");
       int []rev = {22,43,54,23,76,12};
      for (int i = rev.length-1; i >= 0; i--) {
          System.out.println(rev[i]);
      }
    }
}