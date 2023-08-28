

public class ThreadPriorities extends Thread{


    public ThreadPriorities(String name){
       super(name);
    }
    public void run(){
        System.out.println("I am Thread :"+Thread.currentThread().getName());
        System.out.println("I am Thread :"+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {

        ThreadPriorities t1 = new ThreadPriorities("Lucky");
        ThreadPriorities t2 = new ThreadPriorities("Lalit");
        ThreadPriorities t3 = new ThreadPriorities("RaviS");


        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  //5
        t3.setPriority(Thread.MAX_PRIORITY);   //10
       
       
        // By passing priority      
        // t1.setPriority(1);   // 1
        // t2.setPriority(2);  //5
        // t3.setPriority(4);   //10

        t1.start();
        t2.start();
        t3.start();
        
    }
}
