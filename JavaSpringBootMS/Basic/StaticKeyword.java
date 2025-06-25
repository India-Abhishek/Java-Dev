class Student
{
    int roll;
    String name;
    static String School; // using static keyword to make the variable common to all object. 
        // A common variable that used all object

        //if its updated then it will be shared with all the object.

    public void show(){
        System.out.println(roll + " : " + name + " : " + School);
    }
}


public class StaticKeyword {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.roll = 1;
        st1.name = "Abhi";
        st1.School = "SU";

        Student st2 = new Student();
        st2.roll = 2;
        st2.name = "Aman";
        st2.School = "SU";

        Student st3 = new Student();
        st3.roll = 3;
        st3.name = "Anand";
        st3.School = "Amity";

        st1.show();
        st2.show();
        st3.show();
        
    }
    
}
