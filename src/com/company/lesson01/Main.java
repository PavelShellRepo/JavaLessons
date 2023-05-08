package com.company.lesson01;

/*
1) Создать метод sum, который должен суммировать 2 числа.
2) Создать метод multy, который должен умножить 2 числа.
3) Создать метод subt, который должен вычесть второе число из первого.
4) Создать метод div, который должен делить 2 числа.
*/
/*
1) Создать метод convert, который должен конвертировать евро в доллары. В метод должен приходить один аргумент (к-во евро). Метод должен возвращать к-во долларов.
2) Создать метод percent, который принимает один аргумент (число) и возвращает это же число + 10% от него.
3) Создать метод print, который принимает один аргумент (строку) и выводит эту строку 4 раза в консоль.
*/

public class Main {
    public static void main(String[] args) {
        print("shell");

    }

    private static int sum (int a, int b){
       return a+b;
    }

    private static int multy (int a, int b){
        return a*b;
    }

    private static int subt (int a,int b){
        return a-b;
    }
    private static int div (int a,int b) {
        return a/b;
    }

    private static double convert (int euro){
       return euro * 1.10D;
    }

    private static double percent(double num){
        return num + 0.1 * num;
    }

    private static String print (String str){
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        return str;
    }

}