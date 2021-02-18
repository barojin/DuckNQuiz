/*
The purpose of the file: This file is the Quiz class which is a concrete class that contains List<Question> questionList,
This client class makes use of an encapsulated Question interface to generate the questionList.
 */
package school.assessment;

import java.util.ArrayList;
import java.util.List;

// Client, a concrete class that contains a bunch of Question objects
public class Quiz {
    // questionList is the List from Collections in Java and contains the question in List data structure.
    private List<Question> questionList;

    // Constructor, it initializes the attribute in this class
    public Quiz() {
        this.questionList = new ArrayList<>();
    }

    // void add(Question question) to add a question to the quiz
    void add(Question question){
        this.questionList.add(question);
    }

    // return questionList which is required to make the problems for displaying in the client section
    public List<Question> getQuestionList() {
        return questionList;
    }

    // take the test taker's answers in List<string> and return the number of correct answers in the parameter and print answers of both.
    int grade(List<String> answers){
        // number variable counts the number of correct answer
        int number = 0;
        // This loop iterates all of elements in the questionList and mark the answer and increase the number when it is marked and print the answer of both.
        for (int i=0; i<answers.size(); i++){
            if (this.questionList.get(i).mark(answers.get(i))){
                number++;
            }
            System.out.println("Quiz Correct answer: " + this.questionList.get(i).getAnswer());
            System.out.println("Test Taker's answer: " + answers.get(i));
            System.out.println();
        }
        return number;
    }

}
