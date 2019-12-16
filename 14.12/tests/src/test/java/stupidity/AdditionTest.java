package stupidity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

	@ParameterizedTest
	@MethodSource("generateData")
	@DisplayName("Should add with exception")
	void stupidAdd (int a,  String b, boolean c, int result) {
		Addition addition = new Addition();
		int addResult = addition.stupidAdd(a, b, c);

		assertEquals(result, addResult);
	}

	static Stream< Arguments > generateData() {
		return Stream.of(
				Arguments.of(0,"0", true, 0),
				Arguments.of(10, "20", true, 30),
				Arguments.of(1, "99", true, 100)
		);
	}

	@ParameterizedTest
	@CsvFileSource(resources = "resources/testdata.csv")
	void csvStupidAddTest(int a,  String b, boolean c, int result){
		System.out.println(a);
	}
}