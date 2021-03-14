package account.message;

import account.Account;

import java.util.List;
import java.util.Scanner;

public class Notification {
    private boolean notif;

    public Notification(boolean notif) {
        this.notif = notif;
    }

    public boolean isNotif() {
        return notif;
    }

    @Override
    public String toString() {
            return "your notification is ";
    }

    public void setNotif(boolean notification) {
        this.notif = notification;
    }

    public static void on_off(String userName, List<Account> accounts) {
        int index = 0;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUserName().equals(userName)) {
                index = i;
            }
        }
        if (accounts.get(index).getProfile().getNotificationOnOff() == null) {
            accounts.get(index).getProfile().setNotificationOnOff(new Notification(false));
        }
        if (accounts.get(index).getProfile().getNotificationOnOff().isNotif()) {
            System.out.println("Your notification is On");
        } else System.out.println("Your notification is Off");
        System.out.println("Do you want to update your notification setting ? (Y/N)");
        Scanner sc = new Scanner(System.in);
        String response = sc.next();
        if (response.toLowerCase().equals("y")) {
            if (accounts.get(index).getProfile().getNotificationOnOff().isNotif()){
                System.out.println("Now your notification is Off");
                accounts.get(index).getProfile().setNotificationOnOff(new Notification(false));
            } else {
                System.out.println("Now your notification is On");
                accounts.get(index).getProfile().setNotificationOnOff(new Notification(true));
                System.out.println("Do you want: ");
                System.out.println("1: " + NotificationSettings.EMAIL + " notification");
                System.out.println("2: " + NotificationSettings.PUSH + " notification");
                int responseVal = sc.nextInt();
                if (responseVal == 1) {
                    accounts.get(index).getProfile().setNotificationType(NotificationSettings.EMAIL);
                } else {
                    accounts.get(index).getProfile().setNotificationType(NotificationSettings.PUSH);
                }
            }

        }
    }
}

