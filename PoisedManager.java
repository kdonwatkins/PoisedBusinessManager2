import java.util.Scanner;		// import Scanner Class
import java.io.File;			// import File Class
import java.io.IOException;		// import IOException Class
import java.util.Date;			// import Date Class


///////////////////////////////// Main Method ///////////////////////////////////////

public class PoisedManager{

	public static void main(String[] args) {
		
		System.out.println("Hi and welcome to Poise! Let's get you started, please choose an option.");
		System.out.print("\nYour options are: Create a new project (A), or create new contractor profile (B): ");
		
		Scanner input = new Scanner(System.in);
		String userChoice = input.nextLine();
	
		if ((userChoice.toUpperCase()).equals("A")) {		// Add Project
			try {
				addProject();	
			} catch(Exception e) {
				System.out.println("\nIncorrect data-format entered. Project not created!");
			}
		} 
		
		else if ((userChoice.toUpperCase()).equals("B")) {		// Add Person
			try {
				addPerson();
			} catch (Exception e) {
				System.out.println("\nIncorrect data-format entered. Person not created!");
			}
		} 
		
		input.close();
		System.out.println("\nThank you and goodbye!");
	} 
	
	
/////////////////////// Project Method: Add and edit a project ///////////////////////
	
	private static void addProject() {
		
	//// Capture project details over here
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nGreat let's add a project! Enter the project number: ");	
			int typedNumber = input.nextInt();
			input.nextLine();
			
		System.out.print("Enter the project name: ");
			String typedName = input.nextLine();
			
		System.out.print("Enter building type: ");
			String typedBuilding = input.nextLine();
			
		System.out.print("Enter project physical address: ");
			String typedAddress = input.nextLine();
			
		System.out.print("Enter ERF number: ");
			int typedErf = input.nextInt();
			
		System.out.print("Enter project total fee (number only): ");
			double typedTotal = input.nextDouble();
			
		System.out.print("Enter amount already paid (number only): ");
			double typedPaid = input.nextDouble();
			
		System.out.print("Enter project deadline [DDMMYYYY]: ");
			int typedDeadline = input.nextInt();
			input.nextLine();
		
	//// Default values are used here as user if yet to finalize the project
		
		Date defaultDateCompleted = null;				
		boolean defaultIsProjectCompleted = false;
		
	//// New Project object created here
		
		Project poisedProject = new Project(typedNumber, typedName, typedBuilding, typedAddress, typedErf, 
				typedTotal, typedPaid, typedDeadline, defaultDateCompleted, defaultIsProjectCompleted);  
		
		System.out.println("\nYour new project has been created! Here it is:");
		System.out.println(poisedProject.toString());
		
	//// User can change project due date if they'd like to
		
		System.out.print("\nWould you like to edit the project deadline? [Y/N]: "); 		
		String dateChoice = input.nextLine();
		
		if ((dateChoice.toUpperCase()).equals("Y")) {
			
			System.out.print("\nPlease enter the new project deadline [DDMMYYYY]: ");
				int newDueDate = input.nextInt();
				input.nextLine();
				
			poisedProject.setProjectDeadline(newDueDate);
			
			System.out.println("\nHere's the updated project:");
			System.out.println(poisedProject.toString());
		} 
		
	//// User can change project amount already paid if they'd like to
		
		System.out.print("\nWould you like to edit the amount already paid? [Y/N]: "); 		
		String paidChoice = input.nextLine();
		
		if ((paidChoice.toUpperCase()).equals("Y")) {
			
			System.out.print("\nPlease enter the new fee already paid: ");
				double newAlreadyPaid = input.nextDouble();
				input.nextLine();
				
			poisedProject.setAmountAlreadyPaid(newAlreadyPaid);
			
			System.out.println("\nHere's the updated project:");
			System.out.println(poisedProject.toString());
			}
		
	//// User can finalise task here
		
		System.out.print("\nWould you like to finalise the project? [Y/N]: ");				
		String finaliseChoice = input.nextLine();											
		
	//// text file created here
		
		if ((finaliseChoice.toUpperCase()).equals("Y")) {
			try { 
				File userFile = new File("CompletedProject.txt");
				
				if (userFile.createNewFile()) {
					System.out.println("\nYour CompleterProject.txt invoice has been created in your folder! Here is your updated project:");
					
					Date currentDate = new Date();
					
	//// By finalizing the project, the user will also append the completion indication and date of completion
					
					poisedProject.setIsProjectFinalised(true);								
					poisedProject.setDateCompleted(currentDate);
					
					System.out.println(poisedProject.toString());
					
				} else { 
					System.out.println("\nThe invoice already exists!");
				}
				} catch (IOException e) {
					System.out.println("An error occured!");
					e.printStackTrace();
				}
		}
		
		input.close();	
	}
	
	
	
/////////////////////// Person Method: Add and edit a person ///////////////////////
	
	
	private static void addPerson() {	
	
		Scanner input = new Scanner(System.in);
		
	//// Capture contractor's details over here
		
		System.out.print("\nGreat let's add a contractor! Enter contractor name: ");
			String typedName = input.nextLine();
			
		System.out.print("Enter contractor job title: ");
			String typedJob = input.nextLine();
			
		System.out.print("Enter contractor phone number: ");
			int typedPhone = input.nextInt();
			input.nextLine();
			
		System.out.print("Enter contractor email address: ");
			String typedEmail = input.nextLine();
			
		System.out.print("Enter contractor physical address: ");
			String typedAddress = input.nextLine();
		
	//// New contractor object created here
		
		Person newPerson = new Person(typedName, typedJob, typedPhone, typedEmail, typedAddress); 		
		
		System.out.println("\nYour new contractor has been created! Here he/she is:");
		System.out.println(newPerson.toString());
		
		System.out.print("\nWould you like to update your contractor's details? [Y/N]: ");
			String userChoice = input.nextLine();
		
	//// Update contractor's contact information here
		
		if ((userChoice.toUpperCase()).equals("Y")) { 
			
			System.out.print("\nPlease enter the new phone number: ");
				int newPhone = input.nextInt();
				input.nextLine();
				
			System.out.print("Please enter the new email address: ");
				String newEmail = input.nextLine();
				
			System.out.print("Please enter the new physical addess: ");
				String newAddress = input.nextLine();
			
			newPerson.setPhoneNumber(newPhone);
			newPerson.setEmailAddress(newEmail);
			newPerson.setPhysicalAddress(newAddress);
			
			System.out.println("\nAll done! Here's the updated contractor:");
			System.out.println(newPerson.toString());
			
			input.close();
			
		}
	
	} 
	
}
