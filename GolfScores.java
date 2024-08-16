import java.util.Scanner;

public class GolfScores {
   
   public static String golfScore(int par, int strokes) {
      if (par != 3 && par != 4 && par != 5) {
         return "Error";
      }
      
      if (strokes == par - 2) {
         return "Eagle";
      } else if (strokes == par - 1) {
         return "Birdie";
      } else if (strokes == par) {
         return "Par";
      } else if (strokes == par + 1) {
         return "Bogey";
      } else {
         return "Error";
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int par = scnr.nextInt();
      int strokes = scnr.nextInt();
      String scoreName = golfScore(par, strokes);
      System.out.println(scoreName);
   }
}
