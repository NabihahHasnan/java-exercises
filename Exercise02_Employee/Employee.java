/*
EXERCISE 1.2: 
a.	Write a class Employee that contains the following information:

Employee
String name; int age; String email; char gender; post;
printInfo() printNamebyGender()

b.	Write an implementation for method printinfo() to print all employee information.
c.	Write an implementation method for printNamebyGender() to print employee name based on the chosen gender by user.
d.	Write a main program that can read and print user name, age and email address.
e.	Write a method to print employee based on their position.

*/

import java.util.Scanner;
public class Employee {
    String name;
    int age;
    String email;
    char gender;
    String post;
    
    public void printInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Post: " + post);
    }    
    public void printNamebyGender(char gender) {
        if (this.gender == gender) {
            System.out.println("Employee Name: " + name);
        } else {
            System.out.println("No employee found with the specified gender.");
        }       
    }
    public void printEmployeeByPost(String post) {
        if (this.post.equalsIgnoreCase(post)) {
            System.out.println("Employee Name: " + name);
        } else {
            System.out.println("No employee found with the specified post.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();
        
        System.out.print("Enter employee name: ");
        emp.name = scanner.nextLine();
        
        System.out.print("Enter employee age: ");
        emp.age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter employee email: ");
        emp.email = scanner.nextLine();
        
        System.out.print("Enter employee gender (M/F): ");
        emp.gender = scanner.nextLine().charAt(0);
        
        System.out.print("Enter employee post: ");
        emp.post = scanner.nextLine();
        
        emp.printInfo();
        System.out.print("Enter gender to search for (M/F): ");
        char searchGender = scanner.nextLine().charAt(0);
        emp.printNamebyGender(searchGender);
    }       
}
