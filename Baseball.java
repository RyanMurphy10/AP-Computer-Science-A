import java.util.Scanner;

public class Baseball {
   public static void main(String[] args) {
      int dodgers;
      int yankees;
      int cubs; // Corrected variable name

      Scanner scnr = new Scanner(System.in);
      dodgers = scnr.nextInt();
      yankees = scnr.nextInt();
      cubs = scnr.nextInt(); // Corrected variable name

      System.out.print("Last night the Dodgers scored " + dodgers + ",\n");
      System.out.print("the Yankees scored " + yankees + ", and\n");
      System.out.println("the Cubs scored " + cubs + ".");
   }
}
