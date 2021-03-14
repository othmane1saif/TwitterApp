package tweet;

import account.Account;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tweet {
    private String text;
    private Date posted;
    private int likes;
    private List<HashTag> hashTags;
    private List<Tweet> retweets;
    private String tweet_id;
    private List<Image> images;

    public Tweet() {
    }

    public Tweet(String text, Date posted, int likes, List<HashTag> hashTags, List<Tweet> retweets, String tweet_id, List<Image> images) {
        this.text = text;
        this.posted = posted;
        this.likes = likes;
        this.hashTags = hashTags;
        this.retweets = retweets;
        this.tweet_id = tweet_id;
        this.images = images;
    }

    public static List<Account> addTweet(Tweet tweetTemp, String userName, List<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUserName().equals(userName)) {
                if (accounts.get(i).getTweets() == null) {
                    List<Tweet> tweets = new ArrayList<>();
                    tweets.add(tweetTemp);
                    accounts.get(i).setTweets(tweets);
                } else accounts.get(i).getTweets().add(tweetTemp);
            }
        }
        return accounts;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getPosted() {
        return posted;
    }

    public void setPosted(Date posted) {
        this.posted = posted;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<HashTag> getHashTags() {
        return hashTags;
    }

    public void setHashTags(List<HashTag> hashTags) {
        this.hashTags = hashTags;
    }

    public List<Tweet> getRetweets() {
        return retweets;
    }

    public void setRetweets(List<Tweet> retweets) {
        this.retweets = retweets;
    }

    public String getTweet_id() {
        return tweet_id;
    }

    public void setTweet_id(String tweet_id) {
        this.tweet_id = tweet_id;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
