package addressBook;
import java.util.*;

public class Record {
	
	public Record() {
	}
	ArrayList<Entry> addressList = new ArrayList<>();
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
		boolean found = false;
		for(int i = 0; i < addressList.size(); i++) {  // iterates through each entry in address book
			// initializing entry + entry email of index i 
			Entry entryI = addressList.get(i);
			String email = entryI.emailAddress;
			
			if(email.equals(emailSelected)) {	// checks if email entered equals email in selected entry 
				found = true;
				addressList.remove(entryI); 
				System.out.println("Deleted the following entry: ");
				System.out.println("***********"
						+ "\n First Name: " + entryI.firstName
						+ "\n Last Name: " + entryI.lastName
						+ "\n Phone Number: " + entryI.phoneNum
						+ "\n Email Address: " + entryI.emailAddress 
						+ "\n ************");
			}
		}
		if(found == false) {
			System.out.println("Entry not found, please try again.");
		}
	}
	
	
	
//	 The program will then take in a search query and search the address book for an entry that contains the search as a substring 
//	 (e.g. if a first name search is conducted with 'a,' all entries that have a first name starting with 'a' will be returned).

	// String word = "hello";
	// "lo"
	
//	Search for a specific entry
	public void findEntry() {
		System.out.println("What method will you search by? (1 = first name, 2 = last name, 3 = phone number, 4 = email address)");
		int choice = key.nextInt();
		if(choice == 1) {
			System.out.println("Enter your search:");
			String search = key.nextLine();
			
			for(int i = 0; i < addressList.size(); i++) {  
				Entry entryI = addressList.get(i);
				String firstNameI = entryI.firstName;
				
				if(firstNameI.contains(search)) {	
					System.out.println("***********"
							+ "\n First Name: " + entryI.firstName
							+ "\n Last Name: " + entryI.lastName
							+ "\n Phone Number: " + entryI.phoneNum
							+ "\n Email Address: " + entryI.emailAddress 
							+ "\n ************");
				} 
			}
		}
		else if(choice == 2) {
			System.out.println("Enter your search:");
			String search = key.nextLine();
			
			for(int i = 0; i < addressList.size(); i++) {  
				Entry entryI = addressList.get(i);
				String lastNameI = entryI.lastName;
				
				if(lastNameI.contains(search)) {	
					System.out.println("***********"
							+ "\n First Name: " + entryI.firstName
							+ "\n Last Name: " + entryI.lastName
							+ "\n Phone Number: " + entryI.phoneNum
							+ "\n Email Address: " + entryI.emailAddress 
							+ "\n ************");
				} 
			}
		}
			
		else if(choice == 3) {
			System.out.println("Enter your search:");
			String search = key.nextLine();
			
			for(int i = 0; i < addressList.size(); i++) {  
				Entry entryI = addressList.get(i);
				String phoneNumI = entryI.phoneNum;
				
				if(phoneNumI.contains(search)) {	
					System.out.println("***********"
							+ "\n First Name: " + entryI.firstName
							+ "\n Last Name: " + entryI.lastName
							+ "\n Phone Number: " + entryI.phoneNum
							+ "\n Email Address: " + entryI.emailAddress 
							+ "\n ************");
				} 
			}
		}
			
		else if(choice == 4) {
			System.out.println("Enter your search:");
			String search = key.nextLine();
			
			for(int i = 0; i < addressList.size(); i++) {  
				Entry entryI = addressList.get(i);
				String emailAddressI = entryI.emailAddress;
				
				if(emailAddressI.contains(search)) {	
					System.out.println("***********"
							+ "\n First Name: " + entryI.firstName
							+ "\n Last Name: " + entryI.lastName
							+ "\n Phone Number: " + entryI.phoneNum
							+ "\n Email Address: " + entryI.emailAddress 
							+ "\n ************");
				} 
			}
		}
		else {
			System.out.println("Invalid input");
		}

	}
	
	
	
	
//	Print the contents of the address book
	public void printAddressBook() {
		if(addressList.size() == 0) {
			System.out.println("The address book is empty.");
		}
		for(int i = 0; i < addressList.size(); i++) {
			Entry entryI = addressList.get(i);
			System.out.println("***********"
			+ "\n First Name: " + entryI.firstName
			+ "\n Last Name: " + entryI.lastName
			+ "\n Phone Number: " + entryI.phoneNum
			+ "\n Email Address: " + entryI.emailAddress 
			+ "\n ************");
		}
		
	}
	
	
	
//	Delete the contents of the address book
	public void deleteContents() {
		addressList.clear();
	}
	
	
	
//	Quit the program
	public void quit() {
		System.exit(0);
	}
	
	
	


}