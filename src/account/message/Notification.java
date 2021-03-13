package account.message;

public class Notification {
    private boolean notif;

    public Notification(boolean notif) {
        this.notif = notif;
    }

    public boolean isNotif() {
        return notif;
    }

    public void setNotif(boolean notif) {
        this.notif = notif;
    }
}

