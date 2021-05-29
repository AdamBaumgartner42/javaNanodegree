import java.util.List;
import java.util.function.Predicate;

public class LambdaMain {

    /**
     * Returns the number of strings that match a given condition.
     *
     * @params input : the strings that should be tested.
     * @params condition : the condition that strings should be tested against.
     * @return the number of strings in the input that match the condition.
    */

    public static long countMatchingStrings(List<String> input, Predicate<String> condition) {
        // In the lecture the content is not shown.  {...}
        return 100;
    }

    public static void main(String[] args){
        List<String> input = List.of("hello", "\t ", "world", "\t", " ", "goodbye", " ");

        long numberOfWhitespaceStrings =
                countMatchingStrings(
                        input,
                        new Predicate<String>(){
                            @Override
                            public boolean test(String s){
                                return s.trim().isEmpty();
                            }
                        });

        System.out.println(numberOfWhitespaceStrings + " whitespace strings");

    }
}
