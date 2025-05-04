package OOPs;

class calculator{
    // Method overloading
    public int sum(int a, int b){
        return a+b;
    }

    //for method overloading something has to be change
    //we can have multiple method with same name but with diffrent paramenters or with diffrent type

    public double sum(double a, double b){
        return a+b;
    }
}


class animal{
    public void sound(){
        System.out.println("This animal Bark");
    }
}

class dog extends animal{

    @Override               // use override keyword to code readability purpose
                            // it will also work fine if we dont use it.
    
    public void sound(){
        System.out.println("Dog bark");
    }
}

public class Overloading {
    public static void main (String [] args){
        calculator cal = new calculator();
        int result = cal.sum(10, 20);       // Calls int add(int a, int b)
        System.out.println(result);
        double result2 = cal.sum(66, 22.2); // Calls double add(double a, double b)
        System.out.println(result2);

        animal a = new dog();   // Upcasting
        a.sound();              // Calls Dog's overridden method

    }
    
}
