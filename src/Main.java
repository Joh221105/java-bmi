package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight = 0;
        double height = 0;

        // Loop until valid weight is entered
        while (true) {
            try {
                System.out.println("Enter your weight in kilograms: ");
                weight = scan.nextDouble();
                if (weight < 0 || weight > 500) {
                    System.out.println("Please enter a valid weight between 0 and 500.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numerical value.");
                scan.next(); // Clear the invalid input
            }
        }

        // Loop until valid height is entered
        while (true) {
            try {
                System.out.println("Enter your height in meters: ");
                height = scan.nextDouble();
                if (height <= 0 || height > 3) {
                    System.out.println("Please enter a valid height between 0 and 3 meters.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numerical value.");
                scan.next(); // Clear the invalid input
            }
        }

        // Calculate and display the BMI
        double BMI = weight / (height * height);
        System.out.printf("You have a BMI index of: %.2f", BMI);
        scan.close();
    }
}