import java.util.Scanner;

public class TaleofVillage{
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the population of Village Alpha: ");
        int alphaPopulation = scanner.nextInt();

        System.out.print("Enter the trade revenue of Village Alpha: ");
        double alphaRevenue = scanner.nextDouble();

       
        System.out.print("Enter the population of Village Beta: ");
        int betaPopulation = scanner.nextInt();

        System.out.print("Enter the trade revenue of Village Beta: ");
        double betaRevenue = scanner.nextDouble();

        
        int combinedPopulation = alphaPopulation + betaPopulation;
        int populationDifference = Math.abs(alphaPopulation - betaPopulation);
        double revenueProduct = alphaRevenue * betaRevenue;

        
        System.out.println("\nResults:");
        System.out.println("Combined Population of Alpha and Beta: " + combinedPopulation);
        System.out.println("Difference in Population between Alpha and Beta: " + populationDifference);
        System.out.println("Product of Trade Revenues of Alpha and Beta: " + revenueProduct);

        
        scanner.close();
    }
}
