package exceptions;

public class UserRegistration {
    public static void main(String[] args){
            try {
                registerUser("java_skyro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
            } catch (WrongPasswordException | WrongLoginException e) {
                System.out.println("Неверный пароль: " + e.getMessage());
            }
    }


    public static void registerUser (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
            try {
                if (login.length() > 20 || !login.matches("[A-Za-z0-9_]+")) {
                    throw new WrongLoginException("Неверный логин");
                }

                if (password.length() > 20 || !password.matches("[A-Za-z0-9 _]+")) {
                    throw new WrongPasswordException("Неверный пароль");
                }

                if (!password.equals(confirmPassword)) {
                    throw new WrongPasswordException("Пароли не совпадают");
                }
            }
            catch (WrongLoginException | WrongPasswordException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
    }
}