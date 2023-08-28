interface MyCamera{
    void takeSnap();
    void recordVideo();
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String networks);
}
class MyCellPhone{
    private void say(){
        System.out.println("Welcome dear!");
    }
    void callNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    void pickCall(){
        say();
        System.out.println("Connecting.....");
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera , MyWifi{
    public void takeSnap(){
        
        System.out.println("Taking with sanpchat");
    }
    public void recordVideo(){
        System.out.println("Video Recording is Started...");
    }
    public String[] getNetworks(){
System.out.println("Getting List of Networks....");
String[] list = {"Lucky","Ravi","om"};

return list;
    }

    public void connectToNetwork(String networks){
        System.out.println("connect to "+networks+"Networks");
    }
}
public class Interface_Multiple {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.takeSnap();
        ms.recordVideo();
        ms.getNetworks();
        ms.connectToNetwork("lucky ");
        ms.callNumber(94087);
        ms.pickCall();

    }
}
