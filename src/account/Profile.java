package account;

import tweet.Tweet;
import java.util.List;

public class Profile {
    private String email;
    private String description;
    private String profile_picture;
    private Tweet pin;
    private String phone;
    private List<String> topics;

    public Profile(String email, String description, String profile_picture, Tweet pin, String phone,
                   List<String> topics) {
        this.email = email;
        this.description = description;
        this.profile_picture = profile_picture;
        this.pin = pin;
        this.phone = phone;
        this.topics = topics;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }

    public Tweet getPin() {
        return pin;
    }

    public void setPin(Tweet pin) {
        this.pin = pin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }
}
