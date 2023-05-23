package pl.coderslab.oop.advanced;

public class NotValidPriceException extends Exception {
    public NotValidPriceException() {
    }

    public NotValidPriceException(String message) {
        super(message);
    }
}
