package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int measurementMode = getMeasurementMode(scan);
        double weight = getWeight(scan, measurementMode);
        double height = getHeight(scan, measurementMode);

        double BMI = calculateBMI(height, weight, measurementMode);
        System.out.printf("You have a BMI index of: %.2f \n", BMI);
        printBmiMeaning(BMI);

        scan.close();
    }

    // Method to get the measurement mode
    private static int getMeasurementMode(Scanner scan) {
        while (true) {
            try {
                System.out.println("Which measurement mode would you like to input (Type 1 or 2):");
                System.out.println("1. Kilograms and meters");
                System.out.println("2. Pounds and inches");
                int mode = scan.nextInt();
                if (mode == 1 || mode == 2) {
                    return mode;
                } else {
                    System.out.println("Please enter 1 or 2.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numerical value.");
                scan.next(); // Clear the invalid input
            }
        }
    }

    // Method to get the weight based on the measurement mode
    private static double getWeight(Scanner scan, int measurementMode) {
        while (true) {
            try {
                if (measurementMode == 1) {
                    System.out.println("Enter your weight in kilograms: ");
                    double weight = scan.nextDouble();
                    if (weight > 0 && weight <= 500) {
                        return weight;
                    } else {
                        System.out.println("Please enter a valid weight between 0 and 500 kilograms.");
                    }
                } else {
                    System.out.println("Enter your weight in pounds: ");
                    double weight = scan.nextDouble();
                    if (weight > 0 && weight <= 1000) {
                        return weight;
                    } else {
                        System.out.println("Please enter a valid weight between 0 and 1000 pounds.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numerical value.");
                scan.next(); // Clear the invalid input
            }
        }
    }

    // Method to get the height based on the measurement mode
    private static double getHeight(Scanner scan, int measurementMode) {
        while (true) {
            try {
                if (measurementMode == 1) {
                    System.out.println("Enter your height in meters: ");
                    double height = scan.nextDouble();
                    if (height > 0 && height <= 3) {
                        return height;
                    } else {
                        System.out.println("Please enter a valid height between 0 and 3 meters.");
                    }
                } else {
                    System.out.println("Enter your height in inches: ");
                    double height = scan.nextDouble();
                    if (height > 0 && height <= 120) {
                        return height;
                    } else {
                        System.out.println("Please enter a valid height between 0 and 120 inches.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numerical value.");
                scan.next(); // Clear the invalid input
            }
        }
    }

    // Method to calculate BMI
    public static double calculateBMI(double height, double weight, int measurementMode) {
        if (measurementMode == 1) {
            return weight / (height * height);
        } else {
            return (weight / (height * height)) * 703;
        }
    }

    // Method to print the meaning of the BMI
    public static void printBmiMeaning(double bmi) {
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi <= 24.9) {
            System.out.println("You are a healthy weight.");
        } else if (bmi <= 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}
