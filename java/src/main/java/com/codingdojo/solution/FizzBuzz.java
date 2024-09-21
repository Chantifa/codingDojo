package com.codingdojo.solution;

import javax.print.PrintService;

public class FizzBuzz {

    public FizzBuzz() {
    }

    public void playFizzBuzz(int start, int end) {
        for (int i = start; i <= end; i++) {
            String result = getFizzBuzzValue(i);
            System.out.println(result);
        }
    }

    public String getFizzBuzzValue(int i) {
        boolean fizz = isFizz(i);
        boolean buzz = isBuzz(i);

        if (fizz && buzz) {
            return "FizzBuzz";
        } else if (fizz) {
            return "Fizz";
        } else if (buzz) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }

    private boolean isFizz(int i) {
        return (i % 3 == 0) || containsDigit(i, 3);
    }

    private boolean isBuzz(int i) {
        return (i % 5 == 0) || containsDigit(i, 5);
    }

    private boolean containsDigit(int number, int digit) {
        return String.valueOf(number).contains(String.valueOf(digit));
    }
}
