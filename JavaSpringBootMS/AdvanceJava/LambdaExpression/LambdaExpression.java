package JavaSpringBootMS.AdvanceJava.LambdaExpression;

/*
 *  #LAMBDA expression only works with functional interface.
 * 
 * 
 */
@FunctionalInterface
interface A{
    void show();
}

interface B{
    void show2(int i);
}

interface C{
    int add(int j, int k);
}

public class LambdaExpression {
    public static void main(String[] args) {

        A obj = new A() {
            public void show(){
                System.out.println("In inner/ anoyonmous class");
            }
        };

        obj. show();

        //Here comes the LAMBDA Expression
        // It reduce the code.
        A obj2 = () -> System.out.println("in LAMBDA Expression");
        obj2.show();

        B obj3 = (i) -> System.out.println("in lambda againnn vrooo!");
        obj3.show2(8);

        // if interface has mehtod which returns
        C obj4 = (int j, int k) -> j+k; //we can directly pass the return value.
        obj4.add(5, 3);

        
    }
    
}
