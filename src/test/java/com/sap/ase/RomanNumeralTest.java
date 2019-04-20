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
	public void _1_is_I() {
        assertArabicToRoman(1, "I");
    }

    @Test
    public void _5_is_V() {
        assertArabicToRoman(5, "V");
    }
}
