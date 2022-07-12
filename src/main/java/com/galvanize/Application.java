package com.galvanize;

public class Application {
    static String fizzBuzz(int x) {
        if (x % 3 == 0 && x % 5 != 0) {
            return "Fizz";
        } else if (x % 5 == 0 && x % 3 != 0) {
            return "Buzz";
        } else if (x % 3 == 0 && x % 5 == 0) {
            return "FizzBuzz";
        } else {
            return String.valueOf(x);
        }
    }
    public static void main(String[] args) {
        System.out.println(fizzBuzz(Integer.parseInt(args[0])));
    }

}
