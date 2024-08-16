import org.junit.*;
/****************************************************
 * JUnit Test for Review Class
 ****************************************************/
public class MyReviewJUnitTest {
    /******************************************************
     * Test default constructor - no input parameters
     *****************************************************/
    @Test
    public void testConstructor() {
        Review r = new Review(5, "Excellent Food");

        Assert.assertEquals("Review rating should be ", 5, r.getRating());
        Assert.assertEquals("Review comment should be ", "Excellent Food", r.getComment());
    }

    /******************************************************
     * Test toString Method
     *****************************************************/
    @Test
    public void testToStringMethod() {
        Review r = new Review(5, "Excellent Food");

        Assert.assertEquals("The toString method should be: ",
                "Rating: 5 Comment: Excellent Food", r.toString());
    }
}
