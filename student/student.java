package student;

import java.util.*;

public class student 
{
	String name;
    String usn;
    int age;
    float cgpa;

    

   public student(String name, String usn, int age, float cgpa) {
       this.name = name;
       this.usn = usn;
       this.age = age;
       this.cgpa = cgpa;
   }





   public static void main(String args[]) 
   {
	   Scanner sc = new Scanner(System.in);
       ArrayList<student> s = new ArrayList<student>();
       int i;
       
       for(i=0;i<5;i++)
       {
    	   student st = new student("","",0,0);
    	   System.out.println("Enter the student name");
    	   st.name = sc.next();
    	   System.out.println("Enter the student usn");
    	   st.usn = sc.next();
    	   System.out.println("Enter the student age");
    	   st.age = sc.nextInt();
    	   System.out.println("Enter the student cgpa");
    	   st.cgpa = sc.nextFloat();    
    	   s.add(st);
    	   
       }
       
       for (Iterator j = s.iterator(); j.hasNext();)
       {
    	   student sto = (student)j.next();
    	   if(sto.cgpa > 8.0)
    	   {
    		   System.out.println(sto.name);
    	   }
    	   
		
	}
       
       for (Iterator j = s.iterator(); j.hasNext();)
       {
    	   student sto = (student)j.next();
    	   if(sto.name.startsWith("a"))
    	   {
    		   System.out.println(sto.name);
    	   }
    	   
		
	}

	for (Iterator j = s.iterator(); j.hasNext();)
       {
    	   student sto = (student)j.next(); 
		   System.out.println(s.indexOf(sto)+": "+ sto.name);    
    	  	   
    	}

	System.out.println("Enter the index of the student whose name has to be updated");
	Integer usnch = sc.nextInt();
	System.out.println("Enter the new name has to be updated");
	String naam = sc.next();

	for (Iterator j = s.iterator(); j.hasNext();)
       {
    	   student sto = (student)j.next(); 
		   if(s.indexOf(sto)==usnch){
			sto.name = naam;			
		   }
		   System.out.println(s.indexOf(sto)+": "+ sto.name);    
    	  	   
    	}       
   }

}
