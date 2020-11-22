package com.example.emailScheduler.Epam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name +","+ age;
    }
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                        new Person("Max", 18),
                        new Person("Peter", 23),
                        new Person("Pamela", 23),
                        new Person("David", 12));

        List<Person> filtered =
                persons
                        .stream()
                        .filter(p -> p.name.startsWith("P"))
                        .collect(Collectors.toList());

        System.out.println(filtered);    // [Peter, Pamela]

        Map<Integer, List<Person>> personsByAge =
                persons
                .stream()
                .collect(Collectors.groupingBy(p -> p.age));
//
//        System.out.println(personsByAge);
//
//
        personsByAge
                .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
        double num = 66.5;
        int numInt = (int)Math.round(num);
        System.out.println(numInt);
    }

}


