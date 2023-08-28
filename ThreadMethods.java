// import java.io.*;
import java.lang.Thread;

public class ThreadMethods {
    public static void main(String[] args) {

        try {
            for (int i = 1; i <= 50; i++) {
                Thread.sleep(100);
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
