package Exercise06_June2019;
/*-----------------------------------------------
|               June 2019 – CSC435              |
|                       Part B                  |
|                      Question 1               |
------------------------------------------------*/
//a) Given the following program fragment:

public class Calculator{
    private int number;

    public Calculator(int num){
        number = num;
    }

    public Calculator(Calculator numOne)   // **Question 1 (a)(i)**{
        number = numOne.number * 2;
    }

    public int calculateMe(){
        return number * 2;
    }

    public static void main(String[] args){
        int num = 2;
        Calculator c1 = new Calculator(5);
        Calculator c2 = new Calculator(num);
        Calculator c3 = new Calculator(c2);

        System.out.println("Object 1: " + c1.calculateMe());
        System.out.println("Object 2: " + c2.calculateMe());
        System.out.println("Object 3: " + c3.calculateMe());
    }
}

//i.   State the type of constructor that is indicated by **Question 1 (a)(i)**. (1 mark)
//     Copy constructor

//ii.  Identify and write the statements that indicate the creation of objects in main(). (2 marks)
        Calculator c1 = new Calculator(5);
        Calculator c2 = new Calculator(num);
        Calculator c3 = new Calculator(c2);

//iii. What is the output of the program fragment?  (3 marks)
//        Object 1: 10
//        Object 2: 4  
//        Object 3: 8

//b) i) List TWO (2) modifiers and briefly explain its usage. (2 marks)
//   1. public - The public modifier allows the class, method, or variable to be accessible from any other class.
//   2. private - The private modifier restricts the access of the class, method, or variable to within the same class only.

//b ii) 
public class StaticDemo {
    private int y;
    public static void showStatic()
    {
        int y = 5;
        System.out.println(y);
    }
}
// Call the static method without using any object
StaticDemo.showStatic();
// Note:
// A static method belongs to the class, not to an object.
// Therefore, it can be called using the class name directly.
