import org.junit.*;
import java.util.ArrayList;
import static org.junit.Assert.*;
/****************************************************
 * To test Reviews Container Class
 *
 * @author  Resendiz
 * @version February 2021
 ****************************************************/
public class MyReviewsContainerJUnitTest {

    /******************************************************
     * Test default constructor - no input parameters
     *****************************************************/
    @Test
    public void testConstructor() {
        /* Credit Union */
        Reviews list = new Reviews();
        assertEquals("ArrayList should contain no records at this time",
                0, list.getAllReviews().size());
    }

    /******************************************************
     * Test Highest Score
     *****************************************************/
    @Test
    public void testHighestScore() {
        /* Reviews */
        Reviews list = new Reviews();

        list.addReviews(new Review( 4, "Awesome experience!"));
        list.addReviews(new Review( 3, "I had a terrible time waiting for a table"));
        list.addReviews(new Review( 4, "Great job on carry out options during COVID"));
        list.addReviews(new Review( 1, "Waited too long. Left!"));
        list.addReviews(new Review( 4, "Amazing Food!"));
        list.addReviews(new Review( 5, "Five out of Five"));

        Review r = list.highestReview();

        assertEquals("Highest comment should be: ", "Five out of Five", r.getComment());

    }

    /******************************************************
     * Test Lowest Score
     *****************************************************/
    @Test
    public void testLowestScore() {
        /* Reviews */
        Reviews list = new Reviews();

        list.addReviews(new Review( 4, "Awesome experience!"));
        list.addReviews(new Review( 3, "I had a terrible time waiting for a table"));
        list.addReviews(new Review( 4, "Great job on carry out options during COVID"));
        list.addReviews(new Review( 1, "Waited too long. Left!"));
        list.addReviews(new Review( 4, "Amazing Food!"));
        list.addReviews(new Review( 5, "Five out of Five"));

        Review r = list.lowestReview();

        assertEquals("Lowest comment should be: ", "Waited too long. Left!", r.getComment());

    }

    /******************************************************
     * Test Average
     *****************************************************/
    @Test
    public void testAverage() {
        /* Reviews */
        Reviews list = new Reviews();

        list.addReviews(new Review( 4, "Awesome experience!"));
        list.addReviews(new Review( 3, "I had a terrible time waiting for a table"));
        list.addReviews(new Review( 4, "Great job on carry out options during COVID"));
        list.addReviews(new Review( 1, "Waited too long. Left!"));
        list.addReviews(new Review( 4, "Amazing Food!"));
        list.addReviews(new Review( 5, "Five out of Five"));

        int average = list.getAverageRating();

        assertEquals("Average Rating should be: ", 3, average);

    }

    /******************************************************
     * Test Comments for Rating
     *****************************************************/
    @Test
    public void testCommentsForRating() {
        /* Reviews */
        Reviews list = new Reviews();

        list.addReviews(new Review( 4, "Awesome experience!"));
        list.addReviews(new Review( 3, "I had a terrible time waiting for a table"));
        list.addReviews(new Review( 4, "Great job on carry out options during COVID"));
        list.addReviews(new Review( 1, "Waited too long. Left!"));
        list.addReviews(new Review( 4, "Amazing Food!"));
        list.addReviews(new Review( 5, "Five out of Five"));

        ArrayList<Review> result = list.commentsForRating(4);

        assertEquals("There should be 3 items in the result ArrayList", 3, result.size());

    }

}