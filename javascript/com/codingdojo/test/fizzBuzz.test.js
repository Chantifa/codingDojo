const { fizzBuzz, getFizz, getBuzz, getFizzBuzz, getNumber } = require('../code/fizz_buzz');
//const { fizzBuzz, getFizz, getBuzz, getFizzBuzz, getNumber } = require('../solution/fizz_buzz');

// Test for Fizz
test('getFizz: returns "Fizz" for multiples of 3', () => {
    expect(getFizz(3)).toBe("Fizz");
    expect(getFizz(6)).toBe("Fizz");
    expect(getFizz(9)).toBe("Fizz");
    expect(getFizz(4)).toBe(null); // Non-multiple of 3 should return null
});

// Test for Buzz
test('getBuzz: returns "Buzz" for multiples of 5', () => {
    expect(getBuzz(5)).toBe("Buzz");
    expect(getBuzz(10)).toBe("Buzz");
    expect(getBuzz(20)).toBe("Buzz");
    expect(getBuzz(4)).toBe(null); // Non-multiple of 5 should return null
});

// npx jest fizzBuzz.test.js

// Test for FizzBuzz
test('getFizzBuzz: returns "FizzBuzz" for multiples of 3 and 5', () => {
    expect(getFizzBuzz(15)).toBe("FizzBuzz");
    expect(getFizzBuzz(30)).toBe("FizzBuzz");
    expect(getFizzBuzz(45)).toBe("FizzBuzz");
    expect(getFizzBuzz(9)).toBe(null);  // Multiple of 3 but not 5 should return null
    expect(getFizzBuzz(10)).toBe(null); // Multiple of 5 but not 3 should return null
});

// Test for number conversion
test('getNumber: returns the number as a string when not divisible by 3 or 5', () => {
    expect(getNumber(1)).toBe("1");
    expect(getNumber(2)).toBe("2");
    expect(getNumber(4)).toBe("4");
    expect(getNumber(7)).toBe("7");
    expect(getNumber(15)).toBe(null);  // FizzBuzz case should return null
});

// Test for FizzBuzz function
test('fizzBuzz: returns correct FizzBuzz values from 1 to 20', () => {
    const result = fizzBuzz(1, 20);
    const expectedOutput = [
        "1", "2", "Fizz", "4", "Buzz",
        "Fizz", "7", "8", "Fizz", "Buzz",
        "11", "Fizz", "13", "14", "FizzBuzz",
        "16", "17", "Fizz", "19", "Buzz"
    ];
    expect(result).toEqual(expectedOutput);
});
