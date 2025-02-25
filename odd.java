import java.util.Scanner;
class odd {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Magical Odd-Even Forest!");
        System.out.print("Enter the tree number to check if it can bear fruit: ");

        // Read the tree number from the user
        int treeNumber = scanner.nextInt();

        // Check if the tree number is even or odd
        if (treeNumber % 2 == 0) {
            System.out.println("Tree number " + treeNumber + " is even and can bear fruit!");
        } else {
            System.out.println("Tree number " + treeNumber + " is odd and cannot bear fruit.");
        }

        // Close the scanner
        scanner.close();
    }
}
