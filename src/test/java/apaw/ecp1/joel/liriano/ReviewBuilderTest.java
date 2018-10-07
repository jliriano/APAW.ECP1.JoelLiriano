package apaw.ecp1.joel.liriano;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReviewBuilderTest {

    private Review review;
    private String message = "this is a review message comment";

    @Test
    void testMinimalBuild() {
        review = new ReviewBuilder(message).build();
        LogOutput();
        assertEquals("Anonymous",review.getAuthor());
        assertEquals("Untitled",review.getTitle());
        assertEquals(message, review.getReviewMessage());
        assertEquals(0,review.getReviewRating());
        assertNotNull(review.getPublishedDate());
        assertTrue(review.isPendingApproval());
    }

    @Test
    void testFullBuild() {
        review = new ReviewBuilder(message).author("Newauthor").title("Newtitle").
                rating(8).pendingApproval(false).build();
        LogOutput();
        assertNotNull(review.getId());
        assertEquals("Newauthor",review.getAuthor());
        assertEquals("Newtitle",review.getTitle());
        assertEquals(message, review.getReviewMessage());
        assertEquals(8,review.getReviewRating());
        assertNotNull(review.getPublishedDate());
        assertFalse(review.isPendingApproval());
    }

    private void LogOutput() {
        LogManager.getLogger().debug("Id: "+review.getId()+"\nTitle: "+review.getTitle()+
                "\nAuthor: "+review.getAuthor()+"\nReview: "+review.getReviewMessage()+
                "\nRating: "+review.getReviewRating()+"\nPublished date: "+review.getPublishedDate()+
                "\nPending Approval: "+review.isPendingApproval());
        assertNotNull(review.getId());
    }

}
