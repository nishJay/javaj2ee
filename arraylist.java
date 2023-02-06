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

        for (Iterator col = colors.iterator(); col.hasNext();) {
			String s1 = (String) col.next();
			System.out.println(s1);
			
		}
	}

}