package algorithms;

public class RemoveDigits implements ObfuscationAlgorithm {
    public String obfuscateString(String stringToObfuscate) {
        return stringToObfuscate.replaceAll("\\d", "");
    }
}
