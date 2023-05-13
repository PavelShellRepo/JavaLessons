package homework.lesson9;

import homework.lesson9.example.Example1;
import homework.lesson9.model.User;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Object> list4 = new ArrayList<>();
        System.out.println("/___________________________________/");

        Example1<User> example1 = new Example1<>();
        example1.setInstance(new User("Pavel", 30));
        System.out.println(example1.getInstance());
        System.out.println("/___________________________________/");
    }
}
