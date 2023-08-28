// by using Implementing (implements) Runnable class
class My_Thread implements Runnable{
    public void run(){
        int i=0;
        while(i<400){
        System.out.println("Run Method is ongoing mode...");
        System.out.println("My cookies Thread is running...");
        System.out.println("I am happy");
      i++;
        }
    }
}
class My_Thread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<400){
        System.out.println("Run Method2 is ongoing mode...");
        System.out.println("My cookies Thread2 is running...");
        System.out.println("I am sad");
      i++;
        }
    }
}
public class MultiThreading2_Runable {
    public static void main(String[] args) {
        
     // This is imp for creating object in runnable implements in thread.
        // My_Thread bullet1 = new My_Thread();
        // My_Thread2 bullet2 = new My_Thread2();
        //      Thread Gun1 = new Thread(bullet1);
        //      Thread Gun2 = new Thread(bullet2);
        //  Gun1.start();
        // Gun2.start();



        My_Thread t1 = new My_Thread();
       Thread T1 = new Thread(t1);

       My_Thread2 t2 = new My_Thread2();
       Thread T2 = new Thread(t2);

       T1.start();
       T2.start();
    }
}
