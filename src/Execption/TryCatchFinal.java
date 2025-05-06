package Execption;

public class TryCatchFinal {

    public static int divide(int a, int b){
        int c = a/b;
        return c;
    }
    public static void main(String[] args) {

        try {
            // Code that might throw an exception
            int result = divide(10, 0); // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            // Handle the specific exception
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        } finally {
            // This block will always execute, regardless of whether an exception is caught or not
            System.out.println("Finally block executed.");
        }
        
    }
    
}
