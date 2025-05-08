class StudentClass
{
    int roll;
    String name;
    int marks;
}

public class Student {
    public static void main(String[] args) {

        StudentClass st1 = new StudentClass();
        st1.roll = 1;
        st1.name = "Abhi";
        st1.marks = 80;

        StudentClass st2 = new StudentClass();
        st2.roll = 2;
        st2.name = "Aman";
        st2.marks = 88;

        StudentClass st3 = new StudentClass();
        st3.roll = 3;
        st3.name = "Anand";
        st3.marks = 90;

        StudentClass allSt[] = new StudentClass[3];
        allSt[0] = st1;
        allSt[1] = st2;
        allSt[2] = st3;

        for (int i=0; i<allSt.length; i++)
        {
            System.out.println(allSt[i].name + " " + allSt[i].roll);
        }

System.out.println("//--------------------------------//");

        for (StudentClass stud : allSt) //Each loop ~ enhanced for loop, explations is in below.
        {
            System.out.println(stud.name + " " + stud.roll);
        }

System.out.println("//--------------------------------//");

        int arr[] = {5,6,2,7};

        for(int index : arr) //stores one value at a time in index variable.
        {
            System.out.println(index);
        }

        //System.out.println(st1);

        //StudentClass st4 = new StudentClass(4,"Om",60); //will not work because we havent created a constructor yet.

        
    }
}
