package by.htp3.home.book;

import java.util.Comparator;

public class Book implements Cloneable {
	private String title;
	private String authorName;
	private String authorSurname;

	public Book(String _title, String _authorName, String _authorSurname) {
		this.title = _title;
		this.authorName = _authorName;
		this.authorSurname = _authorSurname;

	}

	public Book() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorSurname() {
		return authorSurname;
	}

	public void setAuthorSurname(String authorSurname) {
		this.authorSurname = authorSurname;
	}

	///////////////////////////////////////////////////////////////////////
	@Override
	public Book clone() throws CloneNotSupportedException {
		Book obj = null;

		obj = (Book) super.clone();
		obj.setTitle(this.getTitle());
		obj.setAuthorName(this.getAuthorName());
		obj.setAuthorSurname(this.getAuthorName());

		return obj;

	}

	@Override
	public String toString() {
		
		return title + " -||- " + authorName + " -||- " + authorSurname + " -||- ";
	}
} // end of public class Book

class CompareAuthor implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		int k = (b1.getAuthorSurname() ).compareTo(b2.getAuthorSurname());
		if (k == 0) {
			return b1.getAuthorSurname().compareTo(b2.getAuthorSurname());
		} else {
			return k;
		}

	}

}

class CompareTitle implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		int k = b1.getTitle().compareTo(b2.getTitle());
		if (k == 0) {
			return b1.getTitle().compareTo(b2.getTitle());
		} else {
			return k;
		}

	}

}

/*
 * @Override 
 * public int compare(String obj1, String obj2) { // поиск пробелов,для сортировки по фамилии 
 * 
 * int k = obj1.substring(obj1.indexOf(" ")).compareTo(obj2.substring(obj2.indexOf(" "))); 
 * if(k == 0) { return obj1.compareTo(obj2); 
 * } else { return k; } }
 */
