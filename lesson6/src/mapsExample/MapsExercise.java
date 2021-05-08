package mapsExample;

import java.util.*;

public class MapsExercise {

    public static void main(String[] args){
        Map<String, Person> mapOfPeople = new HashMap<String, Person>();

        // Create ArrayList and populate with Person objects
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Mike", "mike@gmail.com"));
        people.add(new Person("Shaun", "shaun@email.com"));
        people.add(new Person("Sally", "sally@email.com"));
        people.add(new Person("Cesar", "cesar@email.com"));

        // Loop over the ArrayList and add them to your map
        for ( Person person : people){
            mapOfPeople.put(person.getEmail(), person);
        }

        // Example usage
        Person suspect = mapOfPeople.get("sally@email.com");
        System.out.println("Suspect: " + suspect.getName());

        // Print the keyset
        for (String email : mapOfPeople.keySet()){
            System.out.println(email);
        }

        // Print the values
        for (Person person : mapOfPeople.values()){
            System.out.println(person);
        }



    }
}
