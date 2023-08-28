
class phone {

    public void showTime(){
        System.out.println("Time is  5 pm.......");
    }
    public void on() {
        System.out.println("Turning on phone......");
    }
}

class smartPhone extends phone {
    public void music(){
        System.out.println("Playing Music.......");
    }
    public void on() {
        System.out.println("Turning on smart Phone........ ");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        // phone obj1 = new phone();
        // obj1.showTime();
        // obj1.on();


        // smartPhone obj2 = new smartPhone();
        // obj2.showTime();
        // obj2.music();
        // obj2.on();

        
        
        // by Dynamic method Dispatching 

      phone obj = new smartPhone();
       obj.on();
       obj.showTime();
    //    obj.music();   // This will now Accesiable throw error

        // smartPhone ob = new phone();     //  Not Allowed
    }
}
