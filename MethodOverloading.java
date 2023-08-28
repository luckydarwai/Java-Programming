public class MethodOverloading {
    static void say(){
        System.out.println("Hello, Dear coder");
    }
    static void say(int a){
        System.out.println("Hello, Dear coder number " +a+ " you are a abusolute Beginner");
    }
    static void say(int a , int b){
        System.out.println("Hello, Dear coder number " +a+ " you are a abusolute Beginner");
        System.out.println("Hello, Dear coder number " +b+ " you are a Adavance level coder");
    }
    public static void main(String[] args) {
         say();
         say(10);
         say(10,23);
        //  we can do overloaing functions in easily but its recommended to parameteres are differents.
        
    }
}
