import java.util.ArrayList;

public class Reviews {
    private ArrayList<Review> reviewList;

    // Constructor
    public Reviews() {
        this.reviewList = new ArrayList<>();
    }

    // Method to get all reviews
    public ArrayList<Review> getAllReviews() {
        return reviewList;
    }

    // Method to get reviews with a specific rating
    public ArrayList<Review> commentsForRating(int rating) {
        ArrayList<Review> matchingReviews = new ArrayList<>();
        for (Review review : reviewList) {
            if (review.getRating() == rating) {
                matchingReviews.add(review);
            }
        }
        return matchingReviews;
    }

    // Method to calculate the average rating
    public int getAverageRating() {
        if (reviewList.isEmpty()) {
            return 0;
        }
        int totalRating = 0;
        for (Review review : reviewList) {
            totalRating += review.getRating();
        }
        return totalRating / reviewList.size();
    }

    // Method to add a review
    public void addReviews(Review r) {
        reviewList.add(r);
    }

    // Method to get the review with the highest rating
    public Review highestReview() {
        if (reviewList.isEmpty()) {
            return null;
        }
        Review highest = reviewList.get(0);
        for (Review review : reviewList) {
            if (review.getRating() > highest.getRating()) {
                highest = review;
            }
        }
        return highest;
    }

    // Method to get the review with the lowest rating
    public Review lowestReview() {
        if (reviewList.isEmpty()) {
            return null;
        }
        Review lowest = reviewList.get(0);
        for (Review review : reviewList) {
            if (review.getRating() < lowest.getRating()) {
                lowest = review;
            }
        }
        return lowest;
    }
}
