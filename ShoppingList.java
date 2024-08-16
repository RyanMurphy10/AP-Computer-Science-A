import java.util.Scanner;
import java.util.LinkedList;

public class ShoppingList {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);

      LinkedList<ListItem> shoppingList = new LinkedList<>();

      String item;
      
      while (true) {
         item = scnr.nextLine();
         if (item.equals("-1")) {
            break;
         }
         shoppingList.add(new ListItem(item));
      }
      
      for (ListItem listItem : shoppingList) {
         listItem.printNodeData();
      }
   }
}
