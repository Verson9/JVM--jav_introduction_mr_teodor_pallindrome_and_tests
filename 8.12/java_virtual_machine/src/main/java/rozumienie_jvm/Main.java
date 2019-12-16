package rozumienie_jvm;

public class Main {
	public static void main ( String[] args ) {

		Animal burek = new Animal("burek");
		Animal pecio = new Animal("pecio");

		Person janusz = new Person(burek);
		Person krzys = new Person(pecio);


	}
}
