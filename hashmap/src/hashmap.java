import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<Integer, String>();

        hash.put(2, "JJ");
        hash.put(3, "JK");
        hash.put(4, "JL");
        hash.put(5, "JM");

        System.out.println(hash);

        Set<Entry<Integer, String>> set = hash.entrySet();

        for (Entry<Integer, String> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

    }

}
