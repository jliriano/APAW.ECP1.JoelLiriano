package APAW.ECP1.JoelLiriano;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReviewTest {

    private Review review;

    @BeforeEach
    void resetReviewData(){
        review = new Review("Title","Author","message",7);
    }

    @Test
    void testGetId(){
        LogManager.getLogger().info("id: "+review.getId());
        assertNotNull(review.getId());
    }

    @Test
    void testGetTitle(){
        LogManager.getLogger().info("title: "+review.getTitle());
        assertEquals("Title", review.getTitle());
    }

    @Test
    void testGetAuthor(){
        LogManager.getLogger().info("author: "+review.getAuthor());
        assertEquals("Author", review.getAuthor());
    }

    @Test
    void testGetMessage(){
        LogManager.getLogger().info("reviewMessage: "+review.getReviewMessage());
        assertEquals("message", review.getReviewMessage());
    }

    @Test
    void testGetReviewRating(){
        LogManager.getLogger().info("reviewRating: "+review.getReviewRating());
        assertEquals(7, review.getReviewRating());
    }

    @Test
    void testGetPublishedDate(){
        LogManager.getLogger().info("publishedDate: "+review.getPublishedDate());
        assertNotNull(review.getPublishedDate());
    }

    @Test
    void testIsPendingApproval(){
        LogManager.getLogger().info("pendingApproval: "+review.isPendingApproval());
        assertTrue(review.isPendingApproval());
    }

    @Test
    void testSetTitle(){
        LogManager.getLogger().info("Title: "+review.getTitle());
        assertEquals("Title", review.getTitle());
    }

    //setTitle
    //setReviewMessage
    //setReviewRating
    //setPendingApproval
}
