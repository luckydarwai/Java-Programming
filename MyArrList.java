import java.util.*;


public class MyArrList extends Thread{
    public static void main(String[] args) {
       
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6);
         l1.add(5,5);


        l2.add(12);
        l2.add(13);
        l2.add(14);
         l2.add(15);
        System.out.println("The element of at the index is :"+l1.indexOf(3));
      System.out.println(l1);
        
      System.out.println("Array list before : "+l1);
       l1.remove(0);
       System.out.println("Array list after removing the value at index 0 : "+l1);
       System.out.println(l1.contains(9));
     // l1.clear();
      //System.out.println(l1);
      l1.addAll(l2);
      System.out.println("L2 Array list "+l2);
      System.out.println("L1 Array list After Merging is "+l1);
 
      for (int i = 0; i < l1.size(); i++) {
        System.out.print(l1.get(i));
        System.out.print(", ");
      }
    }
}
