import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Programm   {
    public static void main(String[] args) {

        Person p = new Person("Alex","Mayer",23,"Hb213123");

        Map<String,Person> personMap = new HashMap<>();
        personMap.put(p.ausweisNr, p);
        Person p2 = personMap.get("Hb213123");
        //personMap.remove(p.ausweisNr);
        Set<String> keys = personMap.keySet();
        System.out.println(keys);
        Collection<Person> va = personMap.values();
        System.out.println(va);

    }
}
