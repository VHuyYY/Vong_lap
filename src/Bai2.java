import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (top-left, top-right, bottom-left, bottom-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void printRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the corner:");
        System.out.println("1. Top-left");
        System.out.println("2. Top-right");
        System.out.println("3. Bottom-left");
        System.out.println("4. Bottom-right");
        int corner = scanner.nextInt();
        System.out.print("Enter the size of the triangle: ");
        int size = scanner.nextInt();

        switch (corner) {
            case 1:
                for (int i = size; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = size; i > 0; i--) {
                    for (int j = 0; j < size - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <= size; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 1; i <= size; i++) {
                    for (int j = 0; j < size - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid corner choice.");
        }
    }

    public static void printIsoscelesTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the isosceles triangle: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
