package Library_Management;
import java.util.*;
public class Library_Service 
{
	private Library books[] = new Library[50];
	private int count = 0;
	Scanner sc = new Scanner(System.in);
	
	public void addBook()
	{
		if(count < books.length)
		{
			books[count] = new Library();
			
			System.out.println("Enter the Accession Number: ");
			books[count].setAccessionNumber(sc.nextInt());
			
			sc.nextLine();
			System.out.println("Enter the Book Title: ");
			books[count].setTitle(sc.next());
			
			sc.nextLine();			
			System.out.println("Enter the Book Author: ");
			books[count].setAuthor(sc.next());
			
			System.out.println("Enter the Book Price: ");
			books[count].setPrice(sc.nextInt());
			
			count++;
		}
		
		else
		{
			System.out.println("Library is Full");
		}
	}
	
	public void displayAll()
	{
		if(count == 0)
		{
			System.out.println("No Book is Available");
			return;
		}
		
		System.out.print("Acc No Title Author Price");
		for(int i = 0; i < count; i++)
		{
			books[i].display();
		}
	}
	
	public void displayByAuthor()
	{
		System.out.println("Enter the Author Name: ");
		String author = sc.next();
		boolean found = true;
		for(int i = 0; i < count; i++)
		{
			if(books[i].getAuthor().equalsIgnoreCase(author))
			{
				books[i].display();
				found = false;
			}
		}
		if(found)
		{
			System.out.println("No Book Available with this Author Name");
		}
	}
	
	public void displayByTitle()
	{
		System.out.println("Enter the Title of Book: ");
		String title = sc.next();
		boolean found = true;
		for(int i = 0; i < count; i++)
		{
			if(books[i].getTitle().equalsIgnoreCase(title))
			{
				books[i].display();
				found = false;
			}
		}
		if(found)
		{
			System.out.println("No Book Available with this Title Name");
		}
	}
	
	public void displayCount()
	{
		System.out.println("Display the Count of Total Books: "+ count);
	}
	
	public void sortBook()
	{
		for(int i = 0; i < count - 1; i++)
		{
			for(int j = i; j < count; j++)
			{
				if(books[i].getAccessionNumber() > books[j].getAccessionNumber())
				{
					Library temp = books[i];
					books[i] = books[j];
					books[j] = temp;
				}
			}
		}
		System.out.println("Books Sorted by Accession Number");
		displayAll();
	}
	
	public void updateBook()
	{
		System.out.println("Enter the Book Title to Update: ");
		String updateTitle = sc.next();
		boolean found = true;
		for(int i = 0; i < count; i++)
		{
			if(books[i].getTitle().equalsIgnoreCase(updateTitle))
			{
				System.out.println("Enter the New Price: ");
				books[i].setPrice(sc.nextInt());
				
				sc.nextLine();
				System.out.println("Enter the Author Name: ");
				books[i].setAuthor(sc.next());
				
				found = false;
				System.out.println("Book is Update Successfully ");
				break;
			}
		}
		if(found)
		{
			System.out.println("Book not Found");
		}
	}
	
	public void deleteBook()
	{
		System.out.println("Enter the Price of Book to delete: ");
		int delPrice = sc.nextInt();
		boolean deleted = true;
		for(int i = 0; i < count; i++)
		{
			if(books[i].getPrice() == delPrice)
			{
				for(int j = i; j < count - 1; j++)
				{
					books[j] = books[j+1];
				}
				count--;
				deleted = false;
				System.out.println("Book Deleted");
				break;
			}
		}
		if(deleted)
		{
			System.out.println("No book found by this Price");
		}
	}
	
	public void range100to500()
	{
		System.out.println("Book price 100 to 500: ");
		boolean flag = true;
		for(int i = 0; i < count; i++)
		{
			if(books[i].getPrice() > 100 && books[i].getPrice() < 500)
			{
				books[i].display();
				flag = false;
			}
		}
		if(flag)
		{
			System.out.println("No Book Found in between price 100 to 500");
		}
	}
}








