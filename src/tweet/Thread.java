package tweet;

import java.util.List;

public class Thread {
    private Tweet tweet;
    private List<Tweet> replies;

    public Thread(Tweet tweet, List<Tweet> replies) {
        this.tweet = tweet;
        this.replies = replies;
    }

    public Tweet getTweet() {
        return tweet;
    }

    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }

    public List<Tweet> getReplies() {
        return replies;
    }

    public void setReplies(List<Tweet> replies) {
        this.replies = replies;
    }
}
