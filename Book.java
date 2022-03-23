package edu.monmouth.hw3;

public class Book {

	
	 private int numberOfPages;
	 private BookTypes bookType;
	 private String title;
	
	 
	 public Book(int numberOfPages, String title, BookTypes bookType)throws BookException{
		
		this.numberOfPages = numberOfPages;
		this.bookType = bookType;
		this.title = title;
		
	}

	public int getTotalPages() {
		 return numberOfPages;
	}

	public void setTotalPages(int numberOfPages) {
		 this.numberOfPages = numberOfPages;
	}

	public BookTypes getBookType() {
		   return bookType;
	}

	public void setBookType(BookTypes bookType) {
		   this.bookType = bookType;
	}

	 public String getTitle() {
		  return title;
	}

	public void setTitle(String title) {
		  this.title = title;
	}


	@Override
	public String toString() {
	return "book title: " + title +" type: " + bookType + " number of pages: "+ numberOfPages ;
			
			
		    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
