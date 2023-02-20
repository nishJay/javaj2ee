import java.util.*;

public class databaseCaller{
    HashMap<String,String> phbook = new HashMap<>();
    private void create()
    {
        phbook.put("9695959595", "B");
        phbook.put("9595959595", "A");
        phbook.put("9795959595", "C");
        phbook.put("9895959595", "D");
        phbook.put("9995959595", "E");

    }

    public void display()
    {
        System.out.println("*****PhoneBook*****");
        System.out.println(phbook);
    }

    public void enter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the phone number");
        String num = sc.next();
        System.out.println("Enter y to enter name");
        String ch = sc.next();
        String naam = "Private Caller";

        if (ch == "y")
        {
           System.out.println("Enter name");
           naam = sc.next();
        }

        phbook.put(num,naam);

    }
}