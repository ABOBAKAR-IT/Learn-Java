public class classes_and_methods {
     // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    classes_and_methods myObj = new classes_and_methods(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method on the object
  }
}
