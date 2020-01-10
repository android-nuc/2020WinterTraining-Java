package code6_1;

import code3_1.Shape;

import java.util.*;

abstract class ArrayList2 implements Collection {
    private Object[] object = new Object[10];
    private int index = 0;

    public void copy() {
        object = Arrays.copyOf(object, 10 * 2);
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public boolean add(Object o) {
        object[index] = o;
        index++;
        return false;
    }

    @Override
    public boolean remove(Object o) {
        // 很长代码
        return false;
    }

    @Override
    public void clear() {
        index = 0;
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("num_" + i);
        }
        list.add(1, "new element");
        System.out.println(list.get(1));
        System.out.println(list.get(2));
//        list.clear();

        System.out.println();
//        for (int i = 0; i < list.size(); i++) {
//            if (i == 2)
//                list.remove(i);
//
//            System.out.println(i);
//            System.out.println(list.get(i));
//        }
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            it.remove();
        }

        List<String> list2 = new LinkedList<>();



    }
}
