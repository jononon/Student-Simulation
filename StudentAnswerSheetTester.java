import java.util.ArrayList;

public class StudentAnswerSheetTester
{
    
    public static void main(String[] args)
    {
        ArrayList<String> answers = new ArrayList<String>();
        ArrayList<String> key = new ArrayList<String>();
        for(int i = 0; i<5; i++) {
            answers.add(""+(char)(i+65));
            key.add(""+(char)(i+65));
        }
        StudentAnswerSheet sheet1 = new StudentAnswerSheet("Jonathan",answers);
        System.out.println(sheet1);
        System.out.println(sheet1.getScore(key));
        answers.add(answers.remove(0));
        System.out.println(sheet1.getScore(key));
    }
}
