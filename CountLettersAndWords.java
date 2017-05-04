/**
 *
 * @author Waleed Mortaja,
 *contact Email : <a href="mailto:waleed.mortaja@gmail.com">waleed.mortaja@gmail.com</a>
 */
 
import java.util.Scanner; //import Scanner class

public class CountLettersAndWords {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);  //define Scanner object called in
        System.out.println("Enter a sentence and I will count how many letters, spaces and words does it have:");
        String sentence = in.nextLine(); //store the entered line in the variable sentece

        int letters = 0;
        int spaces = 0;
        int words = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ' && sentence.charAt(i) != '\t') {
                letters++;
            } else {
                spaces++;
            }
            words = sentence.split("\\s+").length; 
            /*split method splits the String into an array of Strings,
            it split the String whenever there is a space or more
            "\\s" means any type of spaces, "\\s+" means one or more spaces split the String, not at the first space only. 
            see Pattern class for more information
            https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
            */
        }

        System.out.println();
        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Words: " + (words));
    }

}
