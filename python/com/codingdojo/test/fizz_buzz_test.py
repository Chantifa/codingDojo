from com.codingdojo.code.fizz_buzz import is_fizz, is_buzz, get_fizz_buzz_value, capture_output
# from com.codingdojo.solution.fizz_buzz import is_fizz, is_buzz, get_fizz_buzz_value

# Standalone tests
def test_is_fizz():
    assert is_fizz(3) == True
    assert is_fizz(6) == True
    assert is_fizz(4) == False
    assert is_fizz(5) == False
    print("test_is_fizz passed")

def test_is_buzz():
    assert is_buzz(5) == True
    assert is_buzz(10) == True
    assert is_buzz(3) == False
    assert is_buzz(7) == False
    print("test_is_buzz passed")

def test_get_fizz_buzz_value():
    assert get_fizz_buzz_value(3) == "Fizz"
    assert get_fizz_buzz_value(5) == "Buzz"
    assert get_fizz_buzz_value(15) == "FizzBuzz"
    assert get_fizz_buzz_value(7) == "7"
    print("test_get_fizz_buzz_value passed")

def test_fizz_buzz():
    expected_output = "\n".join([
        "1", "2", "Fizz", "4", "Buzz",
        "Fizz", "7", "8", "Fizz", "Buzz",
        "11", "Fizz", "13", "14", "FizzBuzz",
        "16", "17", "Fizz", "19", "Buzz"
    ]) + "\n"

    actual_output = capture_output(1, 20)

    print("Expected Output:\n", expected_output)
    print("Actual Output:\n", actual_output)

    assert actual_output == expected_output
    print("test_fizz_buzz passed")

# Run tests
if __name__ == '__main__':
    test_is_fizz()
    test_is_buzz()
    test_get_fizz_buzz_value()
    test_fizz_buzz()
