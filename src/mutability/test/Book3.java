package mutability.test;

// Encapsulated Mutability 
public class Book3 {
  private StringBuffer sb = new StringBuffer();
  private String title;
  
  Book3(String title){
	  this.title = title;
  }
  
  Book3 rename(String t) {
	  this.sb.setLength(0);
	  this.sb.append(t);
	  return this;
  }
  
  
  String title() {
	  if(sb.length()==0)
  	 		return this.title;
  	 	else
  	 		return this.sb.toString();
  }
  
  public static void main(String args[]) {
	  Book3 b = new Book3("New Book");
	  String t1 = b.title();
	  System.out.println(t1);
	  Book3 b2 = b.rename("B");
	  String t2 = b.title();
	  System.out.println(t2);
	  System.out.println(b2.title());
  }
}
