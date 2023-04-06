package com.loveable.LambdaExpression;

public class LambdaExpression {
    public static void main(String[] args) {

        System.out.println("************Cab************");
        Cab cab = () -> System.out.println("You booked a cab");
        cab.bookCab();

        System.out.println("************Taxi************");
        Taxi taxi = (pickup, destination) -> {
            System.out.println("Your ride is from " + pickup + " to " + destination);
            return "Price = 5000";
        };
        String trip = taxi.taxi("New York", "Dubai");
        System.out.println(trip);
    }
}