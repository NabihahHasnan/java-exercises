/*

# Exercise02 - Find Maximum Number

## Task
Write a method that returns the largest integer in a list.
Assume the list has at least one element.

## Concepts Practiced
- Arrays
- Loops
- Conditional statements
- Method creation

## Example
Input: [3, 7, 2, 9, 5]  
Output: 9


*/

package java-exercises.Exercise02_FindMaxNum;

public class FindMaxNum {

    /**
     * Returns the largest integer in the given list.
     * Assumes the list has at least one element.
     */
    public static Integer maximum(Integer[] list) {
        int maximum = list[0];

        for (int i : list) {
            if (i > maximum) {
                maximum = i;
            }
        }

        return maximum;
    }

    // Optional test
    public static void main(String[] args) {
        Integer[] numbers = {3, 7, 2, 9, 5};

        Integer result = maximum(numbers);
        System.out.println("Maximum number: " + result);
    }
}

