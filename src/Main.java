package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight = 0;
        double height = 0;
        int measurementMode = 0;

        while (true) {
            try {
                System.out.println("Which measurement mode would you like to input (Type 1 or 2)");
                System.out.println("1. Kilograms and meters");
                System.out.println("2. Pounds and inches");
                measurementMode = scan.nextInt();
                if(measurementMode == 1){
                    System.out.println("Enter your weight in kilograms: ");
                    weight = scan.nextDouble();
                    if (weight < 0 || weight > 500) {
                        System.out.println("Please enter a valid weight between 0 and 500.");
                    } else {
                        break;
                    }
                }
                else if(measurementMode == 2){
                    System.out.println("Enter your weight in pounds: ");
                    weight = scan.nextDouble();
                    if (weight < 0 || weight > 1000) {
                        System.out.println("Please enter a valid weight between 0 and 1000.");
                    } else {
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numerical value.");
                scan.next(); // Clear the invalid input
            }
        }

        // Loop until valid height is entered
        while (true) {
            try {
                if (measurementMode == 1){
                    System.out.println("Enter your height in meters: ");
                    height = scan.nextDouble();
                    if (height <= 0 || height > 3) {
                        System.out.println("Please enter a valid height between 0 and 3 meters.");
                    } else {
                        break;
                    }
                }
                else if (measurementMode == 2){
                    System.out.println("Enter your height in inches: ");
                    height = scan.nextDouble();
                    if (height <= 0 || height > 120) {
                        System.out.println("Please enter a valid height between 0 and 120 inches.");
                    } else {
                        break;
                    }
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numerical value.");
                scan.next(); // Clear the invalid input
            }
        }

        // Calculate and display the BMI
        double BMI = weight / (height * height);
        System.out.printf("You have a BMI index of: %.2f \n", BMI);
        bmiMeaning(BMI);
        scan.close();

    }


    public static void bmiMeaning(double bmi){
        if(bmi < 18.5){
            System.out.println("You are underweight.");
        }
        else if (bmi <= 24.9){
            System.out.println("You are a healthy weight.");
        }
        else if (bmi <= 29.9){
            System.out.println("You are overweight.");
        }
        else{
            System.out.println("You are obese.");
        }
    }
}