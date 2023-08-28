public class Break_and_Continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if(i==2){
                System.out.println("out the loop");
                break;      // using break Keyword we can outside the loop of perticular block
            }
        }
        System.out.println("you are exiting the loop");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if(i==2){
                System.out.println("out the loop");
                continue;      // using continue Keyword we can skips the loop of perticular element and now forwoed the loop.
            }
        }
    }
}
