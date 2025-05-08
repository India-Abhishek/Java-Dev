
// Multiple inheritance not work in java

import Calculator.AdvMath;
import Calculator.Math1;
import Calculator.VeryAdvCal;

public class Inheritance {
    public static void main(String[] args) {
        Math1 c = new Math1();
        int add = c.add(5,10);
        int sub = c.sub(10, 7);

        System.out.println(add+" : " +sub);
        
        AdvMath a = new AdvMath();      // this class extends Math class
                    // Single level  inheritance = inherite one class
        int add2 = a.add(3, 8);
        int mul = a.multiply(2, 7);
        System.out.println(add2+" : "+mul);


        VeryAdvCal adv = new VeryAdvCal(); // this class inherate advMath class and adv math class is inheraring mathc class
                    // using multi level inheritance  this class inherite multiple class.
        double mod = adv.Mod(6, 9);
        System.out.println(mod);

    }
    
}
