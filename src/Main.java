public class Main{

    public static void main(String[] args) {
        System.out.println("Abhishek");

        String str = "Hello";
        System.out.println(str);

        str = str + " World";
        System.out.println(str);

        // String buffer is thread safe because it provide synchronization - append, insert and modify the charaters.
        StringBuffer str2 = new StringBuffer( "Aman"); // creating a string buffer its lenght is 16 + lenght of given string
        str2.append(" Kumar");                          // appending string in str2 (String Buffer)
        str2.insert(0, "Hi ");                   // Inserting string in stringBuffer
        System.out.println(str2);                           // output will be concanited string
        System.out.println(str2.toString());                // converting from Stringbuffer to string
        System.out.println(str2.capacity());                // Checking capacity


        // Single thread enviornmnet
        // Faster than String buffer
        StringBuilder str3 = new StringBuilder();
        str3.append("Anand");
        str3.insert(0, "Hello ");
        System.out.println(str3);
        System.out.println(str3.capacity());
    }
}