// This is just like a dynamic method dispatch
interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking video");
    }
    //   public void record4KVideo(){
    //   System.out.println("Taking snap and recoding in 4k");
    // }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Lalit", "Aashiq", "Jay"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
    public void sampleMeth(){
        System.out.println("meth");
    }
}
public class Interface_Polymophism{
    public static void main(String[] args) {

        // just like a dynamic method dispatch
        MyCamera2 cam1 = new MySmartPhone2(); // This is a smartphone but, use it as a camera
        // cam1.getNetworks(); --> Not allowed
        // cam1.sampleMeth(); --> Not allowed
         cam1.takeSnap();
         cam1.recordVideo();
        cam1.record4KVideo();
        // cam1.greet();// this cannot directly access because this is private method we will be access by decleraring this method's to anothor public method



        // for all interfaces and class will be access of declaring this type of class object
        // MySmartPhone2 s = new MySmartPhone2();
        // s.sampleMeth();
        // s.recordVideo();
        // s.getNetworks();
        // s.callNumber(7979);
    }
}
