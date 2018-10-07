package apaw.ecp1.joel.liriano;

public class ReviewBuilder {

    private Review review;

    public ReviewBuilder ReviewBuilder(String reviewMessge) {
        this.review = new Review (reviewMessge);
        return this;
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
