package account.message;

import account.Account;
import java.util.Date;

public class Message {
    private String text;
    private Date date;
    private Account sender_receiver;

    public Message(String text, Date date, Account sender_receiver) {
        this.text = text;
        this.date = date;
        this.sender_receiver = sender_receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getSender_receiver() {
        return sender_receiver;
    }

    public void setSender_receiver(Account sender_receiver) {
        this.sender_receiver = sender_receiver;
    }
}
