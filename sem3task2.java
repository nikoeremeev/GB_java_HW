// Задание 2.
// Написать метод, который проверяет валидность логина и пароля
// (где нибудь в переменных сохраните) и при помощи конструкции try-catch
// рекурсивно принимайте данные (нужно ограничить колиичество попыток до 6
// и после 3 попытки должно быть сообщение, мол вы привысили количество попыток,
// немного пододождите тут можете поток заслипить на некоторое время.
// А когда попытки кончатся - выйти)


import java.util.Scanner;

public class sem3task2 {
    public static void main(String[] args) throws InterruptedException {
        int countAttempt = 6;
        checkData(countAttempt);

    }

    // функция ввода и проверки вводимых данных
    public static String[] checkData(int count) throws InterruptedException {
        String[] array = new String[2];
        if (0 < count) {
            if (count == 3) {
                System.out.println("\nПревысили количество попыток!\n Ввод временно заблокирован!\n");
                Thread.sleep(20000);
            }
            try (Scanner in = new Scanner(System.in)) {
                System.out.println("\n\nУ Вас осталось " + count + " попыток.");
                System.out.print("Введите логин : ");
                String userLogin = in.nextLine();
                System.out.print("Введите пароль : ");
                String userPassword = in.nextLine();

                while (!validation_Data(userLogin, userPassword)) { // функция проверки валидности логина и пароля
                    System.out.println("Неверно! Попробуйте еще раз!");
                    return checkData(count - 1); // рекурсивный вызов самой себя с уменьшением количества попыток
                }
                System.out.println("Отлично! Валидация пройдена!\n\n");
                array[0] = userLogin;
                array[1] = userPassword;
            }
        } else {
            System.out.println("Превышеномаксимальное количество попыток.\n Ввод заблокирован!\n");
            array[0] = "";
            array[1] = "";
        }

        return array;
    }

    // проверяет валидность логина/пароля
    public static boolean validation_Data(String LOGIN_Arg, String PASSWORD_Arg) {
        boolean result = false;
        try {
            if (LOGIN_Arg != null & PASSWORD_Arg != null) {

                String Login_PATTERN = "^[a-zA-zа-яА-я][a-zA-zа-яА-я0-9]{2,}$";;
                String Password_PATTERN = "^[a-zA-zа-яА-я][a-zA-zа-яА-я0-9]{2,}$";;

                result = LOGIN_Arg.matches(Login_PATTERN) & PASSWORD_Arg.matches(Password_PATTERN);
            }

        } catch (Exception ex) {
            result = false;
        }

        return result;
    }
}