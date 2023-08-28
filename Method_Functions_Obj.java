public class Method_Functions_Obj {
    int sum(int a,int b){       // With out static we can Access by the obj in main class . 
        return a+b;
    }
    public static void main(String[] args) {
        Method_Functions_Obj obj = new Method_Functions_Obj();          // created just like a Scanner Class
         int c=obj.sum(5,5);
         System.out.println("The of is "+c);
    }
}
