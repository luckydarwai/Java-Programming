public class Try_Catch_block {
    public static void main(String[] args) {
        int a=2000;
        int b=0;
        try{
            int c=a/b;
            System.out.println("The result is :"+c);
        }
        catch(Exception e){
            System.out.println("we faild to fatch the result, due to :");
            System.out.println(e);
        }
    }
}
