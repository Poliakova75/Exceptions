package exceptions;

public class Validate {
    protected static void validateLoginAndPassword(String login, String password, String confirmPassword) {


    }

    private static boolean ValidUsername(String username) {
        if (username.length() < 6 || username.length() > 20) {
            return false;
        }
        if (!username.matches("[A-Za-z0-9_]+")) {
            return false;
        }

        return Character.isLetterOrDigit(username.charAt(0));
    }
    public static boolean ValidPassword(String password) {
        if (password.length() < 8 || password.length() > 20) {
            return false;
        }

        if (!password.matches("[A-Za-z0-9 ]+")) {
            return false;
        }

        boolean hasLetter = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        return hasLetter && hasDigit;
    }
}




