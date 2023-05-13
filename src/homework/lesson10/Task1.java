package homework.lesson10;

/*
Создать список из чисел и заполнить его на 5 элементов с консоли.
Вывести все элементы списка в консоль.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Type number: ");
            int num = scanner.nextInt();
            list.add(num);
        }

        System.out.println("List of all numbers: ");
        for (Integer num : list){
            System.out.println(" {} " + num + " {} ");
        }
    }
}
