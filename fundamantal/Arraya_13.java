public class Arraya_13 {
    public static void main(String[] args) {
//         Java Arrays
// Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

// To declare an array, define the variable type with square brackets:

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Now, you need to define the array's capacity, or the number of elements
//  it will hold. To accomplish this, use the keyword new
int[ ] arr = new int[5];
// Change an Array Element
cars[0] = "Opel";
System.out.println(cars[0]);

// Array Length
// To find out how many elements an array has, use the length property:
System.out.println(cars.length);

// Loop Through an Array
// You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run.

// The following example outputs all elements in the cars array:
for (int i = 0; i < cars.length; i++) {
    System.out.println(cars[i]);
  }

//   Loop Through an Array with For-Each
//   There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:
for (String i : cars) {
    System.out.println(i);
  }    

//   Multidimensional Arrays
//   A multidimensional array is an array of arrays.
  
//   To create a two-dimensional array, add each array within its own set of curly braces:

int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
for (int i = 0; i < myNumbers.length; ++i) {
   for(int j = 0; j < myNumbers[i].length; ++j) {
      System.out.println(myNumbers[i][j]);
   }
}

    }
}
