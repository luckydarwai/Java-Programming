class negativeException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative!";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be nagative AGAIN";
    }
}
public class Throw_vs_Throws {

    public static double area(int radius) throws negativeException{
       if (radius<0){
           throw new negativeException();
    }
    return Math.PI*radius*radius;

    }
     public static int divide(int a,int b) throws ArithmeticException{
         int result =a/b;
         return result;
     }
    public static void main(String[] args) throws negativeException {
        
        double ar = area(6);
        System.out.println(ar);

        try{
            int c = divide(4, 0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception");
            System.out.println(e);
        }
    }
}
