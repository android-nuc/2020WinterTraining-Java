package code3_5;

import code3_6.Apple;

public class Main {
    public static void main(String[] args) {
        Father father = new Father();
        father.eat();
        System.out.println();

        Son son  = new Son();
        son.eat();

        System.out.println();

        Apple apple1 = new Apple();
        apple1.setColor("red");
        System.out.println(apple1.getColor());

        Apple apple2 = new Apple();
        apple2.setColor("yellow");
        System.out.println(apple2.getColor());
        // 对比
        System.out.println(apple1.getColor());

    }
}
