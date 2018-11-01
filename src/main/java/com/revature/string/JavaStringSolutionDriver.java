package com.revature.string;

public class JavaStringSolutionDriver {

	public static void main(String[] args) {
		
		JavaStringSolution jss = new JavaStringSolution();
		
		System.out.println(jss.parseInteger("12345"));
		
		try {
			jss.parseInteger("123abc");
		} 
		catch (IllegalArgumentException iae) {
			System.out.println("arugment contains a non-numeric number");
		}
		
		String str = "Hello";
		System.out.println(jss.reverse(str));
		
		jss.time(new StringBuilder(), new StringBuffer());
		System.out.println(jss.itContains("Hello World", "Hello"));
		System.out.println(jss.itContains("Hello World", "Java"));
		System.out.println(jss.sort("revature"));
		System.out.println(jss.delete("revature", 'e'));
		System.out.println(jss.upperLower("revature"));
	}

}
