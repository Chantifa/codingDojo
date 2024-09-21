// npm install --save-dev jest

// Function to return "Fizz" if divisible by 3
function getFizz(n) {
    return n % 3 === 0 ? "Fizz" : null;
}

// Function to return "Buzz" if divisible by 5
function getBuzz(n) {
    return n % 5 === 0 ? "Buzz" : null;
}

// Function to return "FizzBuzz" if divisible by both 3 and 5
function getFizzBuzz(n) {
    return n % 3 === 0 && n % 5 === 0 ? "FizzBuzz" : null;
}

// Function to return the number as a string if it's neither Fizz, Buzz, nor FizzBuzz
function getNumber(n) {
    return getFizz(n) || getBuzz(n) || getFizzBuzz(n) ? null : n.toString();
}

// Main FizzBuzz function
function fizzBuzz(start, end) {
    const result = [];

    for (let i = start; i <= end; i++) {
        let fizzBuzzResult = getFizzBuzz(i) || getFizz(i) || getBuzz(i) || getNumber(i);
        result.push(fizzBuzzResult);
    }

    return result;
}

module.exports = { fizzBuzz, getFizz, getBuzz, getFizzBuzz, getNumber };
