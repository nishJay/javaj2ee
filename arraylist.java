import java.util.*;

public class arraylist {
	
	public static void main(String args[])
	{
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Blue");
		colors.add("Red");
		colors.add("Orange");
		colors.add("Yellow");
		
		System.out.println(colors);
		
		for(String s:colors){
			System.out.println(s);
		}
	}

}