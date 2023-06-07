package lesson_13.hw;

public class WrongPasswordException extends Exception {
    private String info;

    public WrongPasswordException() {
    }

    public WrongPasswordException(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "WrongPasswordException{" +
                "info='" + info + '\'' +
                '}';
    }
}
