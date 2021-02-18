/*
The purpose of the file: This file is the MultiChoice: a concrete child class of Question
save the question, examples and answer in the MultipleChoice object and display the question and send the mark the answer
 */
package school.assessment;

import java.util.List;

// a concrete child class of Question
public class MultipleChoice implements Question{
    //public boolean mark(String ans) compares it to the correct answer set in the constructor
    @Override
    public boolean mark(String ans) {
        if (ans.toLowerCase().equals(this.answer.toLowerCase())){
            return true;
        }
        return false;
    }

    // using the private, these attributes are encapsulated
    // Store the question text
    private String text;
    // Store the examples in List
    private List<String> examples;
    private String answer; // The answer parameter for mark() is the answer chosen by a test taker

    // The constructor without parameters
    public MultipleChoice(){};

    // The constructor takes 3 parameters: question for the String text to display to the user taking the quiz/exam
    // examples is a List<String> for the possible answers to display
    // answer is the String for the correct answer
    public MultipleChoice(String text, List<String> examples, String answer) {
        this.text = text;
        this.examples = examples;
        this.answer = answer;
    }

    // set the text
    public void setText(String text) {
        this.text = text;
    }

    // set the example
    public void setExamples(List<String> examples) {
        this.examples = examples;
    }

    // provide the answer to outer class which is generated
    @Override
    public String getAnswer() {
        return answer;
    }

    // set the answer
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // Override toString() to return a String with the text followed by each possible answer on a separate line
    @Override
    public String toString() {
        return "MultipleChoice{" +
                "question=" + text + '?' + '\n' +
                "examples=" + examples +
                '}';
    }
}
