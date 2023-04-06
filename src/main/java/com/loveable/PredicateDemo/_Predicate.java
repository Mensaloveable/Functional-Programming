package com.loveable.PredicateDemo;

import javax.print.attribute.standard.PresentationDirection;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] love) {
        Predicate<Integer> isEven = x -> (x % 2 == 0);
        Predicate<String> isLong = str -> str.length() > 10;

        int[] ints = {276, 381, 320, 121, 888};
        for (int num : ints) {
            System.out.println(isEven.test(num));

            if(isEven.test(num)){
                System.out.println(num);
            }
        }

        String word = "145dc83e-def7-4d7c-9d43-a162e75382bf";
        String word1 = "a162e75382bf";
        System.out.println("For String \n"+isLong.test(word));
        System.out.println(isLong.test(word1));

        Person todd = new Person("Todd", 25, 8);
        Person ford = new Person("Ford", 29, 21);
        Person baby = new Person("Face", 9, 0);

        Predicate<Person> isAdult  = p -> (p.getAge() >= 18);
        Predicate<Person> isQualified = p -> (p.getAge() > 20 && p.getExperience() > 10);

//        Using Predicate with Objects and Joining Predicates (using and, or, negate)

        boolean testFord = isQualified.and(isAdult).test(ford);
        boolean isBaby = isAdult.negate().test(baby);
        boolean testTodd = isQualified.and(isAdult).test(todd);

        System.out.println(testFord + "\n" + isBaby + "\n" + testTodd);

    }
}

class Person{
    private String name;
    private Integer age;
    private Integer experience;

    public Person(String name, Integer age, Integer experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }
}