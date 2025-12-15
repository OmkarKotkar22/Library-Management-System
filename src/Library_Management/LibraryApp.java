/*Q1. Create a class called Library to hold accession number,title of the book,author name,
 * price of the book and write a menu driven program in java that implements the working of 
 * a library : The menu options should be: 
 * 1. Add Book Details. 
 * 2. Display All Book Details. 
 * 3. Display List of all book of given author. 
 * 4. Display list the title of specified book. 
 * 5. Display list count of the book in the library. 
 * 6. Display list the books in the ascending order of accession number. 
 * 7. Update book details by title of book. 
 * 8. Delete book details by price. 
 * 9. Display the price range between 100 to 500. 
 * 10. Exit The Code.
 * */

package Library_Management;

import java.util.*;
public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Book record do you want enter? ");

		Library_Service operation = new Library_Service();

        int choice;
        do {
            System.out.println("\n====== Library Menu ======");
            System.out.println("1. Add Book Details");
            System.out.println("2. Display All Book Details");
            System.out.println("3. Display Books by Given Author");
            System.out.println("4. Display Book by Title");
            System.out.println("5. Display Count of Books");
            System.out.println("6. Display Books in Ascending Order of Accession Number");
            System.out.println("7. Update Book by Title");
            System.out.println("8. Delete Book by Price");
            System.out.println("9. Display Books with Price Range 100-500");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: 
                		operation.addBook();
                		break;
                		
                case 2: 
                		operation.displayAll();
                		break;
                		
                case 3: 
            		operation.displayByAuthor();
            		break;
            		
                case 4: 
                		operation.displayByTitle();
                		break;
                		
                case 5: 
                		operation.displayCount();
                		break;
                		
                case 6: 
                		operation.sortBook();
                		break;
                
                case 7: 
                		operation.updateBook();
                		break;
                
                case 8: 
                		operation.deleteBook();
                		break;
                		
                case 9:
                		operation.range100to500();
                		break;
                
                case 10: 
                		System.out.println("Good Bye...");
                		break;
                		
                default: 
                		System.out.println("Invalid choice!");
            }
        } while (choice != 10);

        sc.close();
	}

}










