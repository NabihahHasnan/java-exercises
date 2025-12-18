/*
LAB 03: BASIC CONCEPTS OF CLASSES

Question 1:
Write a class Cylinder according to main function given.

Public static void main (String args[]) {
    // volume of cylinder = 2 * pie * radius * height
    double radius, height;
    Cylinder volume = new Cylinder(); // default constructor
    System.out.println(Enter radius and height for cylinder: “);
    radius = console.nextDouble();
    height = console.nextDouble();
    volume.setvolume(radius, height);
    double vol = volume.calvolume();
    volume.printVolume(vol);
}
*/

//Answer:
public class Cylinder {
    private double radius;
    private double height;
    private final double PI = 3.1416;

    // Default constructor
    public Cylinder() {
        this.radius = 0;
        this.height = 0;
    }

    // Method to set volume parameters
    public void setvolume(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate volume
    public double calvolume() {
        return PI * radius * radius * height;
    }

    // Method to print volume
    public void printVolume(double vol) {
        System.out.printf("The volume of the cylinder is: %.2f\n", vol);
    }
}
