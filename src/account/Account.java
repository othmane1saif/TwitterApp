package account;

import account.message.Message;
import account.message.Notification;
import account.poll.Poll;
import tweet.Moment;
import tweet.Thread;
import tweet.Tweet;
import java.util.List;

public class Account {
    private String userName;
    private String password;
    private List<Notification> followers;
    private List<Notification> following;
    private List<Message> sent;
    private List<Message> received;
    private List<Tweet> tweets;
    private List<Poll> polls;
    private Profile profile;
    private List<SavedSearch> searches;
    private List<Moment> moments;
    private List<Thread> threads;

    public Account() {
    }

    public Account(String userName, String password, List<Tweet> tweets) {
        this.userName = userName;
        this.password = password;
        this.tweets = tweets;
    }

    public Account(String userName, String password, List<Notification> followers, List<Notification> following,
                   List<Message> sent, List<Message> received, List<Tweet> tweets, List<Poll> polls, Profile profile,
                   List<SavedSearch> searches, List<Moment> moments, List<Thread> threads) {
        this.userName = userName;
        this.password = password;
        this.followers = followers;
        this.following = following;
        this.sent = sent;
        this.received = received;
        this.tweets = tweets;
        this.polls = polls;
        this.profile = profile;
        this.searches = searches;
        this.moments = moments;
        this.threads = threads;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Notification> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Notification> followers) {
        this.followers = followers;
    }

    public List<Notification> getFollowing() {
        return following;
    }

    public void setFollowing(List<Notification> following) {
        this.following = following;
    }

    public List<Message> getSent() {
        return sent;
    }

    public void setSent(List<Message> sent) {
        this.sent = sent;
    }

    public List<Message> getReceived() {
        return received;
    }

    public void setReceived(List<Message> received) {
        this.received = received;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public List<Poll> getPolls() {
        return polls;
    }

    public void setPolls(List<Poll> polls) {
        this.polls = polls;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<SavedSearch> getSearches() {
        return searches;
    }

    public void setSearches(List<SavedSearch> searches) {
        this.searches = searches;
    }

    public List<Moment> getMoments() {
        return moments;
    }

    public void setMoments(List<Moment> moments) {
        this.moments = moments;
    }

    public List<Thread> getThreads() {
        return threads;
    }

    public void setThreads(List<Thread> threads) {
        this.threads = threads;
    }

    public boolean authenticate(String userName, String password, List<Account> accounts) {
       return accounts.stream().anyMatch(ele -> ele.getPassword().equals(password) && ele.getUserName().equals(userName));
    }
}
