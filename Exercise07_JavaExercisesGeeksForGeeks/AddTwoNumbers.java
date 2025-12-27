//2. Write a Program in Java to Add two Numbers.

// Input: A = 5, B = 6
// Output: sum = 11

//Input: A = 4, B = 11 
// Output: sum = 15  


public class AddTwoNumbers {
    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        int sum1 = add(5,6);
        int sum2 = add(4,11);
        System.out.println("Sum1 = " + sum1);
        System.out.println("Sum2 = " + sum2);
    }
}
