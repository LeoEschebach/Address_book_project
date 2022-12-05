package addressBook;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		parseEntry(getEntry());
		
		
	}
	private static int getEntry() {
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to do? \n"
				+ "Enter: \r\n"
				+ "1 to add an entry \r\n"
				+ "2 to remove and entry\r\n"
				+ "3 to search for a specific entry\r\n"
				+ "4 to print the contents of the address book\r\n"
				+ "5 to delete the contents of the address book\r\n"
				+ "6 to quit the program");
		int choice = input.nextInt();
		return choice;
	}
	private static void parseEntry(int choice) {
		// based off option, you would break into specific addresBook method
		// addressBook.method();
		while(true) {
			if(choice == 1) {
				newEntry();
			}
			else if(choice == 2) {
				
			}
			
		}
		
	}

}
