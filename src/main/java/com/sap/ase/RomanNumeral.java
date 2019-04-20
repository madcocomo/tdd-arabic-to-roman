package com.sap.ase;

public class RomanNumeral {

    public static RomanNumeral valueOf(int value) {
        for (RomanDigit digit : RomanDigit.values()) {
            if (value == 2) {
                return new RomanNumeral(RomanDigit.I, RomanDigit.I);
            }
            if (digit.value == value) {
                return new RomanNumeral(digit);
            }
        }
        return null;
    }

    private RomanDigit[] digit;

    public RomanNumeral(RomanDigit... value) {
        this.digit = value;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (RomanDigit digit1: digit) {
            result.append(digit1.name());
        }
        return result.toString();
    }

    enum RomanDigit {
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

        private int value;

        RomanDigit(int value) {
            this.value = value;
        }
    }
}
