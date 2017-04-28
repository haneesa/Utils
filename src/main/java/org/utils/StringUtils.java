package org.utils;

public class StringUtils {

	public static String mask(String original, int maskCharacters) {
		String masked = null;
		if (original != null && maskCharacters < original.length()) {
			masked = original.substring(0, maskCharacters);
			masked = masked.replaceAll(".", "*");
			masked = masked + original.substring(maskCharacters);
		}
		return masked;
	}
}