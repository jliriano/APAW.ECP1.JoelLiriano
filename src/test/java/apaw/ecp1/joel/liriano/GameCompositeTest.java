package apaw.ecp1.joel.liriano;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameCompositeTest {

    private GameComponent root;
    private GameComponent sub11;
    private GameComponent leaf;

    private Publisher publisher = new Publisher("Rockstar");
    private Game leafGame = new Game("LeafGame",publisher);

    @BeforeEach
    void setup() {
        GameComponent sub1;
        GameComponent sub12;

        this.root = new GameComposite("root");
        this.leaf = new GameLeaf(leafGame);
        this.root.add(leaf);
        sub1 = new GameComposite("sub1");
        this.root.add(sub1);
        this.root.add(new GameLeaf(new Game("AnotherGame",publisher)));

        this.sub11 = new GameComposite("sub11");
        sub1.add(sub11);
        sub1.add(new GameLeaf(new Game("Sub1 Game",publisher)));
        sub12 = new GameComposite("sub12");
        sub1.add(sub12);

        this.sub11.add(new GameLeaf(new Game("Sub11 Game1",publisher)));
        this.sub11.add(new GameLeaf(new Game("Sub11 Game2",publisher)));

        sub12.add(new GameLeaf(new Game("Sub12 Game1",publisher)));
        sub12.add(new GameLeaf(new Game("Sub12 Game2",publisher)));
    }

    @Test
    void testViewIsLeafId() {
        assertEquals(leafGame.getId(), leaf.view());
    }

    @Test
    void testViewIsCompositeName() {
        assertEquals("sub11", sub11.view());
    }

    @Test
    void testIsComposite() {
        assertTrue(sub11.isComposite());
    }

    @Test
    void testIsNotComposite() {
        assertFalse(leaf.isComposite());
    }

    @Test
    void testRemove() {
        GameComposite temp = new GameComposite("temp");
        sub11.add(temp);
        assertDoesNotThrow(() -> sub11.remove(temp));
    }

    @Test
    void testLeafGetGame() {
        GameLeaf tempLeaf = new GameLeaf(leafGame);
        assertEquals(leafGame,tempLeaf.getGame());
    }

}