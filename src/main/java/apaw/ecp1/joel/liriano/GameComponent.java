package apaw.ecp1.joel.liriano;

public abstract class GameComponent {

    private String name;

    public GameComponent(String name) {
        this.name = name;
    }

    public abstract boolean isComposite();

    public abstract void add(GameComponent gameComponent);

    public abstract void remove(GameComponent gameComponent);

    public String view() {
        return this.name;
    }
}