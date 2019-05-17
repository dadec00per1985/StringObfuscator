import algorithms.RemoveDigits;
import algorithms.RemoveWhitespaces;
import algorithms.ToLowerCase;
import algorithms.ToUpperCase;
import model.StringObfuscator;

public class Main {

    public static void main(String[] args) {

        String ourString = "ka2K  KAK  AKil  676  43m il";
        System.out.println("Our String: " + ourString);
        System.out.println("RemoveDigits: " + StringObfuscator.processString(new RemoveDigits(), ourString));
        System.out.println("RemoveWhitespaces: " + StringObfuscator.processString(new RemoveWhitespaces(), ourString));
        System.out.println("ToLowerCase: " + StringObfuscator.processString(new ToLowerCase(), ourString));
        System.out.println("ToUpperCase: " + StringObfuscator.processString(new ToUpperCase(), ourString));


    }

}
