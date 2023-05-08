package homework.lesson4;

/* Вывести на экран квадрат 10х10 из букв P используя цикл while. */

public class Task6 {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            int j = 0;
            while (j < 10) {
                System.out.print("P ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
