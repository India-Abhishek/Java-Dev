public class Wrapper {
    public static void main(String[] args) {
        int num = 10;                           //Int num is primitive data type 
        Integer obj = Integer.valueOf(num);     // 

        int value = obj.intValue();
        System.out.println(value);


        int num2 = 30; // Primitive type
        Integer obj2 = Integer.valueOf(num2); // Primitive to Wrapper (Boxing)

        int value2 = obj2.intValue(); // Wrapper to Primitive (Unboxing)
        System.out.println(value2);
    }    
}
