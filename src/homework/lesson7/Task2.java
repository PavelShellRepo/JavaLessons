package homework.lesson7;

/*
В методе initializeArray():
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.

В методе printArray():
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
Каждый элемент - с новой строки.
*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String[] strings = initializeArray();
        printArray(strings);
    }
    public static String[] initializeArray() {
        String[] array = new String[10];
        System.out.println("Type 10 strings: ");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < (array.length - 2); i++) {
            array[i] = scanner.nextLine();
        }
        return array;
    }
    public static void printArray(String[] strings) {
        for (int i = strings.length -1; i >= 0 ; i--) {
            System.out.println(strings[i]);
        }
    }
}
