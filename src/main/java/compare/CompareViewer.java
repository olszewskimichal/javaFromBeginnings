package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareViewer {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        list.add(new Human("Imie", "Nazwisko", Plec.MALE));
        list.add(new Human("Adam", "Adamski", Plec.MALE));
        list.add(new Human("Banda", "Wanda", Plec.FEMALE));

        for (Human human : list) {
            System.out.println(human);
        }

        Collections.sort(list);
        for (Human human : list) {
            System.out.println(human);
        }

        Collections.sort(list, new Comparator<Human>() {

            @Override
            public int compare(Human o1, Human o2) {
                int compareTo = o1.getPlec().compareTo(o2.getPlec());
                if (compareTo == 0)
                    return o1.compareTo(o2);
                return compareTo;
            }
        });

        for (Human human : list) {
            System.out.println(human);
        }
    }
}
