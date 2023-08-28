public class Multi_2D_Array {
    public static void main(String[] args) {
        int [][]flat = new int[2][3]; // Array with 2 rows and 3 coloums
         flat[0][0]=100;
         flat[0][1]=200;
         flat[0][2]=300;
         flat[1][0]=400;
         flat[1][1]=500;
         flat[1][2]=600;

         // Displaying The 2D Array 
          System.out.println("Printing the 2D array using for loop !");
          for (int i = 0; i < flat.length; i++) {
              for (int j = 0; j < flat[i].length; j++) {
                  System.out.print(flat[i][j]);
                  System.out.print(" ");
              }
              System.out.println("\n");
          }
        



    }
}
