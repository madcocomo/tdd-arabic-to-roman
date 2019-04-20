package com.sap.ase;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralTest {

    private void assertArabicToRoman(int arabic, String roman) {
        RomanNumeral romanNumeral = RomanNumeral.valueOf(arabic);
        assertThat(romanNumeral.toString(), is(roman));
    }

	@Test
	public void test_single_digit() {
        assertArabicToRoman(1, "I");
        assertArabicToRoman(5, "V");
        assertArabicToRoman(10, "X");
        assertArabicToRoman(50, "L");
        assertArabicToRoman(100, "C");
        assertArabicToRoman(500, "D");
        assertArabicToRoman(1000, "M");
    }

}
