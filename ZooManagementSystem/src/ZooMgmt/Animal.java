package ZooMgmt;

public class Animal implements IAnimal{

	private int id;
	private String species;
	private String name;
	private int age;
	public Animal(int id, String species, String name, int age) {
		super();
		this.id = id;
		this.species = species;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getSpecies() {
		return species;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
