package apaw.ecp1.joel.liriano.strategy;

public class Context {

    private Strategy strategy;

    public Context(Dog dog){
        this.strategy = new Run();
    }

    public Context(Dolphin dolphin) {
        dolphin.getClass().toString();
        this.strategy = new Swim();
    }

    public Context(Bird bird) {
        this.strategy = new Fly();
    }

    public Context(Cat cat) {
        this.strategy = new Run();
    }

    public String move() {
        return strategy.move();
    }

}