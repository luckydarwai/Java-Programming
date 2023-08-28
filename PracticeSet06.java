public class PracticeSet06 {
    public static void main(String[] args) {

        // 1. Create an array of 5 floats and calculate their sum.
        // float[] arr = { 5.3f, 1.3f, 4.3f, 7.01f, 1.9f };
        // float sum = 0;
        // for (float i : arr) {
        // sum = sum + i;
        // }
        // System.out.println(sum);

        // 2. Write a program to find out whether a given integer is present in an array
        // or
        // not.
        // int[] arr2 = { 2, 3, 23, 64, 25, 63, 13 };
        // int num = 23;
        // boolean isinarray = false;

        // for (int i = 0; i < arr2.length; i++) {
        // if (num == arr2[i]) {

        // isinarray = true;
        // break;
        // }
        // }

        // if (isinarray) {

        // System.out.println("Given Number is Present in this array");
        // } else {
        // System.out.println("Given Number is Not Present in this array");
        // }

        // 3. Calculate the average marks from an array containing marks of all students
        // in physics using a for-each loop.
        // float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        // float add = 0;
        // float avg=0;
        // for(float element:marks){
        // add = add + element;
        // avg = add/marks.length;
        // }
        // System.out.println("The value of average marks is " +avg);

        // 4. Create a Java program to add two matrices of size 2x3.
        // int [][] mat1 = {{1, 2, 3},
        // {4, 5, 6}};
        // int [][] mat2 = {{2, 6, 13},
        // {3, 7, 1}};
        // int [][] result = {{0, 0, 0},
        // {0, 0, 0}};

        // for (int i=0;i<mat1.length;i++){ // row number of times
        // for (int j=0;j<mat1[i].length;j++) { // column number of time
        // System.out.format(" Setting value for i=%d and j=%d\n", i, j);
        // result[i][j] = mat1[i][j] + mat2[i][j];
        // }
        // }
        // // Printing the elements of a 2-D Array
        // for (int i=0;i<mat1.length;i++){ // row number of times
        // for (int j=0;j<mat1[i].length;j++) { // column number of time
        // System.out.print(result[i][j] + " ");
        // result[i][j] = mat1[i][j] + mat2[i][j];
        // }
        // System.out.println(""); // Prints a new line
        // }

        // 5. Write a Java program to reverse an array.
        // int [] arr = {1, 21, 3, 4, 5, 34, 67};
        // int l = arr.length;
        // int n = Math.floorDiv(arr.length, 2);
        // int temp;

        // for(int i=0; i<n; i++){
        // // Swap a[i] and a[l-1-i]
        // // a b temp
        // // |4| |3| ||
        // temp = arr[i];
        // arr[i] = arr[l-i-1];
        // arr[l-i-1] = temp;
        // }

        // for(int element: arr){
        // System.out.print(element + " ");
        // }

        // 6. Write a Java program to find the maximum element in an array.
        // int[] arr = { 1, 2100, 3, 455, 5, 34, 67 };
        // int max = Integer.MIN_VALUE;
        // for (int e : arr) {
        //     if (e > max) {
        //         max = e;
        //     }
        // }
        // System.out.println("the value of the Maximum element in this array is: " +
        //         max);

        // 7. Write a Java program to find the maximum element in a Java array.
        int[] arr = { 1, -2100, 3, 455, 5, 34, 67 };
        int min = Integer.MAX_VALUE;
        for (int e : arr) {
            if (e < min) {
                min = e;
            }
        }
        System.out.println("the value of the Maximum element in this array is: " +min);

        // 8. Write a Java program to find whether an array is sorted or not.

        // boolean isSorted = true;
        // int [] arry = {1, 12, 3, 4, 5, 34, 67};
        // for(int i=0;i<arry.length-1;i++){
        // if(arry[i] > arry[i+1]){
        // isSorted = false;
        // break;
        // }
        // }
        // if(isSorted){
        // System.out.println("The Array is sorted");
        // }
        // else{
        // System.out.println("The Array is not sorted");
        // }
    }
}
