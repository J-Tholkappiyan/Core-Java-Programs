import java.util.Scanner;

public class TowerMultiply{
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

       
        scanner.close();
    }
}