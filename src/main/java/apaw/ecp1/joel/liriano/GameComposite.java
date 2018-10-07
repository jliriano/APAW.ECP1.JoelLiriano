package apaw.ecp1.joel.liriano;

import java.util.ArrayList;
import java.util.List;

public class GameComposite extends GameComponent {

    private List<GameComponent> gameComponentList;

    public GameComposite(String name) {
        super(name);
        gameComponentList = new ArrayList<>();
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public void add(GameComponent gameComponent) {
        assert gameComponent != null;
        gameComponentList.add(gameComponent);
    }

    @Override
    public void remove(GameComponent gameComponent) {
        assert gameComponent != null;
        gameComponentList.remove(gameComponent);
    }
}