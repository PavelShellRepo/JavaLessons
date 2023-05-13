package homework.lesson10;

/*
Создать список чисел и заполнить его с консоли.
Разбить список на два других: - в первый список сохранять чётные числа - во второй список сохранять нечётные числа.
Вывести содержимое всех списков в консоль. Каждый новый список выводить с новой строки, в ряд.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числа через пробел: ");
        String input = scanner.nextLine();
        for (String s : input.split(" ")){
        numbers.add(Integer.parseInt(s));
        }
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        for(int number: numbers){
            if (number % 2 == 0){
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }
        System.out.println("Список четных чисел:");
        for (int number : evenNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Список нечетных чисел:");
        for (int number : oddNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

/*
Создать пустой список целых чисел (List<Integer>).
Создать объект класса Scanner для считывания данных с консоли.
Считать данные с консоли с помощью метода nextLine() объекта Scanner и добавить их в список с помощью метода add().
Создать два пустых списка целых чисел (List<Integer>) для четных и нечетных чисел.
Пройти по всем элементам списка, используя цикл for-each.
Для каждого элемента проверить, является ли он четным или нечетным с помощью оператора %.
Если элемент четный, добавить его в список четных чисел, иначе - в список нечетных чисел.
Используя цикл for-each, вывести содержимое списка четных чисел в консоль.
Напечатать пустую строку для разделения списков.
Используя цикл for-each, вывести содержимое списка нечетных чисел в консоль.
*/