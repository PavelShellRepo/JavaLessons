package homework.lesson3;

/* Реализовать метод checkInterval. Метод должен проверять попало ли целое число в интервал от 20 до 50 и сообщить результат на экран в следующем виде:
 "Число а не содержится в интервале." или "Число а содержится в интервале.", где а - аргумент метода. */

public class Task6 {
    public static void main(String[] args) {
        checkInterval(55);

    }
    public static void checkInterval (int a) {
        if (a >= 20 && a <= 50) {
            System.out.println("Число а содержится в интервале.");
        } else {
            System.out.println("Число а NE содержится в интервале.");
        }
    }
}
