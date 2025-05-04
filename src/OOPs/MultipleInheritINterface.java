package OOPs;

interface Swim{
    void swim();
}

interface Flyer{
    void fly();
}

class Bird implements Swim, Flyer {
    // Constructor or methods must be inside class blocks

    @Override
    public void swim() {
        System.out.println("Bird is swimming");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

public class MultipleInheritINterface {
    public static void main(String[] args) {
        Bird a = new Bird();
        a.fly();
        a.swim();
    }
    
}
