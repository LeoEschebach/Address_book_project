package addressBook;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Record addressBook = new Record();
		while(true) {
			parseEntry(getEntry(), addressBook);
		}
		
	}
	private static int getEntry() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose what you'd like to do with the database \n"
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
	private static void parseEntry(int choice, Record addressBook) {
		// based off option, you would break into specific addresBook method
		// addressBook.method();
			if(choice == 1) {
				addressBook.newEntry();
			}
			else if(choice == 2) {
				addressBook.deleteEntry();
			}
			else if(choice == 3) {
				addressBook.findEntry();
			}
			else if(choice == 4) {
				addressBook.printAddressBook();
			}
			else if(choice == 5) {
				addressBook.deleteContents();
			}
			else if(choice == 6) {
				addressBook.quit();
			}
			else {
				System.out.println("Invalid input, please try again.");
			}
			
		
		
	}

}
