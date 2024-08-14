public class Review {
    private int rating;
    private String comment;

    // Default constructor
    public Review() {
        this.rating = -1;
        this.comment = "TBD";
    }

    // Parameterized constructor
    public Review(int rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    // Accessor methods
    public String getComment() {
        return comment;
    }

    public int getRating() {
        return rating;
    }

    // toString method with exact formatting
    @Override
    public String toString() {
        return "Rating: " + rating + " Comment: " + comment;
    }
}
