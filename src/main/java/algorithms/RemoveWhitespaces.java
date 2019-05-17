package algorithms;

public class RemoveWhitespaces implements ObfuscationAlgorithm {
    public String obfuscateString(String stringToObfuscate) {
        return stringToObfuscate.replaceAll("\\s", "");
    }
}
