package Firstexample;

public class stringmanupulationexample {
	    public static void main(String[] args) {
	        String original = "Java Programming";

	        // Length
	        System.out.println("Length: " + original.length());

	        // Substring
	        System.out.println("Substring: " + original.substring(5));

	        // Replace
	        System.out.println("Replace: " + original.replace("Java", "Python"));

	        // Uppercase
	        System.out.println("Uppercase: " + original.toUpperCase());

	        // Character at index
	        System.out.println("Char at index 2: " + original.charAt(2));

	        // Index of substring
	        System.out.println("Index of 'Program': " + original.indexOf("Program"));
	    }
	}

