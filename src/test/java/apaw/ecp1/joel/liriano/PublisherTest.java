package apaw.ecp1.joel.liriano;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PublisherTest {

    private Publisher publisher = new Publisher("GamePublisher");

    @Test
    void testGetId(){
        LogManager.getLogger().info("id: "+publisher.getId());
        assertNotNull(publisher.getId());
    }

    @Test
    void testSetWebsite(){
        LogManager.getLogger().info("Setting website to: www.google.com");
        publisher.setWebsite("www.google.com");
        LogManager.getLogger().info("New website: "+publisher.getWebsite());
        assertEquals("www.google.com",publisher.getWebsite());

    }
}
