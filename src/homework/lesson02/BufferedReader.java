package test.lesson02;

/*
Ввести с клавиатуры число n. Вывести на экран надпись «Я зарабатываю $n в час».
Пример: Я буду зарабатывать $50 в час
*/

/*
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись: «Имя» будет получать «число1» через «число2» лет.
Пример: Alex будет получать 4000 через 5 лет.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String amount = reader.readLine();
        String year = reader.readLine();

        System.out.println(name + " будет получать " + amount + " через " + year + " лет.");
    }
}
