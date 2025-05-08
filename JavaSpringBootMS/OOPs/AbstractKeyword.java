// we cant create an object of an abstract class.
// if a class have a abstract method so the class also should be defined as abstract.
// if a method is defined as abstract then its inherate class should defind the methed.

abstract class Car{
    public abstract void drive();

    public void playMusic(){
        System.out.println("Playing music...");
    }
}

class Swift extends Car{    //Concrete class
    public void drive(){
        System.out.println("Driving...");
    }

    public void autoPark(){
        System.out.println("this car can park it self");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        Car obj = new Swift();    // can't create a object of a abstract class but we can create a object of concrete class
        obj.drive(); 
        obj.playMusic();   
    }
    
}
