package mutability.test;

public class Book {
	private String title;
	
	Book(String t){
		this.title = t;
	}
	
	void setTitle(String s) {
		this.title = s;
	}
	
	public Book withTitle(String t) {
		return new Book(t);
	}
	
	String title() {
		return this.title;
	}
	
	public static void main(String args[]) {
		Book b = new Book("One Title");
		b.setTitle("Two Title");
		System.out.println(b.title());
		Book b1 = b.withTitle("Three Title");
		System.out.println(b1.title());
		System.out.println(b.title());
		// In the above Example One Title changed due to the setter yes there is a tradeoff performance wise but maintainability wise its better  to have 
		// the second option 
	}
}

