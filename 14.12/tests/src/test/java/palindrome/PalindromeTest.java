package palindrome;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

	@DisplayName("Should return True when word is a Palindrome")
	@RepeatedTest(1)
	public void testPalindrome(){
		boolean result = Palindrome.isPalindrome("pętaka pętaj a tępaka tęp");

		assertTrue(result);
	}

	@DisplayName("Should return False when word is not a Palindrome, string is empty or equals null")
	@RepeatedTest(1)
	public void testPalindromeException(){
		boolean result = Palindrome.isPalindrome(null);

		assertFalse(result);
	}
}
