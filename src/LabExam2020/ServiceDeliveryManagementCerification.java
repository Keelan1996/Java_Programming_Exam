package LabExam2020;

public interface ServiceDeliveryManagementCerification {

	// declare constants
	final double CERTIFICATION_FEE =2000;
	final double DISCOUNT_RATE=.1;
	static float EXAM_FEE=500;
	
	// Abstract method
	abstract void PayCertificationFee();
	
	// default method
	default void displayCertification() {
		System.out.println("certFee:" + CERTIFICATION_FEE);
	}
	
	// static method 
	public static void displayExamFee() {
		System.out.println("Exam Fee: " + EXAM_FEE);
	}
	
}
