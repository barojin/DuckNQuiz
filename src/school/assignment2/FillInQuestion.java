package school.assignment2;

public class FillInQuestion implements Question{
    private String text;
    private String answer;

    public FillInQuestion(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String getAnswer() {
        return this.answer;
    }

    @Override
    public String toString() {
        return "FillIn{" +
                "question='" + text + '?' +
                '}';
    }
}
