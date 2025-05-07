class A{                            //PARENT CALSS
    public int add(int a, int b){
        return a+b;
    }
}

class B extends A{                  // single inheritence = CHILD CLASS
    public int sub(int a, int b){
        return a-b;
    }

}

class C extends B{                  // multiple inheritance = CHILD CLASS
    public int mul(int a, int b){
        return a*b;
    }

}

public class InheratanceExample {
    public static void main(String[] args) {

        C calc = new C();
        int a = calc.mul(6, 3);
        System.out.println(a);
        
    }
    
}
