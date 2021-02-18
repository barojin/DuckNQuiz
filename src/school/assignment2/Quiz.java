package school.assignment2;

import java.util.List;

public abstract class Quiz {
    List<Question> questionList;

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public void add(Question question){
        this.questionList.add(question);
    }
    public int grade(List<String> answers){
        int number = 0;
        for (int i=0; i<answers.size(); i++){
            if (this.questionList.get(i).getAnswer().toLowerCase().equals(answers.get(i).toLowerCase())){
                number++;
            }
            System.out.println("Quiz Correct answer: " + this.questionList.get(i).getAnswer());
            System.out.println("Test Taker's answer: " + answers.get(i));
            System.out.println();
        }
        return number;
    }
}
