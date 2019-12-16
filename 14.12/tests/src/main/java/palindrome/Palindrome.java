package palindrome;

public class Palindrome {

	static boolean isPalindrome(String word){
		if( word == null || word.trim().length() == 0 ){
			return false;
		}
		if( word.length() > 100 ){
			throw new WordIsToLongException("Word is to Long");
		}

		String formattedWord = word
				.replace(" ", "")
				.replace(",", "")
				.replace(".", "")
				.replace("-", "")
				.toLowerCase();

		String reversedWord = new StringBuilder(formattedWord).reverse().toString();
		return reversedWord.equalsIgnoreCase(formattedWord);
	}
}
