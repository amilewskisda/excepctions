package definedExcepctions;

public class Animal {
    private long id;
    private String species;
    private String name;

    public Animal(long id, String species, String name) {
        this.id = id;
        this.species = species;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", species='" + species + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
