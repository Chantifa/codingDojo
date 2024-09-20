import com.codingdojo.FizzBuzz;
import com.codingdojo.FizzBuzzService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
class FizzBuzzTest {

    @Mock
    private FizzBuzzService fizzBuzzServiceMock;

    @InjectMocks
    private FizzBuzz fizzBuzz;  // Automatically injects fizzBuzzServiceMock into fizzBuzz

    // Test for numbers that should print "FizzBuzz"
    @Test
    public void testFizzBuzz() {
        fizzBuzz.playFizzBuzz(1, 20);

        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        verify(fizzBuzzServiceMock, times(20)).print(argumentCaptor.capture());

        List<String> allCapturedValues = argumentCaptor.getAllValues();

        assertEquals("FizzBuzz", allCapturedValues.get(14));  // 15 is FizzBuzz
    }

    // Test for numbers that should print "Fizz"
    @Test
    public void testFizz() {
        fizzBuzz.playFizzBuzz(1, 20);

        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        verify(fizzBuzzServiceMock, times(20)).print(argumentCaptor.capture());

        List<String> allCapturedValues = argumentCaptor.getAllValues();

        assertEquals("Fizz", allCapturedValues.get(2));   // 3 is Fizz
        assertEquals("Fizz", allCapturedValues.get(5));   // 6 is Fizz
        assertEquals("Fizz", allCapturedValues.get(8));   // 9 is Fizz
        assertEquals("Fizz", allCapturedValues.get(11));  // 12 is Fizz
        assertEquals("Fizz", allCapturedValues.get(17));  // 18 is Fizz
    }

    // Test for numbers that should print "Buzz"
    @Test
    public void testBuzz() {
        fizzBuzz.playFizzBuzz(1, 20);

        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        verify(fizzBuzzServiceMock, times(20)).print(argumentCaptor.capture());

        List<String> allCapturedValues = argumentCaptor.getAllValues();

        assertEquals("Buzz", allCapturedValues.get(4));   // 5 is Buzz
        assertEquals("Buzz", allCapturedValues.get(9));   // 10 is Buzz
        assertEquals("Buzz", allCapturedValues.get(19));  // 20 is Buzz
    }

    // Test for other numbers (non-Fizz, non-Buzz, non-FizzBuzz)
    @Test
    public void testNumbers() {
        fizzBuzz.playFizzBuzz(1, 20);

        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        verify(fizzBuzzServiceMock, times(20)).print(argumentCaptor.capture());

        List<String> allCapturedValues = argumentCaptor.getAllValues();

        assertEquals("1", allCapturedValues.get(0));  // 1
        assertEquals("2", allCapturedValues.get(1));  // 2
        assertEquals("4", allCapturedValues.get(3));  // 4
        assertEquals("7", allCapturedValues.get(6));  // 7
        assertEquals("8", allCapturedValues.get(7));  // 8
        assertEquals("11", allCapturedValues.get(10)); // 11
        assertEquals("13", allCapturedValues.get(12)); // 13
        assertEquals("14", allCapturedValues.get(13)); // 14
        assertEquals("16", allCapturedValues.get(15)); // 16
        assertEquals("17", allCapturedValues.get(16)); // 17
        assertEquals("19", allCapturedValues.get(18)); // 19
    }
}
