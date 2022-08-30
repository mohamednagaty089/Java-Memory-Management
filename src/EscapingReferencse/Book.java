package EscapingReferencse;

import java.util.ArrayList;
import java.util.Iterator;

public class Book  {
	private String title;
	private String author;
    public ArrayList<String> books;
	
	public String getTitle() {
		return title;
				
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
	
	

}
