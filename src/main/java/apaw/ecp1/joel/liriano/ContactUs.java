package apaw.ecp1.joel.liriano;

import apaw.ecp1.joel.liriano.utils.RandomId;

import java.time.LocalDateTime;

public class ContactUs {

    private String id;
    private String subject;
    private String userEmail;
    private String message;
    private LocalDateTime timestamp;

    public ContactUs(String userEmail, String message, String subject){
        if(userEmail==null){
            throw new IllegalArgumentException("Invalid userEmail: " + userEmail);
        }
        if(message==null){
            throw new IllegalArgumentException("Invalid message: " + message);
        }
        id = RandomId.string();
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
