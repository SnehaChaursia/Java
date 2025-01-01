public class OddNumbersPrinter {
    public static void main(String[] args) {
        // Sample input array
        int[] numbers = {12, 3, 5, 8, 19, 21, 14, 27};

        // Call the method to print odd numbers
        printOddNumbers(numbers);
    }

    // Method to print odd numbers
    public static void printOddNumbers(int[] array) {
        System.out.println("Odd numbers in the array:");
        for (int num : array) { // for-each loop
            if (num % 2 != 0) { // Check if the number is odd
                System.out.print(num + " ");
            }
        }
        System.out.println(); // Move to the next line after printing all odd numbers
    }
}
