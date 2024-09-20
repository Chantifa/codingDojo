package com.codingdojo;

public class FizzBuzz {

    private FizzBuzzService fizzBuzzService;

    // Constructor for dependency injection
    public FizzBuzz(FizzBuzzService fizzBuzzService) {
        this.fizzBuzzService = fizzBuzzService;
    }

    // Function to check if a number contains a digit (3 for Fizz, 5 for Buzz)
    public boolean containsDigit(int number, int digit) {
        return String.valueOf(number).contains(String.valueOf(digit));
    }

    // The core FizzBuzz logic
    public void playFizzBuzz(int start, int end) {
        for (int i = start; i <= end; i++) {
            boolean fizz = (i % 3 == 0) || containsDigit(i, 3);
            boolean buzz = (i % 5 == 0) || containsDigit(i, 5);

            if (fizz && buzz) {
                fizzBuzzService.print("FizzBuzz");
            } else if (fizz) {
                fizzBuzzService.print("Fizz");
            } else if (buzz) {
                fizzBuzzService.print("Buzz");
            } else {
                fizzBuzzService.print(String.valueOf(i));
            }
        }
    }
}
