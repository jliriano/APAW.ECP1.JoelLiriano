package apaw.ecp1.joel.liriano;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

public class GameObservableTest {

    private Publisher publisher = new Publisher("RockstarGames");
    private Game game;

    @Test
    void test() {
        GameObservable observable = GameObservable.getObservable();
        Consumer<String> subscription = observable.subscribe(s -> LogManager.getLogger(this.getClass()).info("Primer Observador> " + s));
        Consumer<String> subscription2 = observable.subscribe(s -> LogManager.getLogger(this.getClass()).info("Segundo Observador> " + s));
        game = new Game("Game1",publisher);
        game = new Game("Game2",publisher);
        observable.unsubscribe(subscription);
        game = new Game("Game3",publisher);
        observable.unsubscribe(subscription2);
        Consumer<String> subscription3 = observable.subscribe(s -> LogManager.getLogger(this.getClass()).info("Tercer Observador> " + s));
        game = new Game("Game4",publisher);
        observable.unsubscribe(subscription3);
        game = new Game("Game5",publisher);
    }
}