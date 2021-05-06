package regExExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTester {

    public static void main(String[] args){

        String emailRegex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        String email = "jeff@gmail.com";

        System.out.print(pattern.matcher(email).matches());






    }


}
