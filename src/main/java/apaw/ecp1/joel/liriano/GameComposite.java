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
        if (gameComponent==null) {
            throw new IllegalArgumentException("Invalid gameComponent: " + gameComponent);
        }
        gameComponentList.add(gameComponent);
    }

    @Override
    public void remove(GameComponent gameComponent) {
        if (gameComponent==null) {
            throw new IllegalArgumentException("Invalid gameComponent: " + gameComponent);
        }
        gameComponentList.remove(gameComponent);
    }
}