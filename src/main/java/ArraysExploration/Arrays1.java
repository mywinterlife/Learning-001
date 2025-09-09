package main.java.ArraysExploration;

public class Arrays1 {
    public static void main(String[] args) {
                // Create an array with 5 numerical values
                double[] numbers = {32, 87, 3.14, 42, 8.8};
                // Print the first element
                System.out.println("First element: " + numbers[0]);
                // Print the last element
                System.out.println("Last element: " + numbers[numbers.length - 1]);
                // Print elements in reverse order
                System.out.println("Elements in reverse order:");
                for (int i = numbers.length - 1; i >= 0; i--) {
                    System.out.println(numbers[i]);
                }
                // Print the total number of elements
                System.out.println("Total number of elements: " + numbers.length);
            }
}