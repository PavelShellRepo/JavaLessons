package homework.lesson10;

/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type 5 strings: ");
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        String longestString = "";
        for (String str : list){
            if (str.length() > longestString.length()){
                longestString = str;
            }
        }
        System.out.println("Longest string is: " + longestString);
    }
}
