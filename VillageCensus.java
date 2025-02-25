import java.util.Scanner;

public class VillageCensus {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of districts: ");
        int n = scanner.nextInt();

        
        int[] populations = new int[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the population of district " + (i + 1) + ": ");
            populations[i] = scanner.nextInt();
        }

       
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += populations[i];
        }

       
        double average = (double) sum / n;

        
        System.out.println("The average population of the districts is: " + average);

      
        scanner.close();
    }
}
