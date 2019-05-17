package model;

import algorithms.ObfuscationAlgorithm;

public class StringObfuscator {
    public static String processString(ObfuscationAlgorithm algorithm, String stringToObfuscate) {
        return algorithm.obfuscateString(stringToObfuscate);
    }
}
