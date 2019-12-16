package palindrome;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeParamTest {


	@BeforeEach
	void setUp () {
	}

	@AfterEach
	void tearDown () {
	}

	@ParameterizedTest(name = "No. #{index} badanie argumentu {arguments}")
	@ValueSource(strings = {"ala", "kajak", "pętaka pętaj a tępaka tęp"})
	void isPalindrome (String word) {

		assertTrue(Palindrome.isPalindrome(word));
	}

	@ParameterizedTest
	@MethodSource("createTestDataFromFile")
	void shouldNotBePlaindrome(String word){
		boolean palindrome = Palindrome.isPalindrome(word);
		assertFalse(palindrome);
	}

	static Stream<String> createTestDataFromFile() throws FileNotFoundException {
//		tutaj można wszystko

		Scanner sc = new Scanner(new File("C:\\Users\\ACER\\Desktop\\Kurs Java\\JavaVirtualMachine\\14.12\\tests\\target\\testdata.txt"));

		List <String> strings = new ArrayList<>();

		while( sc.hasNextLine() ){
			strings.add(sc.nextLine());
		}


		return strings.stream();
	}
}