package ll;
import java.util.*;
public class linkedlist
{
	public static void main(String args[]) 
	{
		LinkedList<Integer> ll0 = new LinkedList<Integer>();
		ll0.add(25);
		ll0.add(24);
		ll0.add(23);
		ll0.add(22);
		ll0.add(21);
		
		System.out.println(ll0);
		
		ll0.addFirst(0);
		ll0.addLast(9999);
		
		System.out.println(ll0);
		
		Object var = ll0.get(0);
		System.out.println(var);
		ll0.set(0,26);
		System.out.println("After changing"+ll0);
		
		ll0.removeFirst();
		ll0.removeLast();
		System.out.println("After removing"+ll0);
		
		
	}

}

