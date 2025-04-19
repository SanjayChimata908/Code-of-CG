package ZooMgmt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo implements IZoo {
   
	private List<IAnimal> animals;

	public Zoo() {
		super();
		animals = new ArrayList<>();
	}

	public List<IAnimal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<IAnimal> animals) {
		this.animals = animals;
	}

	 @Override
	    public void addAnimal(IAnimal animal) {
	        animals.add(animal);
	    }

	    @Override
	    public void removeAnimal(int id) {
	        animals.removeIf(animal -> animal.getId() == id);
	    }

	    @Override
	    public int countAnimals() {
	        return animals.size();
	    }

	    @Override
	    public List<IAnimal> getAnimalsBySpecies(String species) {
	        List<IAnimal> result = new ArrayList<>();
	        for (IAnimal animal : animals) {
	            if (animal.getSpecies().equalsIgnoreCase(species)) {
	                result.add(animal);
	            }
	        }
	        return result;
	    }

	    @Override
	    public Map<Integer, List<IAnimal>> getAnimalsByAge() {
	        Map<Integer, List<IAnimal>> ageMap = new HashMap<>();
	        for (IAnimal animal : animals) {
	            ageMap.putIfAbsent(animal.getAge(), new ArrayList<>());
	            ageMap.get(animal.getAge()).add(animal);
	        }
	        return ageMap;
	    }

}
