package com.loveable.LambdaExpression;

public class LambdaExpression {
        public static void main(String[] args) {
        Cab cab = () -> System.out.println("You booked a cab");
        cab.bookCab();
    }
}