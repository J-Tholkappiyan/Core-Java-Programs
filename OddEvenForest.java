import java.util.Scanner;

public class OddEvenForest{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the tree number: ");
        int treeNumber = scanner.nextInt();

        
        if (treeNumber % 2 == 0) {
            System.out.println("Tree number " + treeNumber + " is even and can bear fruit.");
        } else {
            System.out.println("Tree number " + treeNumber + " is odd and cannot bear fruit.");
        }

        
        scanner.close();
    }
}
