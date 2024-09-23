from com.codingdojo.code.fizz_buzz import is_fizz, is_buzz, get_fizz_buzz_value, capture_output
# from com.codingdojo.solution.fizz_buzz import is_fizz, is_buzz, get_fizz_buzz_value, capture_output
# Tests
def test_is_fizz():
    assert is_fizz(3) == True
    assert is_fizz(6) == True
    assert is_fizz(4) == False
    assert is_fizz(13) == True  # New case for number containing '3'
    assert is_fizz(5) == False
    print("test_is_fizz passed")

def test_is_buzz():
    assert is_buzz(5) == True
    assert is_buzz(10) == True
    assert is_buzz(3) == False
    assert is_buzz(7) == False
    assert is_buzz(15) == True  # Divisible by 5
    assert is_buzz(52) == True  # Contains '5'
    print("test_is_buzz passed")

def test_get_fizz_buzz_value():
    assert get_fizz_buzz_value(3) == "Fizz"
    assert get_fizz_buzz_value(5) == "Buzz"
    assert get_fizz_buzz_value(15) == "FizzBuzz"
    assert get_fizz_buzz_value(7) == "7"
    assert get_fizz_buzz_value(13) == "Fizz"  # New case for 13
    assert get_fizz_buzz_value(52) == "Buzz"  # New case for 52
    print("test_get_fizz_buzz_value passed")

def test_fizz_buzz():
    expected_output = (
        "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\nFizz\n14\nFizzBuzz\n"
        "16\n17\nFizz\n19\nBuzz\n"
    )

    # Capture the actual output from fizz_buzz
    actual_output = capture_output(1, 20)

    # Print both actual and expected outputs for comparison
    print("Actual Output:\n", actual_output)
    print("Expected Output:\n", expected_output)

    # Assert the actual output matches the expected output
    assert actual_output == expected_output
    print("test_fizz_buzz passed")

# Run tests
if __name__ == '__main__':
    test_is_fizz()
    test_is_buzz()
    test_get_fizz_buzz_value()
    test_fizz_buzz()