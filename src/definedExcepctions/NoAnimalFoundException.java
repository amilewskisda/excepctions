package definedExcepctions;

public class NoAnimalFoundException extends Exception {
    public NoAnimalFoundException(String message) {
        super(message);
    }
}