// importing AdvMath from diffrent package to access the classes of AdvMath.
import Calculator.AdvMath;

public class Packages {
    public static void main(String[] args) {
        // To import a class from a diffrent package we need to import that first in our code.
        AdvMath calc = new AdvMath();
        int result = calc.add(4, 5);
        System.out.println(result);

    }

    
}
