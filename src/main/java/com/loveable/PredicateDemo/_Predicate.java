package com.loveable.PredicateDemo;

public class _Predicate {
    public static void main(String[] args) {
        Cab cab = () -> System.out.println("You booked a cab");
        cab.bookCab();
    }
}
