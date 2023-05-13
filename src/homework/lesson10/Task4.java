package homework.lesson10;

/*
Создать список чисел и заполнить его с консоли следующим образом: чётные числа добавляют в конец списка, нечётные — в начало.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите число или пустую строку для завершения ввода: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            int number = Integer.parseInt(input);

            if (number % 2 == 0) {
                numbers.add(number);
            } else {
                numbers.add(0, number);
            }
        }
        System.out.println(numbers);
    }
}

/*
Создать пустой список чисел.
Начать цикл ввода с консоли и принять число с помощью Scanner.
Проверить, что введенная строка не пустая. Если пустая, то выйти из цикла.
Преобразовать введенную строку в число с помощью Integer.parseInt().
Проверить, является ли число четным.
После окончания цикла вывести содержимое списка на консоль.
 */