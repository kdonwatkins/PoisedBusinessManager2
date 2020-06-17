
import java.util.Date;

public class Project {
	int number;
	String name;
	String buildingType;
	String physicalAddress;
	int erfNumber;
	double totalFeeCharged;
	double amountAlreadyPaid;
	int projectDeadline;
	Date dateCompleted;
	boolean isProjectFinalised;
	
	// Constructor for Project
	
	public Project(int number, String name, String buildingType, String physicalAddress, int erfNumber, 
			double totalFeeCharged, double amountAlreadyPaid, int projectDeadline, Date dateCompleted, boolean isProjectFinalised) {
		
		this.number = number;
		this.name = name;
		this.buildingType = buildingType;
		this.physicalAddress = physicalAddress;
		this.erfNumber = erfNumber;
		this.totalFeeCharged = totalFeeCharged;
		this.amountAlreadyPaid = amountAlreadyPaid;
		this.projectDeadline = projectDeadline; 
		this.dateCompleted = dateCompleted;
		this.isProjectFinalised = isProjectFinalised;
	}
	
	
	public String toString() {
		String proper = "";
		proper += "\nProject Number: " + this.number;
		proper += "\nProject Name: " + this.name;
		proper += "\nBuilding Type: " + this.buildingType;
		proper += "\nPhysical Address: " + this.physicalAddress;
		proper += "\nERF Number: " + this.erfNumber;
		proper += "\nTotal Fee Charged: R" + this.totalFeeCharged;
		proper += "\nAmount Already Paid: R" + this.amountAlreadyPaid;
		proper += "\nProject Deadline: " + this.projectDeadline;
		proper += "\nDate Completed: " + this.dateCompleted;
		proper += "\nProject is finalised: " + this.isProjectFinalised;
		
		return proper;
	}

	public void setProjectDeadline(int newProjectDeadline) {			// Four setters here for editing the project fields
		this.projectDeadline = newProjectDeadline;
	}

	
	public void setAmountAlreadyPaid(double newAlreadyPaid) {
		this.amountAlreadyPaid = newAlreadyPaid;
	}

	
	public void setDateCompleted(Date newDateCompleted) {
		dateCompleted = newDateCompleted;
	}
	
	public void setIsProjectFinalised(boolean isProjectFinalised) {
		this.isProjectFinalised = isProjectFinalised;
	}
	
	
}
