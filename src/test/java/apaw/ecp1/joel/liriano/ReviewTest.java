package apaw.ecp1.joel.liriano;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReviewTest {

    private Review review;

    @BeforeEach
    void resetReviewData(){
        review = new Review("message");
    }

    @Test
    void testGetId(){
        LogManager.getLogger().info("id: "+review.getId());
        assertNotNull(review.getId());
    }

    @Test
    void testSetTitle(){
        LogManager.getLogger().info("Current title: "+review.getTitle());
        review.setTitle("Newtitle");
        LogManager.getLogger().info("New title: "+review.getTitle());
        assertEquals("Newtitle",review.getTitle());

    }

    @Test
    void testEditReviewMessage() {
        assertEquals("message",review.getReviewMessage());
        review.setReviewMessage("updated message");
        assertEquals("updated message",review.getReviewMessage());
    }

}
