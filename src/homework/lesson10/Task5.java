package homework.lesson10;

/*
Создать список чисел и заполнить его с консоли.
Удалить все числа больше 5.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа (для окончания ввода введите пустую строку):");
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                integerList.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод, попробуйте снова.");
            }
        }
        scanner.close();
        integerList.removeIf(number -> number > 5);
        System.out.println("Список чисел, не превышающих 5: " + integerList.toString());

    }
}

/*
Создать пустой список чисел типа List<Integer>.
Считывать числа с консоли с помощью класса Scanner и добавлять их в список до тех пор, пока не будет введена пустая строка.
Добавить механизм обработки исключений.
Создать цикл для прохода по элементам списка.
Проверять каждый элемент списка на условие "больше 5" с помощью оператора if.
Если элемент больше 5, то удаляем его из списка с помощью метода remove().
Если элемент меньше или равен 5, то переходим к следующему элементу.
Выводим список чисел на экран с помощью цикла for-each или метода toString().
*/
