class Modifiers{
    private int a=1;
    public int b=2;
    int c =3; // Default 
    protected int d = 4;

    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class Access_Modifiers {
    public static void main(String[] args) {
    
        // System.out.println(a);


         Modifiers modi = new Modifiers();
        // System.out.println(modi.a); // we cannot access private member 
        System.out.println(modi.b);   // yes we can assess pulic member 
        // System.out.println(c);  // cant access defalut value
    //    System.out.println(d);//cannot access procted value
 
System.out.println("Accessing by the help of java method / function");

modi.meth1();

    }
}
