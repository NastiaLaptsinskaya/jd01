package by.htp3.home.book;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectToFile {
	
	public static void main(String[] args) throws CloneNotSupportedException, IOException, IllegalArgumentException, IllegalAccessException {

		ArrayList<Book> bookCollection = new ArrayList<Book>();

		Book b1 = new Book("Thinking in Java", "Bruis", "Ekkel");
		Book b2 = new Book("Learning Java", "Syerra", "Beits");
		Book b3 = new Book("Java Patterns", "Syerra", "Beits");
		Book b4 = new Book("Methods of programming", "Alexander", "Blinov");
		Book b5 = new Book("Testing Dot.com", "Roman", "Savin");
		Book b6 = new Book("PO testing", "Sviatoslav", "Kulikov");

		bookCollection.add(b1); //
		bookCollection.add(b2); //
		bookCollection.add(b3); //
		bookCollection.add(b4); // Preparing our collection of Books
		bookCollection.add(b5); //
		bookCollection.add(b6); //

		System.out.println(bookCollection.get(0).toString() + "  Before sorting ");

		bookCollection.sort(new CompareTitle());
		System.out.println(bookCollection.get(0).toString() + "  After sorting ");
		
		// bookCollection.sort(new CompareAuthor());
		// Collections.sort(bookCollection, new CompareAuthor());

//--------  Creating the file from the collection------ Start--
		
		FileWriter out = new FileWriter("books.txt");
		BufferedWriter brOut = new BufferedWriter(out);
		PrintWriter pw = new PrintWriter(brOut);

		Iterator<Book> iter = bookCollection.iterator(); //
		while (iter.hasNext()) {                         //
			pw.write((iter.next()).toString() + "\n");   // For filling file with
														 // collection of Books
		} 

		pw.close(); // pw, brOut and out now are closed!!!
		
//--------  Creating the file from the collection------ End---
	
	}
	
}

