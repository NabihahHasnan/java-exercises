package java

import java.util.Scanner;

-exercises.Exercise04_ConditionalStatement;
/*

# Exercise04 - Nested Conditional Statements
Nested if Statements
The sales manager decided to give a gift card to the customers whose purchases total more than 15000. On top of this, the customers whose total purchase is above 30000 will receive a second gift card.
You are given a program, which takes the purchase amount as input, and print "Gift card" if it is above 15000.

Task
Complete the code to print "Gift card" again if the purchase is above 30000.

Sample Input
36000

Sample Output
Gift card
Gift card

*/
import java.util.Scanner;
public class GiftCardNestedStatement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int purchases = scanner.nextInt();

        if(purchases > 15000){
            System.out.println("Gift card");
            if(purchases > 30000){
                System.out.println("Gift card");
            }
        }
    }
}
