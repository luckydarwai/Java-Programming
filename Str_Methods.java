//import java.util.Scanner;

public class Str_Methods {
    public static void main(String[] args) {
     
    String str = "Lucky";
   // System.out.println(str.length());  // to check a length of string by this fuction.
    
    int s1= str.length();
    System.out.println(s1);  // to check a length of string by this fuction.
    
    System.out.println(str.charAt(2));  // for get char of that index
    //System.out.println(str.chars());
 
    System.out.println(str.toLowerCase());   // for all string chages to capital to small letters by this .
    System.out.println(str.toUpperCase());   // for all string chages to small to capital letters by this .
 
    String str2 = "I am lucky, I am a hacker My passion is hack Softwares   ";

    System.out.println(str2);
    System.out.println(str2.trim());  // by using trim removing leading and trailing spaces of the outputs.
   System.out.println(str.substring(2)); // get string by you entered that index , there's till the last index
   System.out.println(str2.substring(3,9)); // get string by you entered between that index , there's till the last index.

   System.out.println(str.replace('L','R'));  // replacing L with R --> place of Lucky replace by Vucky 

   System.out.println(str.startsWith("Lu"));     // Returns true if starting string  match otherwise returns false. 

   System.out.println(str.endsWith("ky"));     // Returns true if starting last  match otherwise returns false.
   
   System.out.println(str.charAt(3));   

   System.out.println(str.indexOf("L"));       // get strats index by char
   System.out.println(str.lastIndexOf("y"));    // get last index by char

   System.out.println(str.equals("Lucky"));   // If this String is matching to Declare Strings so that is returns true otherwise   returns false. 
     


   System.out.println(str.equalsIgnoreCase("LUCKY"));
   
}
}
