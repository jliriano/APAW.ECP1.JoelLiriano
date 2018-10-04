package apaw.ecp1.joel.liriano;

import java.time.LocalDateTime;
import java.util.UUID;

public class ContactUs {

    private String id;
    private String subject;
    private String userEmail;
    private String message;
    private LocalDateTime timestamp;

    public ContactUs(String userEmail, String message, String subject){
        assert userEmail != null;
        assert message != null;
        if(userEmail==null){
            throw new IllegalArgumentException("Invalid userEmail: " + userEmail);
        }
        if(message==null){
            throw new IllegalArgumentException("Invalid message: " + message);
        }
        id = UUID.randomUUID().toString();
        this.userEmail = userEmail;
        this.message = message;
        this.subject = subject;
        timestamp = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "ContactUs{" +
                "id='" + id + '\'' +
                ", subject='" + subject + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
