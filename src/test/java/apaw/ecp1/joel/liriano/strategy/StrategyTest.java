package apaw.ecp1.joel.liriano.strategy;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StrategyTest {

    private Context context;

    private Dog dog;

    private Cat cat;

    private Dolphin dolphin;

    private Bird bird;

    @BeforeEach
    void setUp() {
        dog = new Dog("dog");
        cat = new Cat("cat");
        dolphin = new Dolphin("dolphin");
        bird = new Bird("bird");
    }

    @Test
    void testRunStrategy() {
        context = new Context(dog);
        assertEquals("I'm running!",context.move());
        LogManager.getLogger().debug("Context for Dog> move() -> "+context.move());
        context = new Context(cat);
        assertEquals("I'm running!",context.move());
        LogManager.getLogger().debug("Context for Cat> move() -> "+context.move());
    }

    @Test
    void testFlyStrategy() {
        context = new Context(bird);
        assertEquals("I'm flying!",context.move());
        LogManager.getLogger().debug("Context for Bird> move() -> "+context.move());
    }

    @Test
    void testSwimStrategy() {
        context = new Context(dolphin);
        assertEquals("I'm swimming!",context.move());
        LogManager.getLogger().debug("Context for Dolphin> move() -> "+context.move());
    }

}
