package LabExam2020;

public class LorryOwner extends VehicleOwner {
    
	// variables 
	double loanTerm; 
	double lorryPlate;
	double repayment;
	double monthlyLoan;
	
	// constructor 
	public LorryOwner(int id, String name, String vechileType, double loanTerm, double repayment, double lorryPlate) {
		this.id =id;
		this.name = name;
		this.vehicleType= vechileType;
		this.loanTerm=loanTerm;
		this.repayment= repayment;
		setPlate(lorryPlate);
	}
	
	// displayPlate method
	void displayPlate() {
		System.out.println("Plate: Displayed");
	}
	
	// overloaded displayPlate method
	void displayPlate(String overload) {
		System.out.println("Plate:" + overload);
	}
    
	// get and set Plate method
	
	public void setPlate(double value) {
		lorryPlate = value;
	}
	
	public double getPlate() {
		return lorryPlate;
	}
	
	// calculation method 
	@Override
	double calculateMonthlyLoan() {
		monthlyLoan= (loanTerm*interestRate)/repayment;
		return monthlyLoan;
	}

	// display method
	@Override
	void display() {
		System.out.println("ID:" + id);
		System.out.println("Name:" + name);
		System.out.println("vechileType: " + vehicleType);
		System.out.println("LoanTerm: " + this.calculateMonthlyLoan() + "\n");
        System.out.println("Plate Number: " + getPlate()+ "\n");
	}
	// overriding toString method
		@Override
		public String toString() {
			return "ID : " + id + "\nVechicleType: " + vehicleType +
					"\nLoanTerm: " + this.calculateMonthlyLoan() + "\nplate number: " + getPlate() + "\n";
		}

	public static void main(String[] args) {
		LorryOwner johnMagian = new LorryOwner(12, "JohnMagian", "Lorry", 100000, 5, 13457);
        // toString display
		System.out.println(johnMagian.toString());
        
        // composition at work
        LorryLicence licence = new LorryLicence();
        System.out.println(licence.getLicence());
	}

}
