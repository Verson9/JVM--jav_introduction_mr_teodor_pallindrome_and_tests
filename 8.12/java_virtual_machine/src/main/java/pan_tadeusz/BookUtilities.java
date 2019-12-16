package pan_tadeusz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class BookUtilities {
	Map < String, Integer> habenSieEineValue;
	List <String> listOfWords;
	String bookText;
	String bookAdress;
	long numberOfWordsThatUWantToDisplay;

	public void displayMostUsedWords(String bookAdress) throws FileNotFoundException {
		this.bookAdress = bookAdress;
		this.numberOfWordsThatUWantToDisplay = 5;
		checkBook();
		clearData();
		toMapOfWordsWithRepetitionsOfThem();
		displayMostRepeated();
	}

	public void displayMostUsedWords ( String bookAdress, long numberOfWordsThatUWantToDisplay ) throws FileNotFoundException {
		this.bookAdress                        = bookAdress;
		this.numberOfWordsThatUWantToDisplay = numberOfWordsThatUWantToDisplay;
		checkBook();
		clearData();
		toMapOfWordsWithRepetitionsOfThem();
		displayMostRepeated();
	}

	private void checkBook () throws FileNotFoundException {
		File file = new File (bookAdress);
		Scanner sc = new Scanner(file);

		ArrayList < String > lsitOfWords = new ArrayList <>();

		while( sc.hasNextLine() )
			lsitOfWords.add(sc.nextLine());

		bookText = lsitOfWords
				.stream()
				.collect(Collectors.joining(" "));

	}

	private void clearData (){
		String[] makeArrayOfWords
				= bookText
				.replace(",", "")
				.replace(".", "")
				.replace("?", "")
				.replace("-", "")
				.replace("<", "")
				.replace(">", "")
				.replace("…", "")
				.replace(":", "")
				.replace(";", "")
				.toLowerCase()
				.split(" ");

		listOfWords = Arrays.asList(makeArrayOfWords);
	}

	private void toMapOfWordsWithRepetitionsOfThem (){
		habenSieEineValue = new HashMap <>();

		for( String word:listOfWords) {
			if( word.length() <=3 )
				continue;
			if( !habenSieEineValue.containsKey(word) ) {
				habenSieEineValue.put(word, 1);
				continue;
			}
			Integer reps = habenSieEineValue.get(word);
			habenSieEineValue.replace(word, reps, reps+1);
		}
	}

	private void displayMostRepeated (){
		habenSieEineValue
				.entrySet()
				.stream()
				.sorted((v1, v2) -> v1.getValue().equals(v2.getValue()) ? 0 : v1.getValue() < v2.getValue() ? 1 : -1)
				.limit(numberOfWordsThatUWantToDisplay)
				.forEach(word -> System.out.println(word.getKey() + " powtórzony został " + word.getValue() + " razy."));
	}

}
