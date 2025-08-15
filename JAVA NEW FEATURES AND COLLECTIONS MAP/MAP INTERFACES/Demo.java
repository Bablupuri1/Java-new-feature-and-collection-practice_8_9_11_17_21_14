import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        System.out.println("welcome");

        HashMap m = new HashMap();
        m.put("bablu", 100000);
        m.put("kundan", 200000);
        m.put("kumar", 300000);
        m.put("kamal", 400000);
        m.put("kamlesh", 500000);

        System.out.println("map:" + m);
        System.out.println("here:" + m.put("bablu", 900000));

        Set s = m.keySet();
        System.out.println("keyset:" + s);

        Collection c = m.values();
        System.out.println("collection values" + c);

        Set s1 = m.entrySet();
        System.out.println("entryset" + s1);

        Iterator itr = s1.iterator();
        while (itr.hasNext()) {

            Map.Entry m1 = (Map.Entry) itr.next();

            System.out.println(
                    "entry set pe apppy kiya h " + m1);

            System.out.println(m1.getKey() + " " + m1.getValue());

        }

    }

}
