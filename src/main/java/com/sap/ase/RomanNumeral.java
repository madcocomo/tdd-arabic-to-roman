package com.sap.ase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RomanNumeral {

    public static RomanNumeral valueOf(int value) {
        List<RomanDigit> digits = new ArrayList<>();
        while (value > 0) {
            for (RomanDigit digit : RomanDigit.values()) {
                if (value > digit.value) {
                    digits.add(digit);
                    value -= digit.value;
                }
                if (value == digit.value) {
                    digits.add(digit);
                    value -= digit.value;
                }
            }
        }
        return new RomanNumeral(digits.toArray(new RomanDigit[0]));
    }

    private RomanDigit[] digits;

    public RomanNumeral(RomanDigit... digits) {
        this.digits = digits;
    }

    @Override
    public String toString() {
        return Stream.of(digits)
                .map(RomanDigit::name)
                .collect(Collectors.joining());
    }

    enum RomanDigit {
        M(1000), D(500), C(100), L(50), X(10), V(5), I(1);
        private int value;

        RomanDigit(int value) {
            this.value = value;
        }
    }
}
