
class GrandPa{

    void Welcome(){
        System.out.println("You out of the my this code.... Thanks for Visiting this code i hope this will helpful for you.");
    }
    GrandPa(){
        System.out.println("Hey, I am your GrandFather.....");
    }
}
class Father extends GrandPa{
    Father(){
        System.out.println("Hey, I am your Father.....");
    }
}
class Son extends Father{
    Son(){
        System.out.println("Hey, I am a good son of my Father.....");
    }
}
public class ConstructorExecution {
    public static void main(String[] args) {
      Father s = new Son();
      s.Welcome();

        
    }
}
