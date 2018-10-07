package apaw.ecp1.joel.liriano;

public class ReviewBuilder {

    private Review review;

    public ReviewBuilder (String reviewMessage) {
        this.review = new Review (reviewMessage);
    }

    public ReviewBuilder title(String title) {
        review.setTitle(title);
        return this;
    }

    public ReviewBuilder author(String author) {
        review.setAuthor(author);
        return this;
    }

    public ReviewBuilder rating(int rating) {
        review.setReviewRating(rating);
        return this;
    }

    public ReviewBuilder pendingApproval(boolean pending) {
        review.setPendingApproval(pending);
        return this;
    }

    public Review build() {
        return review;
    }

}
