package definedExcepctions;

public class Zoo {
    private Animal[] animals;
    private int animalsNumber;

    public Zoo(int animalsNumber) {
        animals = new Animal[animalsNumber];
        this.animalsNumber = 0;
    }

    public void add(Animal a) throws NoMoreSpaceForAnimalsException {
        if (animalsNumber >= animals.length) {
            throw new NoMoreSpaceForAnimalsException("Brak miejsca w Zoo. Masymalna ilość to: " + animals.length);
        } else {
            animals[animalsNumber] = a;
            animalsNumber++;
        }
    }

    public Animal find(String species, String name) throws NoAnimalFoundException {
        boolean found = false;
        Animal foundedAnimal = null;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getSpecies().equals(species) && animals[i].getName().equals(name)) {
                foundedAnimal = animals[i];
                break;
            }
        }

        if (foundedAnimal == null) {
            throw new NoAnimalFoundException("Nie znaleziono zwierzęcia " + species + " " + name);
        }
        return foundedAnimal;
    }
}