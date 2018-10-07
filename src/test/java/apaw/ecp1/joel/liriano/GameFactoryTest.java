package apaw.ecp1.joel.liriano;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class GameFactoryTest {

    private Publisher publisher = new Publisher("Rockstar Games");
    private Game game;
    private String id;
    private LocalDateTime testDate = LocalDateTime.of(2018,10,31,00,30);

    @BeforeEach
    void setup() {
        publisher = new Publisher("Rockstar Games");
        game = null;
    }

    @AfterEach
    void cleanup() {
        publisher.removeGame(id);
        id = null;
    }

    @Test
    void testAddGame() {
        publisher.addGame("NewGame", GameRating.EVERYONE.toString(), testDate);
        assertNotNull(publisher.getGames());
        LogManager.getLogger().debug("Added game ID: "+publisher.getGames().get(0));
        id = publisher.getGames().get(0);
        game = publisher.getGameById(id);
        assertEquals(publisher.getName(), game.getPublisher().getName());
        assertEquals("NewGame",game.getName());
        assertEquals("EVERYONE",game.getGameRating());
        assertEquals(testDate,game.getLaunchDate());
        assertEquals(id, game.getId());
    }

    @Test
    void testRemoveGame() {
        publisher.addGame("NewGame", GameRating.EVERYONE.toString(), testDate);
        id = publisher.getGames().get(0);
        LogManager.getLogger().debug("Added game ID: "+id+" / Size of Publisher.Games<>: "+publisher.getGames().size());
        game = publisher.getGameById(id);
        publisher.removeGame(id);
        assertEquals(0, publisher.getGames().size());
        LogManager.getLogger().debug("Removed game ID: "+id+" / Size of Publisher.Games<>: "+publisher.getGames().size());
        id = null;
    }

    @Test
    void testModifyGameName() {
        publisher.addGame("NewGame", GameRating.EVERYONE.toString(), testDate);
        id = publisher.getGames().get(0);
        LogManager.getLogger().debug("Added game 'NeGame' with ID: "+id);
        game = publisher.getGameById(id);
        publisher.modifyGameName(id, "Newer Name");
        assertEquals("Newer Name", publisher.getGameById(id).getName());
        LogManager.getLogger().debug("New Game Name: "+publisher.getGameById(id).getName());
    }

    @Test
    void testModifyGameRating() {
        publisher.addGame("NewGame", GameRating.EVERYONE.toString(), testDate);
        id = publisher.getGames().get(0);
        LogManager.getLogger().debug("Added game rated "+GameRating.EVERYONE+" with ID: "+id);
        game = publisher.getGameById(id);
        publisher.modifyGameRating(id, GameRating.TEEN.toString());
        assertEquals(GameRating.TEEN.toString(), publisher.getGameById(id).getGameRating());
        LogManager.getLogger().debug("New Game Rating: "+publisher.getGameById(id).getGameRating());
    }

    @Test
    void testModifyGameLaunchDate() {
        publisher.addGame("NewGame", GameRating.EVERYONE.toString(), testDate);
        LocalDateTime newDate = LocalDateTime.of(2019,01,01,0,30);
        id = publisher.getGames().get(0);
        game = publisher.getGameById(id);
        LogManager.getLogger().debug("Added game launching on "+game.getLaunchDate()+" with ID: "+id);
        publisher.modifyGameLaunchDate(id, newDate);
        assertEquals(newDate, publisher.getGameById(id).getLaunchDate());
        LogManager.getLogger().debug("New Game Launch Date: "+publisher.getGameById(id).getLaunchDate());
    }

}
