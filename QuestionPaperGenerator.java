import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionPaperGenerator {
    
    public static void main(String[] args) {
        
        List<Question> allQuestions = new ArrayList<>();
        allQuestions.add(new Question("What is the capital of France?", "Paris"));
        allQuestions.add(new Question("What is the largest planet in our solar system?", "Jupiter"));
        allQuestions.add(new Question("What is the highest mountain in the world?", "Mount Everest"));
        allQuestions.add(new Question("Who is the author of \"The Great Gatsby\"?", "F. Scott Fitzgerald"));
        allQuestions.add(new Question("What is the chemical symbol for gold?", "Au"));
        
        List<Question> selectedQuestions = generateQuestionPaper(allQuestions, 3);
        for (int i = 0; i < selectedQuestions.size(); i++) {
            Question q = selectedQuestions.get(i);
            System.out.printf("%d. %s%n", i + 1, q.getQuestion());
        }
    }
    
    
    public static List<Question> generateQuestionPaper(List<Question> allQuestions, int numQuestions) {
        List<Question> selectedQuestions = new ArrayList<>();
        
        
        Collections.shuffle(allQuestions);
        
        
        for (int i = 0; i < numQuestions && i < allQuestions.size(); i++) {
            selectedQuestions.add(allQuestions.get(i));
        }
        
        return selectedQuestions;
    }
}

class Question {
    private final String question;
    private final String answer;
    
    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    
    public String getQuestion() {
        return question;
    }
    
    public String getAnswer() {
        return answer;
    }
}
