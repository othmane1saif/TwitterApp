import account.Account;
import account.Profile;
import tweet.Tweet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Twitter {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("***   Choose a number to navigate  ***");
        System.out.println("***       1 : Sign in              ***");
        System.out.println("***       2 : Sign Up              ***");
        System.out.println("***  ***");
        List<Account> accounts = new ArrayList<>();
        
        // Test Account
        Account account = new Account();
        account.setPassword("root");
        account.setUserName("root");
        accounts.add(account);

        // First Account
        Tweet tweet1 = new Tweet();
        tweet1.setText("Warning: Real flying. Real g-forces. May make you puke. #TopGun");
        List<Tweet> tweets1 = new ArrayList<>();
        tweets1.add(tweet1);
        Account account1 = new Account("TomCruise", "tom11", tweets1);
        accounts.add(account1);

        // Second Account
        Tweet tweet2 = new Tweet();
        tweet2.setText("First time @itsbennyblanco has seen an episode, here's his review instagram.com/p/BWoZWzblfnV/");
        List<Tweet> tweets2 = new ArrayList<>();
        tweets2.add(tweet1);
        Account account2 = new Account("EdSheeran", "ed22", tweets2);
        accounts.add(account2);

        // Third Account
        Tweet tweet3 = new Tweet();
        tweet3.setText("Health Ledger and Christian Bale's interrogation scene in The Dark Knight is just as incredible as yu remember");
        List<Tweet> tweets3 = new ArrayList<>();
        tweets3.add(tweet1);
        Account account3 = new Account("Netflix", "netflix20", tweets3);
        accounts.add(account3);




        Scanner sc = new Scanner(System.in);

        while (true) {
            i = sc.nextInt();
            switch (i) {
                case 1 : {
                    System.out.println("Enter your userName");
                    String userName = sc.next();
                    System.out.println("Enter your password");
                    String password = sc.next();
                    System.out.println("pass " + password + "userName " + userName);
                    boolean auth = account.authenticate(userName, password, accounts);
                    System.out.println(auth);
                    break;
                }
            }
        }
    }
}
