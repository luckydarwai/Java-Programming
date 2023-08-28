import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "I am to String()";
    }

    public String getMessage(){
        return "I am get message()";
    }
}
public  class Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        sc.close();
        if(a<10){
            try{

               //  throw new MyException(); 
                throw new ArithmeticException("This is an Exception");
            }
            catch (Exception e){ 
        System.out.println(e.getMessage());
        System.out.println(e.toString());
        e.printStackTrace();
        System.out.println("Completed");
            }
        }
        System.out.println("Finished");
    }
}
