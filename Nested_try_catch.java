import java.util.Scanner;

public class Nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 23;
        marks[1] = 63;
        marks[2] = 73;
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        while(flag){
        try{
            System.out.println("Enter The value of index");
            int index = sc.nextInt();
        
        try{
            System.out.println(marks[index]);
            flag = false;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Sorry this index does not exist");
            System.out.println("Exception in level 2");
        }
    }
    catch(Exception e){
        System.out.println("Exception in level 1");
    }
}
    sc.close();
}
}

