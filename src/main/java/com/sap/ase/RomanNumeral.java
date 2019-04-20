package com.sap.ase;

public class RomanNumeral {
    private int value;

    public static RomanNumeral valueOf(int value) {
        return new RomanNumeral(value);
    }

    public RomanNumeral(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == 5) {
            return "V";
        }
        return "I";
    }
}
