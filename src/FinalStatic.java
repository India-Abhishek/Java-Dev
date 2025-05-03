public class FinalStatic {
    static int a = 10;                      //static keyword belongs to the class 

    static final double PI = 3.14159;       // Static final variable
    public static void display(int num){
        num = num+10;
        System.out.println(num);
        System.out.println(a);
        System.out.println(PI);

    }

    public static void checkstatic(int n){
        a = a+n;
        System.out.println(a);
    }

    public static void main(String[] args) {
        final int speed = 100; //Final variable
        display(speed);
        //speed = speed + 10; // Compilation Error: Cannot reassign a final variable
        System.out.println(speed);

        checkstatic(10);
        System.out.println(a); //Can be accessed using the class name directly
        System.out.println(PI);

    }
    
}
