package JavaSpringBootMS.Exception;

// creating custom execption
class MyExecption extends Exception{
    MyExecption(String s){
        super(s);
    }
}

public class CustomExecption {
    public static void main(String[] args) {
        int a = 20;
        int ans = 0;

        try{
            ans = 18/a;
            if(ans == 0)
                // thorws the errror
                throw new MyExecption("Throwring my execption"); 
        }
        // catch the custom execption
        catch(MyExecption e){
            System.out.println("Catched the execption");
        }
        catch(Exception e){
            System.err.println("Defult execption");

        }
    }
    
}
