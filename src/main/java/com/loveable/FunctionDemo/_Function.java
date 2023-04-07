package com.loveable.FunctionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;

        System.out.println(square.apply(5));
        System.out.println(square.apply(-5));

        Function<Integer, String> word = String::valueOf;

        System.out.println(word.apply(90));

        Function<String, Integer> len = String::length;

        System.out.println(len.apply("Loveable"));

        List<Person> people = new ArrayList<>();

        people.add(new Person("Mike", 24));
        people.add(new Person("Smith", 29));
        people.add(new Person("Musk", 42));
        people.add(new Person("Carl", 2));

//        Using Function with Objects and Joining Predicates (using andThen & compose)

        Function<Person, Integer> level = person -> {
            if (person.age() <= 5)
                return 0;
            else if (person.age() <= 25)
                return 1;
            else
                return 2;
        };

        Function<Person, Integer> doubleAge = person -> (person.age() * 2);

        System.out.println(doubleAge.apply(new Person("Smith", 29)));

        for (Person p : people) {
            System.out.println(level.apply(p));
        }

        Integer musk = level.andThen(square).apply(new Person("Musk", 42));
        System.out.println(musk);
        String jointFunction2 = word.compose(square).apply(musk);
        System.out.println(jointFunction2);
    }
}

record Person(String name, Integer age) {
}
