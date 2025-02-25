import java.util.Scanner;

public class PasswordAncient {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

       
        String reversedName = new StringBuilder(name).reverse().toString();

       
        int asciiSum = 0;
        for (int i = 0; i < name.length(); i++) {
            asciiSum += name.charAt(i);
        }

        
        String password = reversedName + asciiSum;

        
        System.out.println("The password of the ancient gate is: " + password);

        
        scanner.close();
    }
}
