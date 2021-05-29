package setExample;

import java.util.*;

public class SetExercise {

    public static void main (String[] args){
        List<String> greetings = new ArrayList<String>();

        greetings.add("Hello");
        greetings.add("Hello");
        greetings.add("Bonjour");
        greetings.add("Guten Tag");
        greetings.add("Hola");
        greetings.add("Hola");

        // Add a List to a Set
        Set<String> uniqueGreetings = new HashSet<String>(greetings);

        // For Each to display values
        for (String text : uniqueGreetings){
            System.out.println(text);
        }

    }
}
