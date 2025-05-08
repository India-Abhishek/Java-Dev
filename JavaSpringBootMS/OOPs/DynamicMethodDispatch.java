class A{
    public void show(){
        System.out.println("In class A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In class B");
    }
}

class C extends B{
    public void show(){
        System.out.println("In class C");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // only possible in inheratance
        // Dynamic method dispatch = which method it will call we are not sure
        A obj = new C();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();   // polymorphism same object have diffrent behaviour.

        
    }
    
}
