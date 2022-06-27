package LabExam2020;

public class VanOwner extends VehicleOwner {
 
	double loanTerm;
	double repayment;
	double monthlyLoan;
	
	// constructor
	public VanOwner(int id, String name, String vechileType, double loanTerm) {
		this.id =id;
		this.name = name;
		this.vehicleType= vechileType;
		this.loanTerm=loanTerm;
	}
	
	// overload constructor
	public VanOwner( int id, String name, String vechileType, double loanTerm, double repayment) {
		this(id, name, vechileType, loanTerm);
		// calling one constructor from another
		this.repayment = repayment;
	}

	// overriding abstract method
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

	}
	// overriding toString method
	@Override
	public String toString() {
		return "ID : " + id + "\nName: " + name + "\nVechicleType: " + vehicleType +
				"\nLoanTerm: " + this.calculateMonthlyLoan() + "\n";
	}

	public static void main(String[] args) {
		VanOwner codyOHea = new VanOwner(9, "CodyOhea", "Chevrolet express 3500 van", 50000, 3);
       // toString method
		System.out.println(codyOHea.toString());
		
		// polyMorpism at work
		VehicleOwner[] callumWyatt = new VehicleOwner[3];
		callumWyatt[0] = new VanOwner(6, "callum", "van", 2000, 3);
		callumWyatt[1] = new LorryOwner(4, "callum", "lorry", 3000, 2, 1232);
		callumWyatt[2] = new MotorBikeOwner(3, "callum", "motorbike", 4000);
		
		// displaying each object in array
		for(int i =0; i <callumWyatt.length; i++)
		{
			callumWyatt[i].display();
		}
	}

}
