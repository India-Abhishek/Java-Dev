import Calculator.Math1;

class Calcalutaor{                      //creatting a class
    public int add(int num1, int num2){                 // Method to perform 
        System.out.println("number has been added");
        int result = num1+num2;
        return result;
    }
}

class Computer
{
    public void playMusic()
    {
        System.out.println("Playing Music...");
    }

    public String getMePen(int cost)
    {
        if (cost >= 10)
        {
            return "Pen";
        }
        return "invalid cost";
    }
}


public class Basic {
    public static void main(String args[]){
        int a = 5;
        int b = 6;

        // Creating a new object using NEW keyword of calcalutor type. AND assigning that in variable calc of type calculator
        Calcalutaor calc = new Calcalutaor(); 

        int result = calc.add(a,b);

        System.out.println(result);

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen(1);
        System.out.println(str);


        //int arr[]= new int[5];
        int arr2[] = {1,2,3,4,5};

        for(int i = 0; i<=4; i++)
        {
            System.out.println(arr2[i]);
        }

System.out.println("till now over");


// 2D array

        int arr3[][] = new int[3][4];

        //Assigning the values
        for(int j = 0; j<3; j++)
        {
            for(int k = 0; k<4; k++)
            {
                arr3[j][k] = (int) (Math.random() * 10); 
                //math.random function returns the float value less than 1 so multiplying with 10, and typecasting into integer and stoeing at the array index
            }
        }
        
        //retriving the values
        for(int j = 0; j<3; j++)
        {
            for(int k = 0; k<4; k++)
            {
                System.out.print(arr3[j][k]+ " ");
            }
            System.out.println();
        }



    }
    
}
