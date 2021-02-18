package school.assignment2;
import java.util.List;

public class MultipleChoiceQuestion implements Question{
    private String text;
    private List<String> examples;
    private String answer;

    public MultipleChoiceQuestion(String text, List<String> examples, String answer) {
        this.text = text;
        this.examples = examples;
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getExamples() {
        return examples;
    }

    public void setExamples(List<String> examples) {
        this.examples = examples;
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
        return "MultipleChoice{" +
                "question=" + text + '?' + '\n' +
                "examples=" + examples +
                '}';
    }
}
