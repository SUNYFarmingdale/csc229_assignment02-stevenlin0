package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
import java.util.Scanner;
public class DriverClass {

	public static void main(String[] args) {

		Student std1= new Student("Steven", (short) 19);

		// Create a Scanner object to get user input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter GPA: ");
		// Get the GPA from user input and set it for the student
		double gpa = scanner.nextDouble();
		std1.setGpa(gpa);

		System.out.println(std1);
	}
}