package mutability.test;

import java.util.Date;

public class Book1 {
	private String title;
	
	Book1(String title){
		this.title = title;
	}
	
	String title() {
		return String.format("%s / %s", this.title, new Date());
	}
	
	public static void main(String args[]) {
		Book1 b = new Book1("A");
		System.out.println(b.title());
	}
}
