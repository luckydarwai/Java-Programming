class MyThr extends Thread{
    public MyThr(String a){
       super(a);
    }
    public void run(){
      int i=23;
      System.out.println("Thankyou"+i);
    //  while(true){
    //      System.out.println("I am a Thread");
    //  }
    }
}

public class Threadclass_Constructor {
    public static void main(String[] args) {
        

        MyThr t1 = new MyThr("Lucky");
        MyThr t2 = new MyThr("Lalit");
        t1.start();
        t2.start();

        System.out.println("the id is "+t1.getId());
        System.out.println("the id is "+t2.getId());
        System.out.println("the name is "+t1.getName());
        System.out.println("the name is "+t2.getName());

    }
}