from io import StringIO
import sys

# The FizzBuzz functions
def is_fizz(n):
    return n % 3 == 0 or '3' in str(n)

def is_buzz(n):
    return n % 5 == 0 or '5' in str(n)

# The FizzBuzz function
def get_fizz_buzz_value(n):
    if is_fizz(n) and is_buzz(n):
        return "FizzBuzz"
    elif is_fizz(n):
        return "Fizz"
    elif is_buzz(n):
        return "Buzz"
    else:
        return str(n)

def fizz_buzz(start, end):
    for i in range(start, end + 1):
        print(get_fizz_buzz_value(i))

def capture_output(start, end):
    captured_output = StringIO()
    sys.stdout = captured_output
    fizz_buzz(start, end)
    sys.stdout = sys.__stdout__
    return captured_output.getvalue()

