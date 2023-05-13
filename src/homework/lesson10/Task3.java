package homework.lesson10;

/*
Создать список из целых чисел и заполнить его с консоли
Ввод целых чисел с клавиатуры продолжается, пока не ввели пустую строку в консоли
После того, как ввод завершён - вывести все элементы списка в консоль
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      Scanner scanner = new Scanner(System.in);

        System.out.println("Type number: ");
        while (true) {
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            int number = Integer.parseInt(input);
            list.add(number);

        }
        System.out.println("List of all numbers: ");
        for (int number : list){
            System.out.println(" {} " + number + " {} ");
        }

      scanner.close();
    }
}

/*
Создать список типа Integer.
Создать объект типа Scanner для считывания ввода с консоли.
Создать цикл, который будет запрашивать ввод целых чисел с клавиатуры и добавлять их в список до тех пор, пока не будет введена пустая строка.
Вывести все элементы списка в консоль.
Закрыть объект типа Scanner.
*/