// we cant create an object of an abstract class.
// if a class have a abstract method so the class also should be defined as abstract.
// if a method is defined as abstract then its inherate class should defind the methed.



public class AbstractKeyword {
    public static void main(String[] args) {
        Car obj = new Swift();    // can't create a object of a abstract class but we can create a object of concrete class
        obj.drive(); 
        obj.playMusic();   
    }
    
}
