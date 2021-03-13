package account;

import java.util.List;

public class SavedSearch {
    private List<String> keyWords;
    private Account account;

    public SavedSearch(List<String> keyWords, Account account) {
        this.keyWords = keyWords;
        this.account = account;
    }

    public List<String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(List<String> keyWords) {
        this.keyWords = keyWords;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
