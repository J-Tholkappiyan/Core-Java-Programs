import java.util.Scanner;

public class Palindromeportal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a word to check if it's a palindrome: ");
        String word = scanner.nextLine();

       
        String lowerCaseWord = word.toLowerCase();

        
        String reversedWord = "";
        for (int i = lowerCaseWord.length() - 1; i >= 0; i--) {
            reversedWord += lowerCaseWord.charAt(i);
        }

       
        if (lowerCaseWord.equals(reversedWord)) {
            System.out.println("The word \"" + word + "\" is a palindrome. The portal opens!");
        } else {
            System.out.println("The word \"" + word + "\" is not a palindrome. The portal remains closed.");
        }
        scanner.close();
    }
}