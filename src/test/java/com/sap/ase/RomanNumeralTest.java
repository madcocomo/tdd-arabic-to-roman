package com.sap.ase;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralTest {

	@Test
	public void _1_is_I() throws Exception {
	   RomanNumeral roman = RomanNumeral.valueOf(1);
	   assertThat(roman.toString(), is("I"));
	}
}
