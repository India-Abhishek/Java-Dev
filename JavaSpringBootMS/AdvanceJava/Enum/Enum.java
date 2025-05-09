package JavaSpringBootMS.AdvanceJava.Enum;

// enum use for declare constants 

enum Status{
    Waiting, Start, Running, Error, Success;
}

public class Enum {
    public static void main(String[] args) {
        Status a = Status.Success;
        System.out.println(a);

        //ordinal function use to see order of the constant
        System.out.println(a.ordinal());

        //to get all values enum constatnts values = it stored in array
        Status [] s = Status.values();

        System.out.println(s[1]);

        //to print all use for each loop

        for(Status m : s){
            System.out.println(m+" : "+m.ordinal());
        }

        switch(a){
            case Waiting:
            System.out.println("Waiting...");
            break;

            case Running:
            System.out.println("Running...");
            break;

            case Start:
            System.out.println("Starting...");
            break;

            case Error:
            System.out.println("Error!!!");
            break;

            default:
            System.out.println("Completed");
            break;
            
        }
    }
    
}
