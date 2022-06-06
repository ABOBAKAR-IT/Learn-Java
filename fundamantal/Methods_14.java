// ⁡⁢⁣⁣​‌‌‍𝙅𝙖𝙫𝙖 𝙈𝙚𝙩𝙝𝙤𝙙​⁡
// A method is a block of code which only runs when it is called.
// You can pass data, known as parameters, into a method.       
// Methods are used to perform certain actions, and they are also known as functions.       
// Why use methods? To reuse code: define the code once, and use it many times. 

// Create a Method
// A method must be declared within a class. It is defined 
// with the name of the method, followed by parentheses (). 
// Java provides some pre-defined methods, such as System.out.println(),
//  but you can also create your own methods to perform certain actions:

// Example Explained
// myMethod() is the name of the method
// static: means that the method belongs to the Main class and not an object of the Main class. You will learn more about objects and how to access methods through objects later in this tutorial.
// void: means that this method does not have a return value.

public class Methods_14 {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    static void myMethod(String str) {// USE PARAMETER
        System.out.println(str);
    }

    // ⁡⁢⁣⁣​‌‌‍𝙍𝙚𝙩𝙪𝙧𝙣 𝙑𝙖𝙡𝙪𝙚𝙨​⁡
    // The void keyword, used in the examples above, indicates that the method
    // should not return a value. If
    // you want the method to return a value, you can use a primitive data type
    // (such as int, char, etc.) instead of void,
    // and use the return keyword inside the method:
    static String myMethod1(String str) {// USE PARAMETER

        return (str + " abobakar");
    }
    static String myMethod1(String fn,String ln) {// USE PARAMETER

        return (fn + " "+ln);
    }
    public static void main(String[] args) {
        myMethod();
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
        // ⁡⁢⁣⁣When a parameter is passed to the method, it is called an argument. So, from⁡
        // the example above:
        // fname is a parameter, while Liam, Jenny and Anja are arguments.
        System.out.println(myMethod1("rana"));//user return value

//       ⁡⁢⁣⁣​‌‌‍  𝗠𝗲𝘁𝗵𝗼𝗱 𝗢𝘃𝗲𝗿𝗹𝗼𝗮𝗱𝗶𝗻𝗴​⁡
// With method overloading, multiple methods can have the same name with different parameters:
String a=myMethod1("rana");
String b=myMethod1("rana","abobakar");
System.out.println(a);
System.out.println(b);

    }
}
