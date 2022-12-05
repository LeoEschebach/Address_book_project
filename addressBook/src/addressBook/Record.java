package addressBook;
import java.util.*;

public class Record {
	ArrayList<Entry> addressList = new ArrayList<>();
	public Record(ArrayList<Entry> addressList) {
	}
	
	Scanner key = new Scanner(System.in);
	

	public void newEntry() {	// Method for creating new entry
		// Accept user input
		System.out.println("Enter first name: ");
		String firstName = key.nextLine();
		
		System.out.println("Enter last name: ");
		String lastName = key.nextLine();
		
		System.out.println("Enter phone number: ");
		String phoneNum = key.nextLine();
		
		System.out.println("Enter email address: ");
		String emailAddress = key.nextLine();
		
		// initialize and add entry to arraylist
		Entry entry = new Entry(firstName, lastName, phoneNum, emailAddress);
		addressList.add(entry);
		System.out.println("Added entry.");
	}
	
	
	public void deleteEntry() { //	Remove an entry
		System.out.println("Enter the email address of the entry you want to remove:");
		String emailSelected = key.nextLine();
		
		for(int i = 0; i < addressList.size(); i++) {  // iterates through each entry in address book
			// initializing entry + entry email of index i 
			Entry selectedEntry = addressList.get(i);
			String email = selectedEntry.emailAddress;
			
			if(email.equals(emailSelected)) {	// checks if email entered equals email in selected entry
				addressList.remove(selectedEntry); 
				System.out.println("Removed entry with email " + emailSelected);
			}
		}
		
		// I need to create something outside the for loop in the case that the email the user inputted doesn't match the emails of any of the current entries
	}
	
	
	
	
//	Search for a specific entry
	public Entry findEntry() {
		System.out.println("What method will you search by? (1 = first name, 2 = last name, 3 = phone number, 4 = email address)");
		int choice = key.nextInt();
		if(choice == 1) {
			System.out.println("Enter the first name of the entry you want to find:");
			String nameSelected = key.nextLine();
			
			for(int i = 0; i < addressList.size(); i++) {  // iterates through each entry in address book
				// initializing entry + entry email of index i 
				Entry selectedEntry = addressList.get(i);
				String firstNameSelected = selectedEntry.firstName;
				
				if(email.equals(emailSelected)) {	// checks if email entered equals email in selected entry
					addressList.remove(selectedEntry); 
					System.out.println("Removed entry with email " + emailSelected);
				}
		}
		else if(choice == 2) {
			System.out.println("Enter the last name of the entry you want to find:");
			String emailSelected = key.nextLine();
			
			for(int i = 0; i < addressList.size(); i++) {  // iterates through each entry in address book
				// initializing entry + entry email of index i 
				Entry selectedEntry = addressList.get(i);
				String email = selectedEntry.emailAddress;
				
				if(email.equals(emailSelected)) {	// checks if email entered equals email in selected entry
					addressList.remove(selectedEntry); 
					System.out.println("Removed entry with email " + emailSelected);
				}
		}
		else if(choice == 3) {
			System.out.println("Enter the email address of the entry you want to remove:");
			String emailSelected = key.nextLine();
			
			for(int i = 0; i < addressList.size(); i++) {  // iterates through each entry in address book
				// initializing entry + entry email of index i 
				Entry selectedEntry = addressList.get(i);
				String email = selectedEntry.emailAddress;
				
				if(email.equals(emailSelected)) {	// checks if email entered equals email in selected entry
					addressList.remove(selectedEntry); 
					System.out.println("Removed entry with email " + emailSelected);
				}
		}
		else if(choice == 4) {
			System.out.println("Enter the email address of the entry you want to remove:");
			String emailSelected = key.nextLine();
			
			for(int i = 0; i < addressList.size(); i++) {  // iterates through each entry in address book
				// initializing entry + entry email of index i 
				Entry selectedEntry = addressList.get(i);
				String email = selectedEntry.emailAddress;
				
				if(email.equals(emailSelected)) {	// checks if email entered equals email in selected entry
					addressList.remove(selectedEntry); 
					System.out.println("Removed entry with email " + emailSelected);
				}
		}
		else {
			System.out.println("Invalid input");
		}
//		Users can pick which methods they will search by (first name, last name, phone number, or email address). The program will then take in a search query
//		and search the address book for an entry that contains the search as a substring (e.g. if a first name search is conducted with 'a,' all entries that have a
//		first name starting with 'a' will be returned).
		
		return entryRequested; 
	}
	
	
	
//	Print the contents of the address book
	
	
	
	
//	Delete the contents of the address book
	
	
	
	
//	Quit the program
	
	
	
	


}
