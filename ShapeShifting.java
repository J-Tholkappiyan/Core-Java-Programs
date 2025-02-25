import java.util.Scanner;

public class ShapeShifting {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

       
        double area = 0;

       
        switch (choice) {
            case 1:
               
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius;
                System.out.println("The area of the circle is: " + area);
                break;

            case 2:
                
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                area = side * side;
                System.out.println("The area of the square is: " + area);
                break;

            case 3:
                
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = length * width;
                System.out.println("The area of the rectangle is: " + area);
                break;

            default:
                System.out.println("Invalid choice! Please choose 1, 2, or 3.");
        }

        
        scanner.close();
    }
}
