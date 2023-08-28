class methods extends Thread{
    public void run() {
        try {
            for (int i = 0; i < 50; i++) {
                System.out.println("Child Thread");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("Thread has run");
    }
}
public class ThreadMeth_Intrrupted {
    public static void main(String[] args){
        methods t = new methods();
        t.start();
         t.interrupt();
        System.out.println("Main Thread");
    }
}


