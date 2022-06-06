import java.util.LinkedList;
public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        while (true) {
            System.out.println("Enter a Student Marks: ");
            int input=new java.util.Scanner(System.in).nextInt();
            if(input==-1)
            break;
            if(input==2)
            {
                System.out.println(list);
            }
            list.add(input);
        }
        
        
                // list.add("Hello");
                // list.add("World");
                // list.add("!");
                // System.out.println(list);
                // System.out.println(list.get(1));
                // System.out.println(list.size());
                // System.out.println(list.isEmpty());
                // list.remove(1);
                // System.out.println(list);
                // list.add(1, "World");
                // System.out.println(list);
                // list.set(1, "World");
                // System.out.println(list);
                // list.clear();
                // System.out.println(list);
       
    }
}
