//Think of an animal family.
// Dogs and cats both inherit general
// animal characteristics but also
// have their own unique behaviors.

package OOPs;

class Animal{
    public void eat(){
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("this dog bark");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
        
    }
    
}
