Types of interface:

1. Normal
2. Functional, SAM (Single abstract method)
3. Marker

1. Normal
    A Interface which have multiple methods called normal interface.
    ex:
    interface A{
        void method1(){
            sys("dskfb");
        }

        int method1(){
            return 1;
        }

        void method1(){
            sys("skdu");
        }
    }

2. Functional / SAM
    A interface which have only one function is called Functional/SAM interface.

    interface A{
        void method(){

        }
    }

3. Marker
    Interface which have no function.

    interface A{
        ----------------------------------
    }

