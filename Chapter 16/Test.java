import java.util.*;

class Test {
	
	public static void main(String [] args) {
		new Test().go();
	}

	public void go() {
		Book b1 = new Book("How Cats Work");
		Book b2 = new Book("Remix your Body");
		Book b3 = new Book("Finding Emo");
		BookCompare bCompare = new BookCompare();
		TreeSet<Book> tree = new TreeSet<Book>(bCompare);
		tree.add(b1);
		tree.add(b2);
		tree.add(b2);
		System.out.println(tree);
	}
}