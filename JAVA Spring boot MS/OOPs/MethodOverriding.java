class A{
    public void show(){
        System.out.println("In A show");
    }

    public void config(){
        System.out.println("in config");
    }

    public int add(int a, int b){
        return a+b;
    }
}

class B extends A{  
    
    // overriding the method.
    public void show(){
        // The show method is overriding the show method of parent class.
        System.out.println("in B show");
    }

    //same parameter but with diffrent behaviour.
    public int add(int a, int b){
        return a+b+1;
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        int result = obj.add(3, 4); 
        // here the obj object will check if it has the add method.
            // if not than only it will extend from class A. 
        System.out.println(result);
    }
    
}
