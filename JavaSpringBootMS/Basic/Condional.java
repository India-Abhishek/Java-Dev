//Loops
public class Condional {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int z = 10;
        if (x>y && x>z){
            System.out.println(x+" is Gretest num");
        }
        else if (y>z){                              // Not comparing x with y, already compared that y is greter than x in above statement
            System.out.println(y+" is Gretest num");
        }
        else{
            System.out.println(z+" is Gretest num");
        }

        //ternatory >> ?: (ternary operator)
        int a = 5; 
        int result = 0;
        // checking odd even
        result = a%2==0 ? 10 :20;  // if a is even it will store 10 else 20.
        System.out.println(result);

        // Switch >> based on a value it execute the patacular case.

        int day = 1;
        switch (day) { //checkes the value passed will execute the case.
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Not valid weekday");
        }

// for loop
        int count = 5;

        for(int i = 0; i<= count; i++){   
            //start with value >> check condition if satisfied the execute the body if not break loop>> increment the vaule
            System.out.println("Day = "+i);

            for(int j = 0; j<5; j++) {              //Nested~inner loop
                System.out.println((j+1) +" AM"); //we are doing operation in bracket so it not concatinate with string
            }                     
        }

//while loop
        int j = 0;
        while(j<=5){
            System.out.println("Number is = "+j);

            int k = 0;

            while(k <3){                        //inner~nested loop
                System.out.println("hello "+k);
                k++;
            }

            j++;
        }

// Do while loop
// Use when if conditoon fails but still wants to execute some thing once.
        int m = 5;
        do {                                        // if conditions fails it will execute once 
            System.out.println("do while loop "+m);
            m++;
        } 
        while(m<4);

        System.out.println(m);

    }

    
}
