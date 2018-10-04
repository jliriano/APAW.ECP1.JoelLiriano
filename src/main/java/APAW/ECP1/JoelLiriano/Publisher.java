package APAW.ECP1.JoelLiriano;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Publisher {

    private String id;
    private String name;
    private String website;
    private List<Game> games;
    private List<Review> reviews;

    public Publisher(String name){
        this.id = UUID.randomUUID().toString();
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

    public List<Game> getGames() {
        return games;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setWebsite(String website){
        assert website!= null;
        this.website = website;
    }

    public void setName(String name) {
        assert name != null;
        this.name = name;
    }

    public void addGame(Game game){
        if(games==null){
            games = new ArrayList<>();
        }
        games.add(game);
    }

    public void addReview(Review review){
        if(reviews==null){
            reviews = new ArrayList<>();
        }
        reviews.add(review);
    }

}
