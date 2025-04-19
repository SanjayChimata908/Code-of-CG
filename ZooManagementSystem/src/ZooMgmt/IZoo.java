package ZooMgmt;

import java.util.List;
import java.util.Map;

public interface IZoo {

	public void addAnimal(IAnimal animal);
	public void removeAnimal(int id);
	public int countAnimals();
	public List<IAnimal> getAnimalsBySpecies(String species);
	public Map<Integer, List<IAnimal>> getAnimalsByAge();
}
