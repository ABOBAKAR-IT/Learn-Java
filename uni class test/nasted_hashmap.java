import java.util.*;

public class nasted_hashmap {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, String>> myMap = new HashMap<String, HashMap<String, String>>();
        HashMap<String, String> myMap2 = new HashMap<String, String>();
        myMap2.put("C++", "88");
        myMap2.put("marks", "75");
        myMap.put("ABOBAKAR", myMap2);
        myMap.put("tayyab", myMap2);

        System.out.println(myMap.get("ABOBAKAR").get("C++"));
        System.out.println(myMap.get("ABOBAKAR").get("marks"));

        System.out.println(myMap.get("tayyab").get("C++"));
        System.out.println(myMap.get("tayyab").get("marks"));
    }
}
