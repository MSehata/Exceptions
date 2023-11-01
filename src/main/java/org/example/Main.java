package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Please enter a positive integer: ");
            int userInput = scanner.nextInt();

            if (userInput <= 0) {
                throw new IllegalArgumentException("Input must be a positive integer.");
            }

            System.out.println("You entered: " + userInput);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

}