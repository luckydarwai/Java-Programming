import java.util.Scanner;

class customException extends Exception {
  
    public  String toString(){
        return "An Error Occured";
    }
    
}
public class PracticeSet14 {
    public static void main(String[] args) throws customException {
        // 1) Write a java program to demonstrate syntax, logical 2 runtime errors.
        // 2) Write a java program that prints "HaHa" during Arithmetic exception and
        // "HeHe" during an Illegal argument exception.
              int a=6;
              int b=0;
             try{
                    System.out.println(a/b);
             }
             catch(ArithmeticException e){
                 System.out.println("Haha");
             }
             catch(IllegalArgumentException e){
                 System.out.println("Hehe");
             }
             catch(Exception e){
                 System.out.println("Error");
                 System.out.println(e);
             }
             finally{
                 System.out.println("you have out of the program ..");
             }
        // 3) Write a program that allows you to given. If max retries exceed 5 print
        // "errors".

        boolean flag=true;
        int []marks = new int[3];
          marks[0]=94;
          marks[1]=94;
          marks[2]=94;
          Scanner sc= new Scanner(System.in);
          int index;
          int i=0;
          while(flag && i<=5){
              try{
                  System.out.println("Enter the value of index");
                  index = sc.nextInt();
                  System.out.println("The value of marks[index] is "+marks[index]);
                  break;
                }
                catch(Exception e){
                    System.out.println("Invalid Index");
                    i++;
                }
            }
            sc.close();
            if(i>=5){
                throw new customException();
            }
            
        // 4) Modify program in Q3 to throw a custom Exception if max retries are
        // reached.

        // 5) Wrap the program in Q3 inside a method which throws your custom Exception.


        //  both are also done in above code 
        }
}
