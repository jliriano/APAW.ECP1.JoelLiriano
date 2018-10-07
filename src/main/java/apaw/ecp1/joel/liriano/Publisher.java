package apaw.ecp1.joel.liriano;

import apaw.ecp1.joel.liriano.utils.RandomId;

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

    public void addGame(){
        if(games==null){
            games = new ArrayList<>();
        }
        //Add game via Factory
    }

    public void addReview(Review review){
        if(reviews==null){
            reviews = new ArrayList<>();
        }
        reviews.add(review);
    }

}