package definedExcepctions;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(3);
        try {
            zoo.add(new Animal(1, "Hipopotam", "Hipcio"));
            zoo.add(new Animal(2, "Kotek", "Miauczek"));
            zoo.add(new Animal(3, "Leniwiec", "Leń"));
            zoo.add(new Animal(4, "Zebra", "Pasiak"));
        } catch (NoMoreSpaceForAnimalsException e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println(zoo.find("Hipopotam", "Hipcio"));
            System.out.println(zoo.find("Lis", "Chytrusek"));
        } catch (NoAnimalFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
