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

# Test for FizzBuzz
def test_fizz_buzz():
    output = capture_output(1, 20)
    assert "FizzBuzz" in output
    assert output.splitlines()[14] == "FizzBuzz"  # 15 is FizzBuzz
    print("test_fizz_buzz passed")

# Test for Fizz
def test_fizz():
    output = capture_output(1, 20)
    fizz_indexes = [2, 5, 8, 11, 17]  # 3, 6, 9, 12, 18 are Fizz
    for index in fizz_indexes:
        assert output.splitlines()[index] == "Fizz"
    print("test_fizz passed")

# Test for Buzz
def test_buzz():
    output = capture_output(1, 20)
    buzz_indexes = [4, 9, 19]  # 5, 10, 20 are Buzz
    for index in buzz_indexes:
        assert output.splitlines()[index] == "Buzz"
    print("test_buzz passed")

# Test for other numbers
def test_numbers():
    output = capture_output(1, 20)
    number_checks = {
        0: "1", 1: "2", 3: "4", 6: "7", 7: "8", 10: "11", 12: "13", 13: "14", 15: "16", 16: "17", 18: "19"
    }
    for index, expected_value in number_checks.items():
        assert output.splitlines()[index] == expected_value
    print("test_numbers passed")

# Running all tests
if __name__ == '__main__':
    test_fizz_buzz()
    test_fizz()
    test_buzz()
    test_numbers()
