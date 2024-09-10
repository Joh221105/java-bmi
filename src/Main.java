package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms: ");
        int weight = scan.nextInt();
        System.out.println("Enter your height in meters: ");
        int height = scan.nextInt();
        double BMI = (double) weight/(height * height);
        System.out.print("You have a BMI index of: " + BMI);
    }
}
