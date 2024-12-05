package mutability.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// Represented Mutability 
public class Book2 {
	private final Path path;
	
	public Book2(Path path) {
		this.path = path;
	}
	
	Book2 rename(String title) throws IOException {
		Files.write(this.path, title.getBytes(), StandardOpenOption.CREATE);
		return this;
	}
	
	String title() throws IOException {
		return new String(Files.readAllBytes(this.path));
	}
	
	public static void main(String args[]) {
		Path path = Paths.get("C:/Users/User/Documents/book.txt");
		Book2 b = new Book2(path);
		try {
			String t1 = b.title();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			b.rename("A");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}   
