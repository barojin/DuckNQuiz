/*
The purpose of the file: This file is the Driver class which is a concrete class that contains static void main function that
displays the questions and takes the answer via the terminal prompt from the keyboard input typed by the test taker.
 */

package school.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    // Driver code, set the questions in Quiz class through the Question interface that is inherited by Fillin and MultipleChoice classes
    public static void main(String[] args){
        // quiz is initialized to a Quiz class
        Quiz quiz = new Quiz();

        // Generates Questions and added into questionList in quiz object.
        try{
            Question q1 = new MultipleChoice("Favor composition over what?",
                    List.of("inheritance", "extend", "child"),
                    "inheritance");

            Question q2 = new FillIn("___ defines a family of algorithms, encapsulates each one, and makes them interchangeable",
                    "The Strategy Pattern");

            MultipleChoice q3 = new MultipleChoice();
            String q = "What Fewer unintended consequences from code changes and more flexibility in your systems?";
            List<String> ex =  new ArrayList<>();
            ex.add("encapsulation");
            ex.add("businessCohesion");
            ex.add("technologyCohesion");
            String a = "encapsulation";
            q3.setText(q);
            q3.setExamples(ex);
            q3.setAnswer(a);

            FillIn q4 = new FillIn();
            String qf = "Patterns give us a shared ___";
            String af = "vocabulary";
            q4.setQuestion(qf);
            q4.setAnswer(af);

            quiz.add(q1);
            quiz.add(q2);
            quiz.add(q3);
            quiz.add(q4);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        // answers takes the test takers answer from the terminal input
        List<String> answers = new ArrayList<>();

        // input is the scanner
        Scanner input = new Scanner(System.in);

        // This code in try takes the user's input
        try{
            for (Question q: quiz.getQuestionList()){
                System.out.println();
                System.out.println(q.toString());

                String answer = "";
                System.out.print("Enter your answer: ");
                try {
                    while (true) {
                        answer = input.nextLine();
                        if (answer.matches("^[a-zA-Z0-9_ ]*$"))
                            break;
                        else
                            System.out.println("Enter answer in alphanumeric form.");
                    }
                }catch (Exception e){
                    System.out.println("What the fuck");
                    System.out.println(e.getMessage());
                }
                answers.add(answer.strip());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            input.close();
        }

        // print the user's score via the quiz.grade function
        System.out.println();
        System.out.println("*******RESULT*******");
        System.out.println("Your score: " + quiz.grade(answers));

    }
}
