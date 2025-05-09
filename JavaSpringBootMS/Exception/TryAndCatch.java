package JavaSpringBootMS.Exception;

public class TryAndCatch {
    public static void main(String[] args) {
        int a = 1;
        int ans = 0;
        int arr [] = new int[4];
        String str = null;

        //System.out.println(arr[5]);

        try
        {
        ans = 19/a;
        System.out.println(str.length());
        System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bond exception");
        }
        // some execption what we are not heldling is that case we use Execption
        catch(Exception e){
            System.out.println("something went wrong..!");
        }
        
        //System.out.println(ans);
    }
    
}
