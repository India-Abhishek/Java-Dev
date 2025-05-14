package JavaSpringBootMS.AdvanceJava.Interface;

interface display{
    int i = 500;

    void sum(int i, int j);
}

class Add implements display{
    public void sum(int i, int j){
        System.out.println(i+j);
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        int a = 10, b=17;

        // obj of class Add
        Add obj = new Add();
        //Calling the method of the class by object
        obj.sum(a,b);
        // accessing i variable through object class
        System.out.println(obj.i);
    }
    
}
