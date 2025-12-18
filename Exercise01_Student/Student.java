/*
LAB 03: BASIC CONCEPTS OF CLASSES

Question 2:
Given the declaration of Student class.

Class Student{
    Private float stuName; 
    Private float stuID; 
    Private float stuProgram; 
    Private date stuGroup;
}

a.	Write a default constructor that will initialize all data.
b.	Write mutator and accessor methods for all data member.
c.	Write a method printStudent() to calculate and returns the total number of students.
d.	Write a method find (String xNmae) that find student information based on their name.
e.	Create a main class to do the following:
i.	Create 5 object of students
ii.	Set name, Id, program name, and group for those students.
iii.	Print all students’ information using method in c.
iv.	Print particular student information by calling method in d.


*/

//Answer (a)
public class Student {
    private String stuName;
    private String stuID;
    private String stuProgram;
    private String stuGroup;

    // Default constructor
    public Student() {
        this.stuName = "";
        this.stuID = "";
        this.stuProgram = "";
        this.stuGroup = "";
    }

    // Mutator methods
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public void setStuProgram(String stuProgram) {
        this.stuProgram = stuProgram;
    }

    public void setStuGroup(String stuGroup) {
        this.stuGroup = stuGroup;
    }

    // Accessor methods
    public String getStuName() {
        return stuName;
    }

    public String getStuID() {
        return stuID;
    }

    public String getStuProgram() {
        return stuProgram;
    }

    public String getStuGroup() {
        return stuGroup;
    }

    // Method to print student information
    public void printStudent() {
        System.out.println("Student Name: " + stuName);
        System.out.println("Student ID: " + stuID);
        System.out.println("Student Program: " + stuProgram);
        System.out.println("Student Group: " + stuGroup);
    }

    // Method to find student by name
    public boolean find(String xName) {
        return this.stuName.equalsIgnoreCase(xName);
    }
}
