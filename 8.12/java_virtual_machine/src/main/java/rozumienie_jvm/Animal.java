package rozumienie_jvm;

public class Animal {
	private String name;
	String toy;

	public String getName () {
		return name;
	}

	public void setName ( String name ) {
		this.name = name;
	}

	public String getToy () {
		return toy;
	}

	public void changeToy ( String changedToy ) {
		this.toy = changedToy;
	}

	Animal ( String name ) {
		this.name = name;
	}
	Animal ( Animal animalToClone){
		this.name = animalToClone.name;
	}
}
