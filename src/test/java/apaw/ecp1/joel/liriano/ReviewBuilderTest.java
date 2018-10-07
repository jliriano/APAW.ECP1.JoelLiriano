package apaw.ecp1.joel.liriano;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReviewBuilderTest {

    private Review review;
    private String message = "this is a review message comment";

    @Test
    void testMinimalBuild() {
        review = new ReviewBuilder(message).build();
    }
}
