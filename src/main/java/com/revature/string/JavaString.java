package com.revature.string;

/**
 * Same rules, suggestions and guidelines as first assignment.
 * 
 * Feel free to use whatever you need related to Strings in your solution, including:
 * - Array of characters.
 * - String.
 * - StringBuilder.
 * - StringBuffer.
 *
**/
public interface JavaString {
	
	/**
	 * 1. Transform a String into it's integer version parsing character by character.
	 * 
	 * Rule: Do NOT parse the whole String into a number, remember, character by character.
	 * 
	 * @return The integer version of the String.
	 * 
	 * @throws IllegalArgumentException if the number string is null or if it contains a
	 * non number character.
	**/
	public int parseInteger(String number) throws IllegalArgumentException;
	
	/**
	 * 2. Reverse the given String.
	 * 
	 * Rule: 
	 * - Do NOT use the built-in reverse() methods available.
	 * - You can use the built-in reverse() to compare outputs.
	 * 
	 * @return The reversed version of the String.
	 * 
	 * @throws IllegalArgumentException if string input is null.
	**/
	public String reverse(String string) throws IllegalArgumentException;
	
	/**
	 * 3. Measure which is faster appending characters.
	 * 
	 * Hint: Use System.currentTimeMillis().
	 * 
	 * @throws IllegalArgumentException if builder or buffer is null.
	**/
	public void time(StringBuilder builder, StringBuffer buffer) throws IllegalArgumentException;
	
	/**
	 * 4. Find if a word exist within a String.
	 * 
	 * @throws IllegalArgumentException if string is null.
	 */
	public boolean itContains(String string, String contains) throws IllegalArgumentException;
	
	/**
	 * 5. Sort the characters in the given String.
	 * 
	 * Hint: Anything is allowed.
	 * 
	 * @return The sorted version of the String.
	 * 
	 * @throws IllegalArgumentException if string is null
	 */
	public String sort(String string) throws IllegalArgumentException;
	
	/**
	 * 6. Delete the given character if it exists within the given String.
	 * 
	 * @return the new version of the String with the character deleted everywhere.
	 * 
	 * @throws IllegalArgumentException if the string is null.
	 */
	public String delete(String string, char c) throws IllegalArgumentException;
	
	/**
	 * 7. Transform the left half of the given String into upper case and the right half
	 * into lower case.
	 * 
	 * @return The new version of the String.
	 * 
	 * @throws IllegalArgumentException if the string is null or it's length is not even.
	 */
	public String upperLower(String string) throws IllegalArgumentException;
}
