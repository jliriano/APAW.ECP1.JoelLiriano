package apaw.ecp1.joel.liriano;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class GameObservable {

    private List<Consumer<String>> consumers;
    private static GameObservable observable = new GameObservable();

    private GameObservable() {
        this.consumers = new ArrayList<>();
    }

    public static GameObservable getObservable() {
        return observable;
    }

    public Consumer<String> subscribe(Consumer<String> consumer) {
        this.consumers.add(consumer);
        return consumer;
    }

    public void unsubscribe(Consumer<String> consumer) {
        this.consumers.remove(consumer);
    }

    public void accept(String data) {
        this.consumers.forEach(c -> c.accept(data));
    }
}
