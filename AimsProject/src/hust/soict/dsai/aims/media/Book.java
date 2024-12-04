package hust.soict.dsai.aims.media;

import java.util.*;

public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<String>();

	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}

	public Book() {
	}

	public Book(int id, String title, String category, float cost, ArrayList<String> authors) {
		super(id, title, category, cost);
		this.authors = authors;
	}

	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) { 
			System.out.println("Author " + authorName + " already exists in the authors list.");
		} else {
			authors.add(authorName);
			System.out.println("Author " + authorName + " successfully added.");
		}
	}
	
	public void removeAuthor(String authorName) {
	    if (authors.contains(authorName)) { 
	        authors.remove(authorName);
	        System.out.println("Author " + authorName + " removed.");
	    } else {
	        System.out.println("Author " + authorName + " not found.");
	    }
	}
	
	public String authorToString() {
		String author = String.join(", ", this.getAuthors());
		return author;
	}
	
	public String toString() {
		return "Book - title: " + this.getTitle() +
				" - category: " + this.getCategory() +
				" - authors: " + this.authorToString() +
				" - cost: " + this.getCost() + "$";
	}
}
