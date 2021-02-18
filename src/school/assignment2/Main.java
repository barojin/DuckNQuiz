package school.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            Quiz midterm = new Midterm();
            midterm.add(new MultipleChoiceQuestion("Favor composition over what?", List.of("inheritance", "extend", "child"), "inheritance"));
            midterm.add(new FillInQuestion("___ defines a family of algorithms, encapsulates each one, and makes them interchangeable", "The Strategy Pattern"));

        List<String> answers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        try{
            for (Question q: midterm.getQuestionList()){
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

        System.out.println();
        System.out.println("*******RESULT*******");
        System.out.println("Your score: " + midterm.grade(answers));
    }
}
