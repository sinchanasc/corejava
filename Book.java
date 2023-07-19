public class Book{
	int price;
	String bookName;
	int noOfSheets;
    static String type;
    String author;
	String title;
	static String language;
	
	static{
		type="book";
		language="English";
	}
	
	public Book(int price,String bookName,int noOfSheets,String author,String title)
	{
		this.price=price;
		this.bookName=bookName;
		this.noOfSheets=noOfSheets;
		this.author=author;
		this.title=title;
	}
	
	public static void main(String[] args)
	{
		Book book = new Book(1000,"Middlemarch",180,"George Eliot","Novel");
		
		System.out.println(book.price);
		System.out.println(book.bookName);
		System.out.println(book.noOfSheets);
		System.out.println(book.author);
		System.out.println(book.title);
		
		Book book1 = new Book(1500,"Alice in Wonderland",90,"Jules Verne","Story");
		
		System.out.println(book1.price);
		System.out.println(book1.bookName);
		System.out.println(book1.noOfSheets);
		System.out.println(book1.author);
		System.out.println(book1.title);
		
		Book book2 = new Book(900,"Great Expectations",120,"Charles Dickness","Novel1");
		
		System.out.println(book2.price);
		System.out.println(book2.bookName);
		System.out.println(book2.noOfSheets);
		System.out.println(book2.author);
		System.out.println(book2.title);
		
		Book book3 = new Book(800,"Oliver Twist",170,"Mark Twain","StoryBook");
		
		System.out.println(book3.price);
		System.out.println(book3.bookName);
		System.out.println(book3.noOfSheets);
		System.out.println(book3.author);
		System.out.println(book3.title);
		
		Book book4 = new Book(1200,"JaneEyre",150,"Charlotte","Novel2");
		
		System.out.println(book4.price);
		System.out.println(book4.bookName);
		System.out.println(book4.noOfSheets);
		System.out.println(book4.author);
		System.out.println(book4.title);
	}
}
		
		
		
		
		
	
	