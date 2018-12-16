package compare;

import java.util.ArrayList;
import java.util.Collections;
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


    }
}
