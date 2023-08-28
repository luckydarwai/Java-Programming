/**
 * Method_Functions
 */
public class Method_Functions {

    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        x=644;  // this value do not reflact on our program  , code will must be exicute.
        return z;

    }

    public static void main(String[] args) {

        int a=5;
        int b=1;
        int c;
        c=logic(a,b);
        
        int a1=1;
        int b1=4;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}