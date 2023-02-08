package arr;


import java.util.*;

public class arraylist {
	
	String a,b,c;
	
	public arraylist(String a, String b, String c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	

	@Override
	public String toString() {
		return "arraylist [a=" + a + ", b=" + b + ", c=" + c + "]";
	}



	public static void main(String args[])
	{
		arraylist o1 = new arraylist("Maroon","Green","Grey");
		
		ArrayList<String> colors = new ArrayList<>();
		colors.add(o1.a);
		colors.add(o1.b);
		colors.add(o1.c);
		colors.add("Blue");
		colors.add("Red");
		colors.add("Orange");
		colors.add("Yellow");
		
		System.out.println(o1.toString());
		System.out.println(colors);
		
		for(String s:colors){
			System.out.println(s);
			
		for (Iterator col = colors.iterator(); col.hasNext();) {
			String s1 = (String) col.next();
			System.out.println(s1);
			
		}
		}
	}

}
