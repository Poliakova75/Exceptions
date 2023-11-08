package exceptions;

public class Validate {


    private static String login;
    private static String password;
    private static String confirmPassword;

    protected static void validateLoginAndPassword(String login, String password, String confirmPassword) {
        Validate.login = login;
        Validate.password = password;
        Validate.confirmPassword = confirmPassword;
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

    public static String getLogin() {
        return login;
    }

    public static String getPassword() {
        return password;
    }

    public static String getConfirmPassword() {
        return confirmPassword;
    }
}



