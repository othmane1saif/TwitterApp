package account.poll;

import java.util.List;

public class Poll {
    private String question;
    private int duration;
    private List<PollAnswerOption> answers;

    public Poll(String question, int duration, List<PollAnswerOption> answers) {
        this.question = question;
        this.duration = duration;
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<PollAnswerOption> getAnswers() {
        return answers;
    }

    public void setAnswers(List<PollAnswerOption> answers) {
        this.answers = answers;
    }
}
