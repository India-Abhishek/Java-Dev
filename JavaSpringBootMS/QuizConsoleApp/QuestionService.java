package JavaSpringBootMS.QuizConsoleApp;

import java.util.Scanner;

public class QuestionService{
    //created a array object to hold the questions of size 5
    Question [] question = new Question[5];
    String selection[] = new String[5];

    //hard-coded questions
    //constructer to create the array object and set values.
    public QuestionService(){ 
        question[0] = new Question(1, "size of int", "2", "4", "6", "8", "4");
        question[1] = new Question(2, "size of double", "2", "4", "6", "8", "2");
        question[2] = new Question(3, "size of char", "2", "4", "6", "8", "2");
        question[3] = new Question(4, "size of long", "2", "4", "6", "8", "8");
        question[4] = new Question(4, "size of boolean", "2", "4", "6", "8", "6");
    }

    //method to print the all question from the array object
    public void displayQuestion(){
        for(Question m : question){ //takes one array values of question object each time and put it in "m".
            // m holdes the array data so we used getQuestion method which returns the value of question from array.
            System.out.println(m.getQuestion()); 
        }

        // If we want to print the object we need to use toString method.
        for(Question m : question){ 
            System.out.println(m); //it calls toString method and print the data in patacular format.
        }        
    }

    public void playQuiz(){
        //Printing the questions & options
        int i = 0;
        for(Question m : question){
            System.out.println("Question No. "+m.getId());
            System.out.println("\nQuestion: "+ m.getQuestion());
            System.out.println("\nChoose your answer from below:\n"+m.getOpt1());
            System.out.println(m.getOpt2());
            System.out.println(m.getOpt3());
            System.out.println(m.getOpt4());

            System.out.println();

            Scanner sc = new Scanner(System.in);

            selection[i] = sc.nextLine();
            i++;

            System.out.println();
            
            // if (ans == m.getOpt1() | ans == m.getOpt2() | ans == m.getOpt3() | ans ==m.getOpt4()){
            //     if (ans == m.getRightAns()){
            //         System.out.println("Your Answer is correct.");
            //     }
            //     else{
            //         System.out.println("Wrong Answer!!! Right ans is : "+m.getRightAns());
            //     }
            // }
            // else{
            //     System.out.println("Invalid option!");
            // }
        }
    }

    public void printScore(){
        int score = 0;
        for(int i=0; i<question.length; i++){
            Question que = question[i];         // store one question = one by one.
            String rightAns = que.getRightAns(); //STORE RIGHT ANS
            String userAns = selection[i]; // store user ans for every question

            // check the ans
            if(rightAns.equals(userAns)){ // used to check string equals or not.
                score++;
            }
        }
        System.out.println("----Quiz end----\nYour Score is: "+score);
    }
}
