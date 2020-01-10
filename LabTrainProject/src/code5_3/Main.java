package code5_3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static void printNumber(List<? super Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Double> list3 = new ArrayList<>();
        List<Float> list4 = new ArrayList<>();
        list1.add("123");
        list1.add("222");

        list2.add(1);
        list2.add(2);
        list2.add(3);

        list3.add(1.1);
        list3.add(1.2);
        list3.add(1.4);

        list4.add(1.1f);
        list4.add(2.1f);
        list4.add(3.1f);


    }
}
