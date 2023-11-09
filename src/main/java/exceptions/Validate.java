package exceptions;

public class Validate {
    protected static void validateLoginAndPassword(String login, String password, String confirmPassword) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

        try {
            if (login.length() > 20 || containsOnlyAllowedChars(login, allowedChars)) {
                throw new WrongLoginException("Длина логина превышает максимум");
            }

            if (password.length() > 20 || containsOnlyAllowedChars(password, allowedChars)) {
                throw new WrongPasswordException("Длина пароля привышает максимум");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
    private static boolean containsOnlyAllowedChars(String input, String allowedChars) {
        for (char c : input.toCharArray()) {
            if (allowedChars.indexOf(c) == -1) {
                return true;
            }
        }
        return false;
    }
}



