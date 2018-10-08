package apaw.ecp1.joel.liriano;

import apaw.ecp1.joel.liriano.utils.RandomId;

import java.time.LocalDateTime;

public class Game {

    private String id;
    private String name;
    private LocalDateTime launchDate;
    private Publisher publisher;
    private String gameRating;
    private GameObservable observable = new GameObservable();

    public Game(String name, Publisher publisher){
        this.id = RandomId.string();
        this.name = name;
        this.publisher = publisher;
        observable.accept("New game added: "+this.name+" / Id: "+id);
    }

    public void setLaunchDate(LocalDateTime launchDate) {
        this.launchDate = launchDate;
    }

    public void setName(String name) {
        if(name==null){
            throw new IllegalArgumentException("Invalid name: " + name);
        }
        this.name = name;
    }

    public void setGameRating(String gameRating) {
        if(gameRating==null){
            throw new IllegalArgumentException("Invalid gameRating: " + gameRating);
        }
        this.gameRating = gameRating;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getLaunchDate() {
        return launchDate;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public String getGameRating() {
        return gameRating;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", launchDate=" + launchDate +
                ", publisher=" + publisher +
                ", gameRating='" + gameRating + '\'' +
                '}';
    }
}
