public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String login) {
        super("Неверный логин:" + login);
    }
}

