package homework.lesson10;

/*
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 5 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type 5 strings: ");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            list.add(input);
        }
        for (int i = 0; i < 5; i++) {
            String lastString = list.remove(list.size() -1);
            list.add(0, lastString);
            System.out.println(list);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
