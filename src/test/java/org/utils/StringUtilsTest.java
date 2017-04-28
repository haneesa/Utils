package org.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testMask() {
		assertEquals("*****sa@yahoo.com", StringUtils.mask("haneesa@yahoo.com", 5));
	}

}
