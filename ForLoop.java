public class ForLoop {
    public static void main(String[] args) {
        for (int i = 7; i !=0; i--) { // 2i = Even Numbers = 0, 2, 4, 6, 8
            // 2i+1 = Odd Numbers = 1, 3, 5, 7, 9
            System.out.println("\t"+i);
        }
         
         // 2i = Even Numbers = 0, 2, 4, 6, 8
        // 2i+1 = Odd Numbers = 1, 3, 5, 7, 9
        // wap to print starting even or odd Number
        for (int a = 0; a < 10; a++) {
          System.out.println(2*a + 1);   // for odd
        //   System.out.println(2*a);    // for even
        }
    }
}
