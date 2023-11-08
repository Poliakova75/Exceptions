package exceptions;

public class Main {
    public static void main(String[] args) {
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";

        Validate.validateLoginAndPassword(login, password, confirmPassword);
        System.out.println("Валидация прошла успешно");


    }
}