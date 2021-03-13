package tweet;

import java.util.List;

public class Moment {
    private String title;
    private String description;
    private String cover_image;
    private List<Tweet> tweets;

    public Moment(String title, String description, String cover_image, List<Tweet> tweets) {
        this.title = title;
        this.description = description;
        this.cover_image = cover_image;
        this.tweets = tweets;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover_image() {
        return cover_image;
    }

    public void setCover_image(String cover_image) {
        this.cover_image = cover_image;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }
}
