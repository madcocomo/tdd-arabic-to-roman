package com.sap.ase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RomanNumeral {

    public static RomanNumeral valueOf(int value) {
        List<RomanDigit> digits = new ArrayList<>();
        while (value > 0) {
            int finalValue = value;
            RomanDigit digit = Arrays.stream(RomanDigit.values())
                    .sorted(Comparator.comparingInt(RomanDigit::getValue).reversed())
                    .filter(d -> d.biggerOrEqual(finalValue))
                    .findFirst().get();
            digits.add(digit);
            value -= digit.getValue();
        }
        return new RomanNumeral(digits);
    }

    private List<RomanDigit> digits;

    public RomanNumeral(List<RomanDigit> digits) {
        this.digits = digits;
    }

    @Override
    public String toString() {
        return digits.stream()
                .map(RomanDigit::name)
                .collect(Collectors.joining());
    }

    enum RomanDigit {
        M(1000), CM(900), D(500), CD(400), C(100), XC(90), L(50), XL(40), X(10), IX(9), V(5), IV(4), I(1);

        private int value;

        public boolean biggerOrEqual(int value) {
            return this.value <= value;
        }

        public int getValue() {
            return value;
        }

        RomanDigit(int value) {
            this.value = value;
        }


    }
}
