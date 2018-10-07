package apaw.ecp1.joel.liriano;

import apaw.ecp1.joel.liriano.utils.RandomId;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private String id;
    private String name;
    private String website;
    private List<String> games;
    private List<Review> reviews;

    public Publisher(String name){
        this.id = RandomId.string();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public List<String> getGames() {
        return games;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setWebsite(String website){
        if(website==null){
            throw new IllegalArgumentException("Invalid website: " + website);
        }
        this.website = website;
    }

    public void setName(String name) {
        if(name==null){
            throw new IllegalArgumentException("Invalid name: " + name);
        }
        this.name = name;
    }

    public void addGame(String gameName, String gameRating, LocalDateTime launchDate){
        if(games==null){
            games = new ArrayList<>();
        }
        Game game = new Game(gameName,this);
        game.setGameRating(gameRating);
        game.setLaunchDate(launchDate);
        this.games.add(GameFactory.getFactory().addGame(game));
    }

    public void removeGame(String id) {
        GameFactory.getFactory().removeGame(id);
        games.remove(id);
    }

    public void modifyGameName(String id, String newName) {
        Game modifyGame = getGameById(id);
        modifyGame.setName(newName);
        GameFactory.getFactory().modifyGame(modifyGame);
    }

    public void modifyGameRating(String id, String newRating) {
        Game modifyGame = getGameById(id);
        modifyGame.setGameRating(newRating);
        GameFactory.getFactory().modifyGame(modifyGame);
    }

    public void modifyGameLaunchDate(String id, LocalDateTime newLaunchDate) {
        Game modifyGame = getGameById(id);
        modifyGame.setLaunchDate(newLaunchDate);
        GameFactory.getFactory().modifyGame(modifyGame);
    }

    public Game getGameById(String id) {
        return GameFactory.getFactory().getGame(id);
    }

    public void addReview(Review review){
        if(reviews==null){
            reviews = new ArrayList<>();
        }
        reviews.add(review);
    }

}