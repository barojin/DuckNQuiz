// Placed in the package “school.assessment”
package school.assessment;

/* The Question object delegates an algorithm to various objects which implementing Question
*  This has a HAS-A relationship between parent and child class such that Question has a Fillin.
* */
public interface Question {
    // This interface has a function mark(String ans) that returns boolean variable
    public boolean mark(String ans);
    // to get the private attribute, to compare the answer whether correct in Quiz class,
    public String getAnswer();
}
