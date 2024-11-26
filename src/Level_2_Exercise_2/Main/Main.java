package Level_2_Exercise_2.Main;

import Level_2_Exercise_1.Modules.Restaurant;

import java.util.*;

public class Main {
    public static void main(String[] args){

        Comparator<Restaurant> comparator = (r1, r2) -> {
            int nameComparison = r1.getName().compareTo(r2.getName());
            if (nameComparison != 0) {
                return nameComparison;
            }
            return Integer.compare(r2.getScore(), r1.getScore());
        };

        TreeSet<Restaurant> restaurants = new TreeSet<>(comparator);

        restaurants.add(new Restaurant("Restaurant4",5));
        restaurants.add(new Restaurant("Restaurant1",2));
        restaurants.add(new Restaurant("Restaurant2",4));
        restaurants.add(new Restaurant("Restaurant2",3));

        restaurants.add(new Restaurant("Restaurant2",3));

        System.out.println(restaurants);
    }
}
