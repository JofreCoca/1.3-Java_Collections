package Level_1_Exercise_1.Main;

import Level_1_Exercise_1.Modules.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<Month>();
        months.add(new Month("Janua ry"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));

        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        months.add(7,new Month("August"));

        System.out.println("\nArray List complet");
        for (Month readArrayListMonths : months) {
            System.out.println(readArrayListMonths);
        }

        months.add(7,new Month("August"));

        System.out.println("\nArray List August duplicate");
        for (Month readArrayListMonths : months) {
            System.out.println(readArrayListMonths);
        }

        HashSet<Month> hashSet = new HashSet<Month>();
        hashSet.addAll(months);

        System.out.println("\nFor HashSet complet no duplicates");
        for (Month value : hashSet) {
            System.out.println(value);
        }

        System.out.println("\nIterator HashSet complet no duplicates");
        Iterator<Month> it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }
    }
}