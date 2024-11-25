package Level_1_Exercice_2;

import Level_1_Exercise_1.Modules.Month;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = new ArrayList<Integer>();
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()) {
            list2.add(0, it.next());
        }
        for (Integer value : list2) {
            System.out.println(value);
        }
    }
}
