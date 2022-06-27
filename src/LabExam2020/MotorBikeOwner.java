package LabExam2020;

public class MotorBikeOwner extends VehicleOwner {
	// variables
	double loanTerm;
	double monthlyLoan; 
	
	// constructor
	public MotorBikeOwner(int id, String name, String vechileType, double loanTerm) 
	{
		this.id =id;
		this.name = name;
		this.vehicleType= vechileType;
		this.loanTerm=loanTerm;
		
	}

	// overide calculation
	@Override
	double calculateMonthlyLoan() {
		monthlyLoan= loanTerm*interestRate;
		return monthlyLoan;
	}
   
	// equals method
   @Override
   public boolean equals(Object obj) {
	   VehicleOwner other = (VehicleOwner)obj;
	   if(other.id == id && other.name == name)
		   return true;
	   else
		   return false;
   }
	
	// display method
	
	@Override
	void display() {
		System.out.println("ID:" + id);
		System.out.println("Name:" + name);
		System.out.println("vechileType: " + vehicleType);
		System.out.println("LoanTerm: " + this.calculateMonthlyLoan() + "\n");
		

	}

	public static void main(String[] args) {
		MotorBikeOwner hunterLeavy = new MotorBikeOwner(8, "hunterLeavy", "HONDA CB750 MOTORBIKE", 20000);
        hunterLeavy.display();
        
        // equals method displayed
        MotorBikeOwner john = new MotorBikeOwner(2, "john", "bike", 2000);
        MotorBikeOwner johnWife = new MotorBikeOwner(2, "john", "bike", 2000);
	    System.out.println(john.equals(johnWife));
	}

}
