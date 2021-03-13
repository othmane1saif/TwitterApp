package tweet;

import account.Account;

import java.util.List;

public class Fleet {
    private List<Account> seen_by;

    public Fleet(List<Account> seen_by) {
        this.seen_by = seen_by;
    }

    public List<Account> getSeen_by() {
        return seen_by;
    }

    public void setSeen_by(List<Account> seen_by) {
        this.seen_by = seen_by;
    }
}
