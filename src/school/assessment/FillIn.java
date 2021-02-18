/*
The purpose of the file: This file is the FillIn: a concrete child class of Question
save the question and answer in the FillIn object and display the question and send the mark the answer
 */
package school.assessment;

// FillIn: a concrete child class of Question
public class FillIn implements Question{
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
    // Store the answer
    private String answer;

    // The constructor without parameters
    public FillIn(){};

    // The constructor takes 2 parameters: question for the String text to display to the user taking the quiz/exam
    // answer is the String for the correct answer
    public FillIn(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    // set the question
    public void setQuestion(String text) {
        this.text = text;
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

    // Override toString() to return a String with the text to display
    @Override
    public String toString() {
        return "FillIn{" +
                "question='" + text + '?' +
                '}';
    }
}
