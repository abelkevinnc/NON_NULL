package paquete.prueba;

import java.util.Objects;

public class Principal2 {
	public static boolean containsVowels(String word) {
		
		try {
			Objects.requireNonNull(word, "please don't give me a null");
			
			// TODO make sure word is not null with requireNonNull().
		    // If word is null, add the custom message "please don't give me a null"
		    String[] vowels = { "a", "e", "i", "o", "u" };

		    for (int i = 0; i < 5; ++i) {
		        // If the following line generates a crash during runtime, it is not clear wether `word` or `vowel` is null.
		        // Is there a bug in your code or is your method being used wrong?
		        if (word.toLowerCase().contains(vowels[i])) {
		            return true;
		        }
		       // To avoid this sort of problem, add the instruction
		       //	Objects.requireNonNull(word, "please don't give me a null");
		       // as the first line of the method
		    }
		    return false;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		boolean flag = Principal2.containsVowels(null);
		System.out.println(flag);
	}
}
