import java.util.Scanner;

public class Infix {
   
   public static String findMidfix(String str) {
      int middleIndex = str.length() / 2 - 1;
      String midfix = str.substring(middleIndex, middleIndex + 3);
      return midfix;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input = scnr.next(); // Read input string
      String midfix = findMidfix(input);
      System.out.println("Midfix: " + midfix);
   }
}
