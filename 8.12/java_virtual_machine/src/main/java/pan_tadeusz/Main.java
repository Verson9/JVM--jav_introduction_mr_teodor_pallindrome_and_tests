package pan_tadeusz;

import java.io.FileNotFoundException;

public class Main {
	public static void main ( String[] args ) throws FileNotFoundException {
		BookUtilities bookUtilities = new BookUtilities();
		bookUtilities.displayMostUsedWords("pan-tadeusz.txt", 7);
	}
}
