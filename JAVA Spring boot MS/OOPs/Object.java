class calc{ // create a class
    static String s = "Done";
    int c;

    public int add(int a, int b){
        c = a+b;
        return c;
    }

    public static void staticMethod(){
        System.out.println("in static method "+c); //we can not use non static variable in static method!!!
    }
}

public class Object {
    public static void main(String[] args) {
        calc c = new calc(); // create an object with help of new keyword
        int result = c.add(3,6); //calling method of an object
        System.out.println(result);

        calc.staticMethod();
    }
    
}
