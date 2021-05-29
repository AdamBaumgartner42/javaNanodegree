package regExExample;

import java.util.regex.*;


public class regExExercise {

    public static void main(String[] args){

        String emailRegex = "^(.+)@(.+)\\.(.+)$";

        String email = "Mike@ms.dox";

        // Conventional Regex
        Pattern p = Pattern.compile(emailRegex);
        Matcher m = p.matcher(email);
        boolean b = m.matches();

        if(b){
            System.out.println(email + " is OK");
        } else {
            System.out.println(email + " is not valid");
        }

        // Super short 1x regex
        boolean rc = Pattern.matches("^(.+)@(.+)\\.(.+)$", email);

        if(rc){
            System.out.println(email + " is OK");
        } else {
            System.out.println(email + " is not valid");
        }
    }
}
