package org.calculator;
import java.util.Scanner;



public class Calculator {

    static Scanner scanner = new Scanner(System.in);
    static float a;
    static float b;
    static int valueUser;

    public static void main(String[] args) {

        while (valueUser != 5) {
            downloadNumber();
            viewMenu();
            makeOperation();
        }

    }

    private static void viewMenu() {
        System.out.println("Please choice action:");
        System.out.println("#If you want addition, press button 1.");
        System.out.println("#If you want substraction, press button 2.");
        System.out.println("#If you want multiplication, press button 3.");
        System.out.println("#If you want division, press button 4.");
        System.out.println("#IF you want exit, press button 5.");
        valueUser = scanner.nextInt();

    }

    private static void downloadNumber() {

        System.out.println("Enter the first number.");
        a = scanner.nextFloat();
        System.out.println("Enter the second number.");
        b = scanner.nextFloat();
    }
    private static void makeOperation() {
        if (valueUser == 1) {
            System.out.println("Your value is " + (a + b));
        } else if (valueUser == 2) {
            System.out.println("Your value is " + (a - b));
        } else if (valueUser == 3) {
            System.out.println("Your value is " + (a*b));
        } else if (valueUser == 4) {
            System.out.println("Your value is " + (a/b));
        }
    }


}

