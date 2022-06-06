public class JavaScope15 {
     static int a=22;
    public static void print(){
        System.out.print("Global scope "+a);
    }
    public static void main(String[] args) {
        int a=10;
    System.out.println("local scope "+a);
    print();
    }
   
}
