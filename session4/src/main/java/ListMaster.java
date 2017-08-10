import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ListMaster {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Nam");
        names.add("Viet");
        names.add("Ha");

        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        names.add("Hung");
        names.add("Dung");
        names.add("Sang");
        names.add("Trong");
        names.add("Thang");

        System.out.println("Size: " + names.size());

        for (String name : names) {
            System.out.println(name);
        }

        //Sort the list
        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
