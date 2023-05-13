    package homework.lesson10;

    /*
    1. Создай список строк.
    2. Добавь в него 5 различных строчек с консоли.
    3. Выведи его размер на экран.
    4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
    */

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class Task2 {
        public static void main(String[] args) {
            List<String> stringList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 5; i++) {
              System.out.print("Type string: ");
              String inputString;
              inputString = scanner.next();
              stringList.add(inputString);
            }
            System.out.println(" ");
            System.out.println("List size: ");
            System.out.println(stringList.size());
            System.out.println(" ");

            System.out.println("List of all strings: ");
            for (String str : stringList){
                System.out.println(" {} " + str + " {} ");
            }
        }
    }
