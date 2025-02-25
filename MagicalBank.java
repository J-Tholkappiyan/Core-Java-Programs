import java.io.*;
import java.util.Scanner;

public class MagicalBank{

   
    public static double readBalance() {
        try {
            File file = new File("balance.txt");
            if (!file.exists()) {
                file.createNewFile();
                return 0.0; 
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            br.close();

            return line != null ? Double.parseDouble(line) : 0.0; 
        } catch (IOException e) {
            System.out.println("An error occurred while reading the balance.");
            return 0.0;
        }
    }

    
    public static void updateBalance(double balance) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("balance.txt"));
            bw.write(Double.toString(balance));
            bw.close();
        } catch (IOException e) {
            System.out.println("An error occurred while updating the balance.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Welcome to the Magical Bank!");
        System.out.println("1. View Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

      
        double balance = readBalance();

        switch (choice) {
            case 1:
                System.out.println("Your current balance is: " + balance);
                break;

            case 2: 
                System.out.print("Enter the amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                balance += depositAmount;
                updateBalance(balance);
                System.out.println("Deposit successful! Your new balance is: " + balance);
                break;

            case 3:
                System.out.print("Enter the amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                if (withdrawAmount > balance) {
                    System.out.println("Insufficient balance!");
                } else {
                    balance -= withdrawAmount;
                    updateBalance(balance);
                    System.out.println("Withdrawal successful! Your new balance is: " + balance);
                }
                break;

            default:
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
        }

        scanner.close();
    }
}
