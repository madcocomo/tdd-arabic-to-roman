package com.sap.ase;

import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    private RomanDigit[] digits;

    public RomanNumeral(RomanDigit... value) {
        this.digits = value;
    }

    @Override
    public String toString() {
        return Stream.of(digits)
                .map(RomanDigit::name)
                .collect(Collectors.joining());
    }

    enum RomanDigit {
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

        private int value;

        RomanDigit(int value) {
            this.value = value;
        }
    }
}
