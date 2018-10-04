package apaw.ecp1.joel.liriano;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    private Game game;
    private Publisher publisher = new Publisher("GamePublisher");

    @BeforeEach
    void setup(){
        game = new Game("Gamename",publisher);
    }

    @Test
    void testGetId(){
        LogManager.getLogger().info("id: "+game.getId());
        assertNotNull(game.getId());
    }

    @Test
    void testSetRating(){
        LogManager.getLogger().info("Setting rating to: "+GameRating.valueOf("EVERYONE"));
        game.setGameRating(GameRating.valueOf("EVERYONE").toString());
        LogManager.getLogger().info("New rating: "+game.getGameRating());
        assertEquals("EVERYONE",game.getGameRating());

    }
}
