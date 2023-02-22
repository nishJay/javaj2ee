package Question2;

import java.util.*;


public class main
{
	public static void main(String args[])
	{
		ArrayList<Books> bookList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			Books ob = new Books("","","",0);
			
					
			System.out.println("Enter the book title");
			ob.title = sc.next();
			
			System.out.println("Enter the book title");
			ob.author = sc.next();
			
			System.out.println("Enter the book title");
			ob.publisher = sc.next();
			
			System.out.println("Enter the book title");
			ob.price = sc.nextFloat();
			
			bookList.add(ob);
			
			
			
		}
		
		
	}

}
