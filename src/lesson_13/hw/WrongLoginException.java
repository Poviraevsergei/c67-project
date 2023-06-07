package lesson_13.hw;

public class WrongLoginException extends Exception {
    private String info;

    public WrongLoginException() {
    }

    public WrongLoginException(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "info='" + info + '\'' +
                '}';
    }
}
