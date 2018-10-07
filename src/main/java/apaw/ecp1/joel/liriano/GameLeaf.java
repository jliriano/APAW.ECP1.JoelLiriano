package apaw.ecp1.joel.liriano;

public class GameLeaf extends GameComponent {

    private Game game;

    public GameLeaf(Game game) {
        super(game.getId());
        this.game = game;
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void add(GameComponent gameComponent) {
        //do nothing because it's a leaf
    }

    @Override
    public void remove(GameComponent gameComponent) {
        //do nothing because it's a leaf
    }

    public Game getGame() {
        return this.game;
    }
}
