package sortingExample;

import java.util.*;

public class SortingExample {

    public static void main(String[] args){
        List<String> names = new ArrayList<String>();

        names.add("Zach");
        names.add("Oscar");
        names.add("Mike");
        names.add("Anna");

        Collections.sort(names);

        for (String name : names){
            System.out.println(name);
        }
    }
}
