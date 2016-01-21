import java.util.ArrayList;
import java.util.Random;
public class StudentAnswerSheet
{
    //instance variables
    private String name;
    private ArrayList<String> answers; //the list of the student's answers
    /** other instance variables need to be added
     */
    
    //constructors
    /** constructors need to be added
     */
    public StudentAnswerSheet (String name, ArrayList<String> answers) {
        this.name = name;
        this.answers = answers;
    }
    public StudentAnswerSheet (int studentNumber, int size) {
        guess(size);
        this.name = "Student "+studentNumber;
    }
    
    //other methods
    public ArrayList<String> getAnswers()   { return this.answers; }
    public String getName()                 { return this.name; }
    public void setAnswers (ArrayList<String> answers)  { this.answers = answers; }
    public void setName (String name)                   { this.name = name; }
    
    /** @param key the list of correct answers, represented as strings of length one
     *          Precondition: key.size() is equal to the number of answers in the answer sheet
     *  @return this student's test score        
     */
    public double getScore(ArrayList<String> key)
    {
        double score = 0;
        for(int i = 0; i<key.size(); i++)
            if(this.answers.get(i).equals("?")) {}
            else if(key.get(i).equals(this.answers.get(i)))
                score+=1;
            else
                score-=0.25;
        return score;
    }
    
    public String toString () {
        return(this.name+": "+this.answers);
    }
    
    public void guess() {
        this.guess(10);
    }
    
    public void guess (int numberOfQuestions) {
        this.guess(numberOfQuestions, 5, true);
    }
    
    public void guess (int numberOfQuestions, int numberOfAnswers, boolean hasBlankAnswers) {
        answers = new ArrayList<String>();
        Random r = new Random(System.nanoTime());
        for(int i = 0; i<numberOfQuestions; i++) {
            if(hasBlankAnswers) {
                int guess = r.nextInt(numberOfAnswers+1);
                if(guess == numberOfAnswers)
                    this.answers.add("?");
                else
                    this.answers.add(""+((char)(guess+65)));
            }
            else {
                this.answers.add(""+((char)(r.nextInt(numberOfAnswers)+65)));
            }
        }
    }
}
    
    
