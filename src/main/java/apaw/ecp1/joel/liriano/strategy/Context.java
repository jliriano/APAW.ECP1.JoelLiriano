package apaw.ecp1.joel.liriano.strategy;

public class Context {

    private Strategy strategy;

    private Animal animal;

    public Context(Dog dog){
        this.animal = dog;
        this.strategy = new Run();
    }

    public Context(Dolphin dolphin) {
        this.animal = dolphin;
        this.strategy = new Swim();
    }

    public Context(Bird bird) {
        this.animal = bird;
        this.strategy = new Fly();
    }

    public Context(Cat cat) {
        this.animal = cat;
        this.strategy = new Run();
    }

    public String move() {
        return strategy.move();
    }

    public Animal getAnimal() {
        return animal;
    }

}