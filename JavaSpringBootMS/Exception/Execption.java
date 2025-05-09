package JavaSpringBootMS.Exception;


public class Execption {
    public static void main(String[] args) {
        int a = 0;

        try{
            int ans = 10/a;
        }
        catch(Exception e){
            System.out.println("Execption error!!!");
        }

        System.out.println("code is working : " + a);
    }
    
}
