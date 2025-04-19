package ZooMgmt;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		 // Create Zoo instance
        Zoo zoo = new Zoo();

        // Add animals
        Animal tiger = new Animal(1, "Mammals", "Tiger", 6);
        Animal whale = new Animal(2, "Mammals", "Whale", 8);

        zoo.addAnimal(tiger);
        zoo.addAnimal(whale);

        // Count animals
        System.out.println("There are " + zoo.countAnimals() + " animals in the zoo.");

        // List animals by species
        System.out.println("Mammals:");
        for (IAnimal animal : zoo.getAnimalsBySpecies("Mammals")) {
            System.out.println("  " + animal.getName() + " (" + animal.getAge() + " years old)");
        }

        // Group animals by age
        System.out.println("\nAnimals grouped by age:");
        for (Map.Entry<Integer, List<IAnimal>> entry : zoo.getAnimalsByAge().entrySet()) {
            System.out.println(entry.getKey() + " year(s) old:");
            for (IAnimal animal : entry.getValue()) {
                System.out.println("  - " + animal);
            }
        }

        // Remove an animal and recount
        zoo.removeAnimal(1);
        System.out.println("\nAfter removing an animal, there are " + zoo.countAnimals() + " animal(s) in the zoo.");
    }

}
