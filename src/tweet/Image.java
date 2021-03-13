package tweet;

import account.Account;

import java.util.List;

public class Image {
    private String file;
    private String caption;
    private List<Account> tagged;

    public Image(String file, String caption, List<Account> tagged) {
        this.file = file;
        this.caption = caption;
        this.tagged = tagged;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public List<Account> getTagged() {
        return tagged;
    }

    public void setTagged(List<Account> tagged) {
        this.tagged = tagged;
    }
}
