package account;

import account.message.Notification;
import account.message.NotificationSettings;
import tweet.Tweet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Profile {
    private String email;
    private String description;
    private String profile_picture;
    private Tweet pin;
    private String phone;
    private List<Topics> topics;
    private Notification notificationOnOff;
    private NotificationSettings notificationType;

    public Profile(String email, String description, String phone) {
        this.email = email;
        this.description = description;
        this.phone = phone;
    }

    public Profile(String email, String description, String profile_picture, Tweet pin, String phone,
                   List<Topics> topics) {
        this.email = email;
        this.description = description;
        this.profile_picture = profile_picture;
        this.pin = pin;
        this.phone = phone;
        this.topics = topics;
    }

    public Profile(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    public Notification getNotificationOnOff() {
        return notificationOnOff;
    }

    public void setNotificationOnOff(Notification notificationOnOff) {
        this.notificationOnOff = notificationOnOff;
    }

    public NotificationSettings getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationSettings notificationType) {
        this.notificationType = notificationType;
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

    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }

    @Override
    public String toString() {
        return "Your profile: \n" +
                "Email= " + email + "\n" +
                "Description= " + description + "\n" +
                "Phone= " + phone + "\n";
    }

    public static void showProfile(String userName, List<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUserName().equals(userName)) {
                System.out.println(accounts.get(i).getProfile().toString());
            }
        }
    }

    public static void showTopics(String userName, List<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUserName().equals(userName)) {
                if (accounts.get(i).getProfile().getTopics() != null) {
                    List<Topics> topics = accounts.get(i).getProfile().getTopics();
                    System.out.println("Your topics are : ");
                    for (int j = 0; j < topics.size(); j++) {
                        System.out.print(" - " + topics.get(j).toString());
                    }
                }
                else {
                    System.out.println("You have no topics");
                }
                System.out.println(" \n Do you want to add a new topic ? (Y/N)");
                Scanner sc = new Scanner(System.in);
                String answer = sc.next();
                if (answer.toLowerCase().equals("y")) {
                    Topics[] topics = Topics.values();
                    System.out.println("List of our topics: ");
                    for (int j = 0; j < topics.length; j++) {
                        if (accounts.get(i).getProfile().getTopics() != null) {
                            boolean exist = false;
                            List<Topics> topicsList = accounts.get(i).getProfile().getTopics();
                            for (int k = 0; k < accounts.get(i).getProfile().getTopics().size(); k++) {
                                if (topics[j].equals(topicsList.get(k))) {
                                    exist = true;
                                }

                            }
                            if(exist== false){
                                System.out.println(j + " : " + topics[j]);
                            }
                        } else {
                            System.out.println(j + " : " + topics[j]);
                        }
                    }
                    System.out.println("please pick a number: ");
                    int num = sc.nextInt();
                    if (accounts.get(i).getProfile().getTopics() == null) {
                        accounts.get(i).getProfile().setTopics(new ArrayList<Topics>(){{add(topics[num]);}});
                    } else {
                        accounts.get(i).getProfile().getTopics().add(topics[num]);
                    }
                }
            }
        }
    }
    public static List<Account> updateEmail(List<Account> accounts, String userName, String email) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUserName().equals(userName)) {
                accounts.get(i).getProfile().setEmail(email);
            }
        }
        return accounts;
    }

    public static List<Account> updateDescription(List<Account> accounts, String userName, String desc) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUserName().equals(userName)) {
                accounts.get(i).getProfile().setDescription(desc);
            }
        }
        return accounts;
    }

    public static List<Account> updatePhone(List<Account> accounts, String userName, String phone) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUserName().equals(userName)) {
                accounts.get(i).getProfile().setPhone(phone);
            }
        }
        return accounts;
    }
}
