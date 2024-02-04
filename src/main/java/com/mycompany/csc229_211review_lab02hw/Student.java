package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person {

    // Field for GPA
    private double gpa;

    // Constructor for Student class
    public Student(String name, short age) {
        super(name, age);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Abstract methods for address
    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public void setAddress(String address) {
    }

    // Overridden toString method to print the student details
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gpa=" + gpa +
                '}';
    }
}