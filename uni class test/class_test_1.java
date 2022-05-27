public class class_test_1 {
    public static void main(String[] args) {
        System.out.println("Enter a name");
       String s= System.console().readLine();
       System.out.println("your name is "+ s);
       System.out.println("Enter input for num1");
       String input1= System.console().readLine();
       System.out.println("Enter a input for num2");
       String input2= System.console().readLine();

       Integer num1=Integer.parseInt(input1);
       Integer num2=Integer.parseInt(input2);
       Integer num3=num1+num2;
       System.out.println(num3);
    }
}
