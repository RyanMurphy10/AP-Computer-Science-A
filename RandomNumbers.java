import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    // Instance variables
    private int var1;
    private int var2;
    private int var3;

    // Getter methods
    public int getVar1() {
        return var1;
    }

    public int getVar2() {
        return var2;
    }

    public int getVar3() {
        return var3;
    }

    // Method to set random values within the specified range
    public void setRandomValues(int low, int high) {
        Random rand = new Random();
        var1 = rand.nextInt((high - low) + 1) + low;
        var2 = rand.nextInt((high - low) + 1) + low;
        var3 = rand.nextInt((high - low) + 1) + low;
    }

    // Method to print the random values
    public void getRandomValues() {
        System.out.println("Random values: " + var1 + " " + var2 + " " + var3);
    }

    // Main method to test the RandomNumbers class
    public static void main(String[] args) {
        RandomNumbers rn = new RandomNumbers();
        Scanner scnr = new Scanner(System.in);

        int low = scnr.nextInt();
        int high = scnr.nextInt();

        rn.setRandomValues(low, high);
        rn.getRandomValues();
    }
}
