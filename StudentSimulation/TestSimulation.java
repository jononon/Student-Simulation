import java.util.Random;
import java.util.ArrayList;
public class TestSimulation {
    public static void main(String args[]) {
        Random r = new Random(System.nanoTime());
        int size;
        int numberOfQuestions = 5;
        ArrayList<Double> scores = new ArrayList<Double>();
        
        for(int i = 0; i<1000000; i++) {
            size = r.nextInt(50);
            //Set up key
            ArrayList<String> key = new ArrayList<String>();
            for(int v = 0; v<size; v++)
                key.add(""+((char)(r.nextInt(5)+65)));
            System.out.println(i+" - Key: "+key);
            
            //Set up students
            ArrayList<StudentAnswerSheet> students = new ArrayList<StudentAnswerSheet>();
            for(int j=0; j < r.nextInt(); j++)
                students.add(new StudentAnswerSheet(i, size));
            
            for(StudentAnswerSheet student:students)
                scores.add(student.getScore(key));
        }
        double sum = 0;
        for(Double score:scores)
            sum+=score;
        System.out.println(sum/scores.size());
        System.out.println("Made by Jonathan Damico");
    }
}