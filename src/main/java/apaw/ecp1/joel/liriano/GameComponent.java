package apaw.ecp1.joel.liriano;

public abstract class GameComponent {

    private String name;

    public GameComponent(String name) {
        this.name = name;
    }

    public abstract boolean isComposite();

    public abstract String view();

    public abstract String name();
}