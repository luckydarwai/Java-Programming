// 1) by using Extending (Extends) Thread class .
class MyThread extends Thread{
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
class MyThread2 extends Thread{
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
public class Multithreading {
        public static void main(String[] args) {

            MyThread t1= new MyThread();
            MyThread2 t2 = new MyThread2();
             t1.start();
             t2.start();
            
        }
}
