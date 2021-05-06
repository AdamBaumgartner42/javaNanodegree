package collectionsExample;

import java.util.List;
import java.util.LinkedList;

public class CollectionsExample {

    public static void main(String[] args){
        List<String> listOfItems = new LinkedList<String>();

        listOfItems.add("Mike");
        listOfItems.add("Bob");
        listOfItems.add("Alice");

        for (String name : listOfItems){
            System.out.println(name);
        }

    }
}
