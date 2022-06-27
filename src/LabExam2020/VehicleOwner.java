package LabExam2020;

public abstract class VehicleOwner {
	
	// declare variables
	
	int id;
	String name; 
	String vehicleType;
	static double interestRate=.02;
	
	// static variable
	public static final float EXAM_FEE=150;
	
	// ABSTRACT METHODS
	abstract double calculateMonthlyLoan();
	abstract void display();
	
	// static method
	public static void displayExamFee()
	{
		System.out.println("Exam fee: " + EXAM_FEE);
	}

}
