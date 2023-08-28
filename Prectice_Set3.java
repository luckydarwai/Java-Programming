public class Prectice_Set3 {
    public static void main(String[] args) {
       
       
        // 1 Wap to convert a String to lowercase.
        String str = "LUCKY DARWAI";
        String st = str.toLowerCase();
        System.out.println(st);

        
        
        // 2 wap to replace spaces with Underlines. 
        String s1 = " I   am   Lucky ";
        System.out.println(s1.replace(" ","_"));

        
        
        // 3 wap to fill in a letter template which lookd like. 
        String letter = " Dear <|name|>,  Thanks a Lot ";
        letter = letter.replace("<|name|>","Lucky");
        System.out.println(letter);

       
       
        // Write a Java program to detect double and triple spaces in a string.
        String myString = "This string contains double and     triple spaces";
        System.out.println(myString.indexOf(" "));
        System.out.println(myString.indexOf("  "));

        // Write a program to format the following letter using escape sequence characters.
           // Letter = Dear Harry, This Java Course is nice. Thanks

        System.out.println( "  \"\"Dear Harry, This Java Course is nice. Thanks \"\"  ");
         
    }
}
