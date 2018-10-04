package APAW.ECP1.JoelLiriano;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactUsTest {

    private ContactUs contactUsDefault =
            new ContactUs("email@example.com","Testing, testing, 123!", "Subject");

    @Test
    void testGetID(){
        LogManager.getLogger().info("ID: "+contactUsDefault.getId());
        assertNotNull(contactUsDefault.getId());
    }

    @Test
    void testGetUserEmail(){
        LogManager.getLogger().info("userEmail: "+contactUsDefault.getUserEmail());
        assertEquals("email@example.com",contactUsDefault.getUserEmail());
    }

    @Test
    void testGetMessage(){
        LogManager.getLogger().info("message: "+contactUsDefault.getMessage());
        assertEquals("Testing, testing, 123!",contactUsDefault.getMessage());
    }

    @Test
    void testGuetSubject(){
        LogManager.getLogger().info("subject: "+contactUsDefault.getSubject());
        assertEquals("Subject",contactUsDefault.getSubject());
    }

    @Test
    void testGetTimestamp(){
        LogManager.getLogger().info("timestamp: "+contactUsDefault.getTimestamp());
        assertNotNull(contactUsDefault.getTimestamp());
    }

    @Test
    void testSubjectCanBeNull(){
        ContactUs SubjectNull = new ContactUs("email@domain.com","message",null);
        LogManager.getLogger().info("subject: "+SubjectNull.getSubject());
        assertNull(SubjectNull.getSubject());
    }
}
