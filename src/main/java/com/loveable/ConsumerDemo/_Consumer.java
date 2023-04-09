package com.loveable.ConsumerDemo;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Consumer<Integer> consume = System.out::println;

        Consumer<String> c = str -> System.out.println(str.toUpperCase());

        consume.accept(808);

        c.accept("loveable");
    }
}

record Person(String name, Integer age) {
}