import java.util.*;

public class nasted_hashmap {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, String>> myMap = new HashMap<String, HashMap<String, String>>();
        HashMap<String, String> myMap2 = new HashMap<String, String>();
        while (true) {
            System.out.println("Enter a Student Name: ");
            String name=System.console().readLine();
            if(name.equals("-1"))
            break;
            System.out.println("Enter a Student Subject Name: ");
            String subject=System.console().readLine();
            System.out.println("Enter a Student Marks: ");
            String marks=System.console().readLine();
myMap2.put(subject, marks);
myMap.put(name, myMap2);
        }
       

        System.out.println(myMap.get("ABOBAKAR"));
         System.out.println(myMap.get("ABOBAKAR").get("C++"));

        // System.out.println(myMap.get("tayyab").get("C++"));
        // System.out.println(myMap.get("tayyab").get("marks"));
    }
}
