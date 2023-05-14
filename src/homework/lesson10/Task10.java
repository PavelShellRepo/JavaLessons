package homework.lesson10;

/*
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
лира
лоза
роза
Выходные данные:
лира
лоза
лоза
*/

import java.util.ArrayList;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("лира");
        words.add("лоза");
        words.add("роза");

        fix(words);

        for (String word : words) {
            System.out.println(word);
        }
    }

    private static void fix(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (word.contains("р") && word.contains("л")) {
                continue;
            } else if (word.contains("р")) {
                words.remove(i);
                i--;
            } else if (word.contains("л")) {
                words.add(i, word);
                i++;
            }
        }
    }
}

