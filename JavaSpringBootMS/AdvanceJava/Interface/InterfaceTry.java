//package JavaSpringBootMS.AdvanceJava.Interface;

abstract class Computer{
    public abstract void Code();
}

class Desktop extends Computer{
    public void Code(){
        System.out.println("In the computer");
    }
}

class Laptop extends Desktop{
    public void Code(){
        System.out.println("in my laptop");
    }
}

class Dev{
    public void myDev(Computer Laptop){
        Laptop.Code();
        //lap.myLaptop();
        //lap.myComputer();
        //System.out.println("in Dev");
    }
}


public class InterfaceTry {
    public static void main(String[] args) {

        Computer desk = new Desktop();
        Computer lap = new Laptop();
        
        Dev aman = new Dev();
        aman.myDev(desk); // calling Dev app and passing the object of class Laptop
        aman.myDev(lap);
    }
    
}
