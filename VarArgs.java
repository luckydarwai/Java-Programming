public class VarArgs {
    static int add(int ...arr){      // creating this type of Fuction we can pass different types of arguments copy only in it .and perform addtion Operation with one or mmultiple parameters.
        int res=0;
        for(int i:arr){
        res += i;
        }
        return res;
    }
    public static void main(String[] args) {
        int a=add(2,2);
        System.out.println(a);
        System.out.println(add(5,6,4));
        System.out.println(add(5,6,6,4));

        
    }
}
