package apaw.ecp1.joel.liriano;

import java.util.HashMap;
import java.util.Map;

public class GameFactory {

    private static final GameFactory factory = new GameFactory();

    private Map<String, Game> games;

    private GameFactory() {
        this.games = new HashMap<>();
    }

    public static GameFactory getFactory() {
        return factory;
    }

    public Game getGame(String id) {
        return games.get(id);
    }

    public String addGame(Game game) {
        String id = game.getId();
        games.put(id,game);
        return id;
    }

    public void modifyGame(Game game) {
        String ignored = addGame(game);
    }

    public void removeGame(String id) {
        this.games.remove(id);
    }

}
