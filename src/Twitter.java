import account.Account;
import account.Profile;
import account.message.Notification;
import tweet.Tweet;

import java.util.*;

public class Twitter {
    public static void main(String[] args) {
        boolean authenticated = false;
        int i = 0;
        Account accountInMemory = null;

        List<Account> accounts = new ArrayList<>();
        
        // Test Account
        Account account = new Account();
        account.setPassword("root");
        account.setUserName("root");
        account.setProfile(new Profile("rahma@gmail.com","it is our test account","0618996677"));
      //  List<Topics> topics = new ArrayList<>();
      //  topics.add(Topics.MOVIES);
      //  topics.add(Topics.DANCE);
      //  account.getProfile().setTopics(topics);
        accounts.add(account);

        // First Account
        Tweet tweet1 = new Tweet();
        tweet1.setText("Warning: Real flying. Real g-forces. May make you puke. #TopGun");
        List<Tweet> tweets1 = new ArrayList<>();
        tweets1.add(tweet1);
        Account account1 = new Account("TomCruise", "tom11", tweets1,
                new Profile("tomcruise@hotmail.com","It is my official account","063251678"));
        accounts.add(account1);

        // Second Account
        Tweet tweet2 = new Tweet();
        tweet2.setText("First time @itsbennyblanco has seen an episode, here's his review instagram.com/p/BWoZWzblfnV/");
        List<Tweet> tweets2 = new ArrayList<>();
        tweets2.add(tweet2);
        Account account2 = new Account("EdSheeran", "ed22", tweets2,
                new Profile("edsheerane@hotmail.com","Music is life","0567984566"));
        accounts.add(account2);

        // Third Account
        Tweet tweet3 = new Tweet();
        tweet3.setText("Health Ledger and Christian Bale's interrogation scene in The Dark Knight is just as incredible as yu remember");
        List<Tweet> tweets3 = new ArrayList<>();
        tweets3.add(tweet3);
        Account account3 = new Account("Netflix", "netflix20", tweets3,
                new Profile("netflix@netflix.com",
                        "We are an American over-the-top content platform and production company","063251678"));
        accounts.add(account3);




        Scanner sc = new Scanner(System.in);
         String subject="First";
        while (true) {
            showMenu(authenticated,subject);
            if(!authenticated){
                subject="First";
            }
            i = sc.nextInt();
            if(subject.equals("First")) {
                switch (i) {
                    case 1: {
                        System.out.println("Enter your userName");
                        String userName = sc.next();
                        System.out.println("Enter your password");
                        String password = sc.next();
                        authenticated = Account.authenticate(userName, password, accounts);
                        accountInMemory = new Account();
                        accountInMemory.setUserName(userName);
                        if (authenticated) {
                            System.out.println("***   Welcome back to Twitter  ***");
                            subject="Home";
                        } else {
                            System.out.println("*** Your Password or your UserName are incorrect ***");
                        }
                        break;
                    }
                    case 2:{
                        System.out.println("**   Sign Up   **");
                        System.out.println("**   Create your Account   **");
                        System.out.println("Enter your email: ");
                        Scanner sc3 = new Scanner(System.in);
                        String email = sc3.nextLine();

                        System.out.println("Enter your phone number: ");
                        String phone = sc3.nextLine();

                        System.out.println("Enter your username: ");
                        String username = sc3.nextLine();

                        System.out.println("Enter your password: ");
                        String pwd = sc3.nextLine();

                        Account newAccount = Account.createAccount(username, pwd, email, phone);
                        accounts.add(newAccount);
                        accountInMemory = new Account();
                        accountInMemory.setUserName(username);
                        authenticated=true;
                        subject="Home";


                        break;
                    }
                }
            }else if(subject.equals("Home")) {
                switch(i){
                    case 1:{
                        Account.showTimeLine(accounts);
                        break;
                    }
                    case 2: {
                        System.out.println("Please enter your tweet");
                        Scanner scanner = new Scanner(System.in);
                        String tweet = scanner.nextLine();
                        Tweet tweetTemp = new Tweet();
                        tweetTemp.setText(tweet);
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        tweetTemp.setPosted(gregorianCalendar.getTime());
                        accounts = Tweet.addTweet(tweetTemp, accountInMemory.getUserName(), accounts);
                        break;
                    }
                    case 3 : {
                        Profile.showProfile(accountInMemory.getUserName(), accounts);
                        break;
                    }
                    case 4 : {
                        Profile.showTopics(accountInMemory.getUserName(), accounts);
                        break;
                    }
                    case 5 :{
                        subject="Settings";
                        break;
                    }
                    case 6 : {

                        System.out.println("Enter your new Password");
                        String newPassword = sc.next();
                        System.out.println("Repeat your Password");
                        String repeatNewPassword = sc.next();
                        accounts = Account.changePass(accountInMemory.getUserName(), newPassword,
                                repeatNewPassword, accounts);
                        break;
                    }
                    case 7 : {
                        authenticated = false;
                        accountInMemory = null;
                        break;
                    }
            }

            }else if(subject.equals("Settings")) {
                switch(i){
                    case 1:{
                        System.out.println("Do you want to update : ");
                        System.out.println(" 1. Email");
                        System.out.println(" 2. Description");
                        System.out.println(" 3. Phone");
                        System.out.println("Please pick a number");
                        int k = sc.nextInt();
                        switch (k){
                            case 1:{
                                Scanner em = new Scanner(System.in);
                                System.out.println("Please enter your new email : ");
                                String email = em.nextLine();
                                accounts = Profile.updateEmail(accounts, accountInMemory.getUserName(), email);
                                System.out.println("Your email is updated successfully");
                                subject="Home";
                                break;
                            }
                            case 2: {
                                Scanner em = new Scanner(System.in);
                                System.out.println("Please enter your new description : ");
                                String desc = em.nextLine();
                                accounts = Profile.updateDescription(accounts, accountInMemory.getUserName(), desc);
                                System.out.println("Your description is updated successfully");
                                subject="Home";
                                break;
                            }
                            case 3: {
                                Scanner em = new Scanner(System.in);
                                System.out.println("Please enter your new phone number : ");
                                String phone = em.nextLine();
                                accounts = Profile.updatePhone(accounts, accountInMemory.getUserName(), phone);
                                System.out.println("Your phone number is updated successfully");
                                subject="Home";
                                break;
                            }
                        }
                        break;
                    }
                    case 2 : {
                        Notification.on_off(accountInMemory.getUserName(), accounts);
                        subject="Home";
                        break;
                    }
                }
            }
        }
    }



    private static void showMenu(boolean authenticate,String subject) {

        if (!authenticate) {
            System.out.println("***   Choose a number to navigate  ***");
            System.out.println("***       1 : Log in              ***");
            System.out.println("***       2 : Sign Up              ***");
        } else if(subject.equals("Home")){

            System.out.println("***       1 : TimeLine     ***");
            System.out.println("***       2 : add tweet     ***");
            System.out.println("***       3 : Profile              ***");
            System.out.println("***       4 : Topics               ***");
            System.out.println("***       5 : Settings             ***");
            System.out.println("***       6 : Change Password      ***");
            System.out.println("***       7 : Sign out             ***");
        } else if (subject.equals("Settings")){
            System.out.println("***       1 : Account     ***");
            System.out.println("***       2 : Notifications     ***");
        }
    }
}


