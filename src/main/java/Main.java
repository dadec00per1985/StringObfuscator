import algorithms.RemoveDigits;
import algorithms.RemoveWhitespaces;
import algorithms.ToLowerCase;
import algorithms.ToUpperCase;
import model.StringObfuscator;

public class Main {

    public static void main(String[] args) {

        String ourString = "ka2K  KAK  AKil  676  43m il";
        System.out.println("StringToProcess: " + ourString);

        // our algorithms:
        RemoveDigits removeDigits = new RemoveDigits();
        RemoveWhitespaces removeWhitespaces = new RemoveWhitespaces();
        ToLowerCase toLowerCase = new ToLowerCase();
        ToUpperCase toUpperCase = new ToUpperCase();

        StringObfuscator stringObfuscator = new StringObfuscator.Obfuscator()
                .setValue(ourString)
                .processString(removeDigits)
                .processString(removeWhitespaces)
                .processString(toUpperCase)
                .obfuscate();

        System.out.println(stringObfuscator);
    }
}
