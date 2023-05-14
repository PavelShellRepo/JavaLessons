package homework.lesson10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("text1");
        list.add("text2");
        list.add("text3");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
