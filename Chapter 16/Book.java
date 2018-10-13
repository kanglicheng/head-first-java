class Book implements Comparable<Book> {
	String title;
	
	public int compareTo(Book b) {
		return title.compareTo(b.title);
	}
	
	public Book(String t) {
		title = t;
	}
}