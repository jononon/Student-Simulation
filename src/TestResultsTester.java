import java.util.ArrayList;

public class TestResultsTester
{
    
    public static void main(String[] args)
    {
        ArrayList<StudentAnswerSheet> students = new ArrayList<StudentAnswerSheet>();
        for(int i = 0; i<100; i++)
            students.add(new StudentAnswerSheet(i, 10));
        ArrayList<String> key = (new StudentAnswerSheet(-1, 10)).getAnswers();
        System.out.println(key+"\n");
        for(StudentAnswerSheet sheet:students) {
            System.out.println(sheet);
            System.out.println(sheet.getScore(key));
            System.out.println();
        }
        /*
        for(StudentAnswerSheet sheet:students) {
            System.out.println(sheet.getScore(key));
        }
        */
    }
}
