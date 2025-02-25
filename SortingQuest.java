import java.util.Scanner;

public class SortingQuest {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the number of jewels: ");
        int n = scanner.nextInt();

       
        int[] jewels = new int[n];

       
        System.out.println("Enter the weights of the jewels:");
        for (int i = 0; i < n; i++) {
            jewels[i] = scanner.nextInt();
        }

       
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                if (jewels[j] > jewels[j + 1]) {
                    
                    int temp = jewels[j];
                    jewels[j] = jewels[j + 1];
                    jewels[j + 1] = temp;
                }
            }
        }

      
        System.out.println("The jewels sorted by weight in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(jewels[i] + " ");
        }

      
        scanner.close();
    }
}
