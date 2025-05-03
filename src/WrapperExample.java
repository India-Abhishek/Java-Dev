public class WrapperExample {
    public static void main (String [] args){
        int num = 10;
        Integer obj = num;

        String str = obj.toString();

        System.out.println(str);

        int value = obj;
        System.out.println(value);

        // Primitive type
        int num2 = 5;

        // Wrapper class (Boxing)
        Integer obj2 = num; // Autoboxing

        // Using utility method
        String str2 = obj.toString(); // Converts Integer to String

        // Unboxing
        int value2 = obj; // Auto-unboxing
        System.out.println("Primitive: " + value);

    }
    
}
