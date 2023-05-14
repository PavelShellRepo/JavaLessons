package homework.lesson10;

/*
Введи с клавиатуры 5 слов в список строк.
Удали 3 - й элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        System.out.println("Type 5 words: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
           list.add(scanner.nextLine());
        }
        list.remove(2);
        Collections.reverse(list);

        for (String s : list) {
            System.out.println(s);
        }
    }
}