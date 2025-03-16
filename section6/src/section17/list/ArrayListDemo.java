package section17.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        List<Character> vowels = new ArrayList<Character>();
        var doubles = new ArrayList<Double>();
        List<String> countryNames = new ArrayList<String>();

        countryNames.add("Nepal");
        countryNames.add("India");
        countryNames.add("China");
        countryNames.add("USA");
        countryNames.add("India");
//        System.out.println("is list empty : " + countryNames.isEmpty());

        System.out.println("country size: " + countryNames.size());
        System.out.println(countryNames);
        countryNames.add(2, "Japan");
        System.out.println(countryNames);


    }
}
