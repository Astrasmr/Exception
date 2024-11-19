public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String password) {
        super("Неверный пароль:" + password);
    }
    public WrongPasswordException (String password, String confirmPassword) {
        super("Пароль [%s] не совпадает с [%s]".formatted(password, confirmPassword));
    }
}

