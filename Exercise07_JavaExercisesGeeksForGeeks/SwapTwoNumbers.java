//3. Write a Java program to swap two numbers .

// Input  : m=9, n=5
// Output : m=5, n=9

// Input  : m=15, n=5
// Output : m=5, n=15

// Here 'm' and 'n' are integer values.



public class SwapTwoNumbers {
    public static void swap(int m, int n){
        System.out.println("Before Swapping: m = " + m + ", n = " + n);
        
        int temp = m;
        m = n;
        n = temp;
        
        System.out.println("After Swapping: m = " + m + ", n = " + n);
    }
    public static void main(String[] args) {
        swap(9, 5);
        swap(15, 5);
    }
    
}
