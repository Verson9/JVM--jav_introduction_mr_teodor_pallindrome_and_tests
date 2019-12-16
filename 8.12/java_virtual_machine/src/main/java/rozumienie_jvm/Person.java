package rozumienie_jvm;

class Person {

	private Animal animal;
	private String name;

	public Person ( String name ) {
		this.name = name;
	}

	Person ( Animal animal ) {
		this.animal = animal;
	}

	Person(Person personToClone){
		this.animal = personToClone.animal;
	}

	public void setName ( String name ) {
		this.name = name;
	}

	public Animal getAnimal () {
		return animal;
	}
}
