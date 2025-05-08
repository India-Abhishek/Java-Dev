// super = call the constructor of super class
            
class A {               // Parent class A
    private int id;
    private String name;

    // Default constructor
    public A() {
        System.out.println("In A class");
    }

    // Parameterized constructor
    public A(int id, String name) {
        // 'this' is used to refer to current class fields
        this.id = id;
        this.name = name;
        System.out.println("In parent class parameterized constructor");
    }
}

// Child class B extending class A
class B extends A {

    // Default constructor of class B
    public B() {
        // 'super' is used to call the parent class's parameterized constructor
        super(1, "Test");  // Step 1: Calls A's parameterized constructor

        // Step 2: Control returns here after A's constructor finishes
        System.out.println("In class B");
    }
}

// Main class to run the program
public class ThisAndSuper {
    public static void main(String[] args) {
        // Step 0: Object of class B is created
        B obj = new B();

        // Step 3: Execution starts from B's constructor
        //         → Calls A's constructor first
        //         → Prints messages in order
    }
}
