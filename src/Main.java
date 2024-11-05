public class Main {
    private final static String VALIDATION_REGEX = "[a-z0-9_]{1,20}";

    public static void main(String[] args) {
        try {
            auth("111", "login", "111.");
        } catch (WrongLoginException e) {
            System.err.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Проверка завершена");
        }
    }

    private static void auth(String password,
                             String login,
                             String confirmPassword) {

        if (!login.matches(VALIDATION_REGEX)) {
            throw new WrongLoginException(login);
        }
        if (!password.matches(VALIDATION_REGEX)) {
            throw new WrongPasswordException(password);
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(password, confirmPassword);
        }
    }
}