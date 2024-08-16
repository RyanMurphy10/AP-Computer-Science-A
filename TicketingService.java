import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class TicketingService {

   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      String personName;
      int youPosition = 0;

      Queue<String> peopleInQueue = new LinkedList<>();

      personName = scnr.nextLine();
      while (!personName.equals("-1")) {
         peopleInQueue.add(personName);
         personName = scnr.nextLine();
      }

      int position = 1;
      for (String person : peopleInQueue) {
         if (person.equals("You")) {
            youPosition = position;
            break;
         }
         position++;
      }

      System.out.println("Welcome to the ticketing service... ");
      System.out.println("You are number " + youPosition + " in the queue.");

      while (!peopleInQueue.isEmpty()) {
         String headPerson = peopleInQueue.poll(); // Remove the head of the queue
         if (headPerson.equals("You")) {
            System.out.println("You can now purchase your ticket!");
            break;
         } else {
            System.out.println(headPerson + " has purchased a ticket.");
            youPosition--;
            if (youPosition > 0) {
               System.out.println("You are now number " + youPosition);
            }
         }
      }
   }
}
