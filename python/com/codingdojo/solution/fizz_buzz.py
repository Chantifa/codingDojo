from io import StringIO
import sys

# The FizzBuzz function
def fizz_buzz(start, end):
    def get_fizz_buzz_value(n):
        if n % 3 == 0 and n % 5 == 0:
            return "FizzBuzz"
        elif n % 3 == 0:
            return "Fizz"
        elif n % 5 == 0:
            return "Buzz"
        else:
            return str(n)

    for i in range(start, end + 1):
        print(get_fizz_buzz_value(i))

# Helper function to capture output
def capture_output(start, end):
    captured_output = StringIO()
    sys.stdout = captured_output
    fizz_buzz(start, end)
    sys.stdout = sys.__stdout__
    return captured_output.getvalue()