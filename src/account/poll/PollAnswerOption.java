package account.poll;

public class PollAnswerOption {
    private String option;
    private int answers;

    public PollAnswerOption(String option, int answers) {
        this.option = option;
        this.answers = answers;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public int getAnswers() {
        return answers;
    }

    public void setAnswers(int answers) {
        this.answers = answers;
    }
}
