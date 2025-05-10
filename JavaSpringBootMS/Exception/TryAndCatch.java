package JavaSpringBootMS.Exception;

import java.util.Scanner;

// throw keyword is used to throw the exception.
// FInally use for close the resourse and it can be use without a catch


public class TryAndCatch {
    public static void main(String[] args) {
        System.out.println("Enter a number for a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = 0;
        int arr [] = new int[4];
        String str = null;

        //System.out.println(arr[5]);

        try
        {
        ans = 18/a;
            if(ans == 0)
                throw new ArithmeticException(); // calling the Art-Execp. to thorw the error.

        System.out.println(str.length());
        System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic-Exception: "+ e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bond exception");
        }
        // some execption what we are not heldling is that case we use Execption
        catch(Exception e){
            System.out.println("something went wrong..!\nExecption is: "+e);
        }
        // Finally block executed inrespective of Execption
        finally{
            System.out.println("Bye!! in finally block");
            sc.close();
        }
        
        //System.out.println(ans);
    }
    
}
