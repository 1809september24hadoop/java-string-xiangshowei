package com.revature.string;

import java.util.Arrays;

public class JavaStringSolution implements JavaString {
	
	/*
	 * Build the final integer by adding the value of each digit(one's, ten's, hundred's etc.)
	 * 
	 * @see com.revature.string.JavaString#parseInteger(java.lang.String)
	 */

	@Override
	public int parseInteger(String number) throws IllegalArgumentException {
		if(number == null || !number.matches("[0-9]+")) {
			throw new IllegalArgumentException();
		}
		
		char[] chars = number.toCharArray();
		
		int finalNum = 0;
		int digitPlace = 1;
		int numericalValue = 0;
		for(int i = chars.length - 1; i >= 0; i--) {
			if(Character.isDigit(chars[i])) {
				numericalValue = Character.getNumericValue(chars[i]);
				
				finalNum += numericalValue * digitPlace;
				digitPlace *= 10;
			}
		}
		
		return finalNum;
	}

	/*
	 * 
	 * Copy the characters of the original string starting from its last character
	 * 
	 * @see com.revature.string.JavaString#reverse(java.lang.String)
	 */
	@Override
	public String reverse(String string) throws IllegalArgumentException {
		if(string == null) {
			throw new IllegalArgumentException();
		}
		
		char[] chars = string.toCharArray();
		
		char[] newString = new char[chars.length];
		
		int charsLength = chars.length - 1;
		for(int i = 0; i < chars.length; i++) {
			newString[i] = chars[charsLength];
			charsLength--;
		}
		
		return new String(newString);
	}

	/*
	 * Testing the runtime of StringBuilder and StringBuffer
	 * 
	 * @see com.revature.string.JavaString#time(java.lang.StringBuilder, java.lang.StringBuffer)
	 */
	@Override
	public void time(StringBuilder builder, StringBuffer buffer) throws IllegalArgumentException {
		if(builder == null || buffer == null) {
			throw new IllegalArgumentException();
		}

		long stringBuilderStartTime = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++) {
			builder.append(i);			
		}
		long stringBuilderEndTime = System.currentTimeMillis();
		
		long stringBuilderTotalTime = stringBuilderEndTime - stringBuilderStartTime;
		
		System.out.println("StringBuilder took: " + stringBuilderTotalTime + "ms");
		
		long stringBufferStartTime = System.currentTimeMillis();
		
		for(int i = 0; i < 1000; i++) {
			buffer.append(i);			
		}
		
		long stringBufferEndTime = System.currentTimeMillis();
		 
		long stringBufferTotalTime = stringBufferEndTime - stringBufferStartTime;
		
		System.out.println("StringBuffer took: " + stringBufferTotalTime + "ms");
	}

	/*
	 * Checks to see if a word is within the larger string
	 * 
	 * @see com.revature.string.JavaString#itContains(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean itContains(String string, String contains) throws IllegalArgumentException {
		if(string == null) {
			throw new IllegalArgumentException();
		}
		
		if(contains.isEmpty()) {
			return false;
		}
		
		return string.contains(contains);
	}

	@Override
	public String sort(String string) throws IllegalArgumentException {
		if(string == null) {
			throw new IllegalArgumentException();
		}
		
		char[] chars = string.toCharArray();
		Arrays.sort(chars);
		
		return new String(chars);
	}

	@Override
	public String delete(String string, char c) throws IllegalArgumentException {
		if(string == null) {
			throw new IllegalArgumentException();
		}
		
		StringBuilder sb = new StringBuilder();
		
		char[] chars = string.toCharArray();
		for(int i = 0; i < chars.length; i++) {
			if(chars[i] != c) {
				sb.append(chars[i]);
			}
		}

		return sb.toString();
	}

	@Override
	public String upperLower(String string) throws IllegalArgumentException {
		if(string == null || string.length() % 2 != 0) {
			throw new IllegalArgumentException();
		}
		
		String firstHalf = string.substring(0, string.length()/2).toUpperCase();
		String secondHalf = string.substring(string.length()/2, string.length()).toLowerCase();
		
		StringBuilder sb = new StringBuilder(string.length());
		sb.append(firstHalf);
		sb.append(secondHalf);
				
		return sb.toString();
	}
}
