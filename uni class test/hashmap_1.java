import java.util.HashMap;
public class hashmap_1 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        while (true) {
            System.out.println("Enter Roll No: ");
        String s = System.console().readLine();
        if(s.equals("-1"))
        break;
       
                Integer ii=hm.get(s);
                if(hm.containsKey(s)){
                System.out.println("marks "+s+" are "+ii);
                continue;
            }
            
        System.out.println("Enter Marks: ");
Integer n=Integer.parseInt(System.console().readLine());
        hm.put(s,n);
        }
    }
}
