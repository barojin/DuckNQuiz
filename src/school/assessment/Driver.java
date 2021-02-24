/*
The purpose of the file: This file is the Driver class which is a concrete class that contains static void main function that
displays the questions and takes the answer via the terminal prompt from the keyboard input typed by the test taker.
 */

package school.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Driver {
    public static void main(String[] args) {
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd-HH-mm-ss");
        // DateTimeFormatter.ofPattern("yyyyMMdd-HH-mm-ss").format(LocalDateTime.now())
        // System.out.println(dtf.format(LocalDateTime.now()));
        System.out.println(DateTimeFormatter.ofPattern("yyyyMMdd-HH-mm-ss").format(LocalDateTime.now()));


    }
}
