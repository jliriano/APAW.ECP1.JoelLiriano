package apaw.ecp1.joel.liriano;

import java.time.LocalDateTime;
import java.util.UUID;

public class Review {

    private String id;
    private String title;
    private String author;
    private String reviewMessage;
    private int reviewRating;
    private LocalDateTime publishedDate;
    private boolean pendingApproval;

    public Review(String title, String author, String reviewMessage, int reviewRating){
        if(title==null || author==null || reviewMessage==null || reviewRating<0 || reviewRating>10){
            throw new IllegalArgumentException("One or more invalid parameters: title: "+title+" author: "
            +author+" reviewMessage: "+reviewMessage+" reviewRating: "+reviewRating);
        }
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.reviewMessage = reviewMessage;
        this.reviewRating = reviewRating;
        this.publishedDate = LocalDateTime.now();
        this.pendingApproval = true;
    }

    public void setTitle(String title) {
        if(title==null){
            throw new IllegalArgumentException("Invalid title: " + title);
        }
        this.title = title;
        pendingApproval = true;
    }

    public void setReviewMessage(String reviewMessage) {
        if(reviewMessage==null){
            throw new IllegalArgumentException("Invalid reviewMessage: " + reviewMessage);
        }
        this.reviewMessage = reviewMessage;
        pendingApproval = true;
    }

    public void setReviewRating(int reviewRating) {
        if(reviewRating<0||reviewRating>10){
            throw new IllegalArgumentException("Invalid reviewRating: " + reviewRating);
        }
        this.reviewRating = reviewRating;
    }

    public void setPendingApproval(boolean pendingApproval) {
        this.pendingApproval = pendingApproval;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getReviewMessage() {
        return reviewMessage;
    }

    public int getReviewRating() {
        return reviewRating;
    }

    public LocalDateTime getPublishedDate() {
        return publishedDate;
    }

    public boolean isPendingApproval() {
        return pendingApproval;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", reviewMessage='" + reviewMessage + '\'' +
                ", reviewRating=" + reviewRating +
                ", publishedDate=" + publishedDate +
                ", pendingApproval=" + pendingApproval +
                '}';
    }
}
