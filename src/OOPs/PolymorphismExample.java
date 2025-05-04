package OOPs;

class Animal{
    public void sound(){
        System.out.println("this animal makes sound");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("this animal bark");
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
    }
}
