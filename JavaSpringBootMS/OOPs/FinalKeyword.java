/*
 * To make constants we use Final keyword.
 * Final keyword is used by - variable, method, class 
 * 
 * Once we make a class final --- it can not be inherate
 * once we make a method final no one can over ride it.
 * 
 */

final class A{
     public final void show(){
        System.out.println("Parent");
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
}

class B //extends A //Once we make a class final --- it can not be inherate
{
    public void show(){ // when a make a method final no one can over ride it
        System.out.println("inf B show method");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        final int a = 10;
        //a = 10; can not be cahanged once it initilized with final keyword - thats make the variable constant.
        System.out.println(a);
        
        B obj = new B();
        /*

        obj.add(6, 8); //obj of class B cant access the add method because it is a method of a final class which can not be inherite.
        
        */
        obj.show();


        
    }
}
