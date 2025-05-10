package JavaSpringBootMS.Exception;

// class A{
//     public void show()
//     {
//         Class.forName(Calc);
//     }
// }

public class Throws {
    public static void main(String[] args) {

        Class.forName(Calc);

        try{
            Class.forName(Calc);
        }
        catch(Exception e){
            System.out.println(e);

        }
        
    }
    
}
