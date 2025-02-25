import java.util.Scanner;

public class LandPrimeNos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

       
        if (number <= 1) {
            System.out.println("The number " + number + " is not a prime number.");
        } else {
           
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

           
            if (isPrime) {
                System.out.println("The number " + number + " is a prime number.");
            } else {
                System.out.println("The number " + number + " is not a prime number.");
            }
        }

       
        scanner.close();
    }
}
