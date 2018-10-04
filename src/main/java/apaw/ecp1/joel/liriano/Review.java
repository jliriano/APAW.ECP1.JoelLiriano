package apaw.ecp1.joel.liriano;

import apaw.ecp1.joel.liriano.utils.RandomId;

import java.time.LocalDateTime;

public class Review {

    private String id;
    private String title;
    private String author;
    private String reviewMessage;
    private int reviewRating;
    private LocalDateTime publishedDate;
    private boolean pendingApproval;

    public Review(String reviewMessage){
        if(reviewMessage==null){
            throw new IllegalArgumentException("Invalid reviewMessage: "+reviewMessage);
        }
        this.id = RandomId.string();
        this.title = "Untitled";
        this.author = "Anonymous";
        this.reviewMessage = reviewMessage;
        this.reviewRating = 0;
        this.publishedDate = LocalDateTime.now();
        this.pendingApproval = true;
    }

    public void setTitle(String title) {
        if(title==null){
            throw new IllegalArgumentException("Invalid title: " + title);
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if(author==null){
            throw new IllegalArgumentException("Invalid author: " + author);
        }
        this.author = author;
    }

    public void setReviewMessage(String reviewMessage) {
        if(reviewMessage==null){
            throw new IllegalArgumentException("Invalid reviewMessage: " + reviewMessage);
        }
        this.reviewMessage = reviewMessage;
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
