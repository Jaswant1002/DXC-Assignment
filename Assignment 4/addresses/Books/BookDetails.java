package Books;
import java.util.Scanner;
public class BookDetails {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Book obj=new Book();
		
		System.out.println("enter book Author");
		obj.setAuthor(scan.nextLine());
		System.out.println("enter book title");
		obj.setTitle(scan.nextLine());
		System.out.println("enter book number");
		obj.setBookNo(scan.nextInt());
		System.out.println("enter book Price");
		obj.setPrice(scan.nextFloat());
		System.out.println("Book Number: "+obj.getBookNo()+"\nBook Title: "+obj.getTitle()+"\nBook Author"+obj.getAuthor()+"\nBook Price: "+obj.getPrice());
		scan.close();
	}

}
