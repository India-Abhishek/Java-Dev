public class StringVsStringBuffer {
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


        // String Example
        String str = "Hello";
        System.out.println("Original String: " + str);

        // Concatenating a new string to the original string
        str = str + " World";
        System.out.println("Modified String (using String): " + str);

        // StringBuffer Example
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + stringBuffer);

        // Appending a new string to the original StringBuffer
        stringBuffer.append(" World");
        System.out.println("Modified StringBuffer: " + stringBuffer);

        // StringBuilder Example
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + stringBuilder);

        // Appending a new string to the original StringBuilder
        stringBuilder.append(" World");
        System.out.println("Modified StringBuilder: " + stringBuilder);
    }
    
}
