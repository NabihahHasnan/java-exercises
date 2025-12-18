/*

# Exercise03 - Time Converter

## Task
Write a program that converts days to seconds. Read an integer number of days from input and print the total number of seconds.
Assume the input is a non-negative integer. (1 day = 86,400 seconds)

## Concepts Practiced
- Input/Output
- Arithmetic operations
- Primitive types

## Example
Input: 12
Output: 1036800
*/

package java-exercises.Exercise03_TimeConverter;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of days from input
        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();

        // Convert days to hours
        int hours = days * 24;

        // Convert hours to minutes
        int minutes = hours * 60;

        // Convert minutes to seconds
        int seconds = minutes * 60;

        // Print the total number of seconds
        System.out.println("Total seconds: " + seconds);
        scanner.close();

    }
}
