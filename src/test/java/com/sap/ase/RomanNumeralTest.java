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

    @Test
    public void test_multiple_digits() {
        assertArabicToRoman(2, "II");
        assertArabicToRoman(8, "VIII");
        assertArabicToRoman(200, "CC");
    }

    @Test
    public void test_4x_and_9x() {
        assertArabicToRoman(4, "IV");
        assertArabicToRoman(9, "IX");
        assertArabicToRoman(40, "XL");
        assertArabicToRoman(90, "XC");
        assertArabicToRoman(400, "CD");
        assertArabicToRoman(900, "CM");
    }

}
