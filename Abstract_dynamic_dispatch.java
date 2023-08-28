abstract class Bank{  
    abstract int getRateOfInterest();  
    }  
      
    class SBI extends Bank{  
    int getRateOfInterest()
    {
    return 7;
    }  
    }  
    class PNB extends Bank{  
    int getRateOfInterest()
    {
    return 8;
    }  
    }  
      
public class Abstract_dynamic_dispatch {
    public static void main(String args[]){  
        Bank b=new SBI();//if object is PNB, method of PNB will be invoked  
        int interest1=b.getRateOfInterest();  
        System.out.println("Rate of Interest is: "+interest1+" %"); 
        Bank b2=new PNB();//if object is PNB, method of PNB will be invoked  
        int interest2=b2.getRateOfInterest();  
        System.out.println("Rate of Interest is: "+interest2+" %");  
         
        }
}
