import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Reviews reviews = new Reviews();
        Scanner scanner = new Scanner(System.in);

        // Loop to enter reviews
        while (true) {
            System.out.print("Type rating comments. To end: -1\n");
            int rating = scanner.nextInt();
            if (rating == -1) break;
            scanner.nextLine(); // consume the newline
            String comment = scanner.nextLine();
            reviews.addReviews(new Review(rating, comment));
        }

        // Print the average rating
        System.out.println("Average rating:");
        System.out.println(reviews.getAverageRating());

        // Print the highest review
        System.out.println("Highest Review:");
        System.out.println(reviews.highestReview());

        // Print the lowest review
        System.out.println("Lowest Review:");
        System.out.println(reviews.lowestReview());

        // Loop to search for specific ratings
        while (true) {
            System.out.print("Type rating. To end: -1\n");
            int searchRating = scanner.nextInt();
            if (searchRating == -1) break;

            for (Review r : reviews.commentsForRating(searchRating)) {
                System.out.println(r);
            }
        }

        System.out.println("Process finished with exit code 0");
    }
}
