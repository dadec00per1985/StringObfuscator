package model;

import algorithms.ObfuscationAlgorithm;

public class StringObfuscator {

    private String actualValue;

    public StringObfuscator(String actualValue) {
        this.actualValue = actualValue;
    }

    public String getActualValue() {
        return actualValue;
    }

    @Override
    public String toString() {
        return "StringObfuscator actualValue = " + actualValue;
    }

    public static class Obfuscator {
        private String actualValue;

        public Obfuscator setValue(String value) {
            this.actualValue = value;
            return this;
        }

        public Obfuscator processString(ObfuscationAlgorithm obfuscationAlgorithm) {
            this.actualValue = obfuscationAlgorithm.obfuscateString(actualValue);
            return this;
        }

        public StringObfuscator obfuscate() {
            return new StringObfuscator(actualValue);
        }
    }
}
