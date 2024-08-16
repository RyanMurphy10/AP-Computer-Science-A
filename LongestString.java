import java.util.Scanner;

public class LongestString {
   
   public String findLongest(String str1, String str2) {
       if (str1.length() > str2.length()) {
           return str1;
       } else {
           return str2;
       }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      String str1 = scnr.next();
      String str2 = scnr.next();
      
      LongestString longestString = new LongestString();
      String longest = longestString.findLongest(str1, str2);
      
      System.out.println(longest);
   }
}
