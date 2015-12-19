package com.varadhisoft.java.programs;

import java.util.Arrays;

public class Anagram1 {

	public static void main(String[] args) {
		
		System.out.println(isAnagram("army", "mary"));
		System.out.println(isAnagram("ass", "saa"));
		
		System.out.println(iAnagram("army", "mary"));
		System.out.println(iAnagram("ass", "saa"));
		
		

	}

	/*
	 * * One way to find if two Strings are anagram in Java. This method *
	 * assumes both arguments are not null and in lowercase. * * @return true,
	 * if both String are anagram
	 */
	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}

		char[] chars = word.toCharArray();
		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index)
						+ anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	} /*
		 * * Another way to check if two Strings are anagram or not in Java *
		 * This method assumes that both word and anagram are not null and
		 * lowercase * @return true, if both Strings are anagram.
		 */

	public static boolean iAnagram(String word, String anagram) {
		char[] charFromWord = word.toCharArray();
		char[] charFromAnagram = anagram.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		return Arrays.equals(charFromWord, charFromAnagram);
	}

	public static boolean checkAnagram(String first, String second) {
		char[] characters = first.toCharArray();
		StringBuilder sbSecond = new StringBuilder(second);
		for (char ch : characters) {
			int index = sbSecond.indexOf("" + ch);
			if (index != -1) {
				sbSecond.deleteCharAt(index);
			} else {
				return false;
			}
		}
		return sbSecond.length() == 0 ? true : false;
	}
	// Read more:
	// http://javarevisited.blogspot.com/2013/03/Anagram-how-to-check-if-two-string-are-anagrams-example-tutorial.html#ixzz3lID3xQnF
}
