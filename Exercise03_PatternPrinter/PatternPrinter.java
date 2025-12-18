git rm -r "java-code-exercises"
/*
EXERCISE 1.1: 
Write a program that can print the following output:
(a)	

    *
    **
    ***
(b)	
    @-@-@-
    @-@-@-
    @-@-@-	

(c)	
    $$$$$
    $$$$
    $$$
    $$
    $

*/

// Question (a)
public class PatternPrinter {
    public static void main(String[] args) {
        // Part (a)
        System.out.println("Part (a):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Part (b)
        System.out.println("\nPart (b):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("@-");
            }
            System.out.println();
        }

        // Part (c)
        System.out.println("\nPart (c):");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
