package homework.lesson3;

/* Реализовать метод compare(int a). Метод должен выводить строку на экран "Число меньше 5",
если параметр метода меньше 5 - и, выводить строку "Число больше 5", если параметр метода больше 5 - и,
и выводить строку "Число равно 5", если параметр метода равен 5 - и. */


public class Task4 {
    public static void main(String[] args) {
        compare(5);
    }
        public static void compare(int a){
            if (a < 5) {
                System.out.println("Less than 5");
            } else if (a > 5) {
                System.out.println("More than 5");
            } else if (a == 5) {
                System.out.println("Equal 5");
            }
        }
    }