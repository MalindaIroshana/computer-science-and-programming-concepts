import java.util.Arrays;

public class ExampleArrays {
    public static void main(String[] args) {
        // Declaration and Initialization of an array
        int[] myArray = {1, 2, 3, 4, 5};

        // Accessing and printing array elements
        System.out.println("Array elements:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + i + ": " + myArray[i]);
        }

        // Modifying an array element
        myArray[2] = 10;
        System.out.println("Array after modifying element at index 2: " + Arrays.toString(myArray));

        // Finding the length of the array
        int arrayLength = myArray.length;
        System.out.println("Length of the array: " + arrayLength);

        // Initializing a multidimensional array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Accessing and printing elements of the multidimensional array
        System.out.println("Multidimensional array elements:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
