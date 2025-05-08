class calc{                         // create a class
    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        calc c = new calc(); // create an object with help of new keyword
        int result = c.add(3,6); //calling method of an object
        System.out.println(result);

        double d = c.add(3.5, 5);
        System.out.println(d);
    }
    
}
