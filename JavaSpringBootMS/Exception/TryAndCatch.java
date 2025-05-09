package JavaSpringBootMS.Exception;

public class TryAndCatch {
    public static void main(String[] args) {
        int a = 1;
        int ans = 0;
        int arr [] = new int[4];

        //System.out.println(arr[5]);

        try{
        ans = 19/a;
        System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bond exception");
        }
        System.out.println(ans);
    }
    
}
