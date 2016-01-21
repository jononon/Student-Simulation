import java.util.ArrayList;

public class TestResults
{
    //instance variables
    private ArrayList<StudentAnswerSheet> sheets;
    /** other instance variables may need to be added
     */
    
    //constructors
    /** constructors need to be added
     */
    public TestResults (ArrayList<StudentAnswerSheet> sheets) {
        this.sheets = sheets;
    }
    
    //other methods
    /** Precondition:   sheets.size() > 0;
     *                  all answer sheets in sheets have the same number of answers
     *  @param key the list of correct answers represented as strings of length one
     *      Precondition: key.size() is equal to the number of answers
     *                    in each of the answer sheets in sheets
     */
    public String highestScoringStudent(ArrayList<String> key)
    {
        double highestScore = Double.MIN_VALUE;
        String highestScorer = "";
        for(StudentAnswerSheet sheet : sheets) {
            double score = sheet.getScore(key);
            if(score>highestScore) {
                highestScore = score;
                highestScorer = sheet.getName();
            }
        }
        return highestScorer;
    }
    
    /** Other methods may be needed
     */
    
    public ArrayList<StudentAnswerSheet> getSheets() { return this.sheets; }
    public void setSheets (ArrayList<StudentAnswerSheet> sheets) {this.sheets = sheets; }
}
