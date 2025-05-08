package JavaSpringBootMS.QuizConsoleApp;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello");
        
        //creating a question service object 
        QuestionService service = new QuestionService(); 

        //calling a method which is a part of questionservice
        service.displayQuestion();

        service.playQuiz();
        service.printScore();
    }
    
}
