package Level_2_Exercise_1.Main;

import Level_2_Exercise_1.Modules.Restaurant;

import java.util.HashSet;

public class Main {
    public static void main(String[] args){

        HashSet<Restaurant> hset = new HashSet<Restaurant>();

        hset.add(new Restaurant("Restaurant1",2));
        hset.add(new Restaurant("Restaurant2",3));
        hset.add(new Restaurant("Restaurant2",4));
        hset.add(new Restaurant("Restaurant4",5));

        hset.add(new Restaurant("Restaurant2",3));

        System.out.println(hset);
    }
}
