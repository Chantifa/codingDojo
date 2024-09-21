import com.codingdojo.solution.FizzBuzz;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class FizzBuzzTest {

    @InjectMocks
    private FizzBuzz fizzBuzz;  // Inject the mocked PrintService into FizzBuzz


    @Test
    public void testIsFizz() {
        assertEquals("Fizz", fizzBuzz.getFizzBuzzValue(3));
        assertEquals("Fizz", fizzBuzz.getFizzBuzzValue(6));
        assertEquals("Fizz", fizzBuzz.getFizzBuzzValue(13));  // contains 3
        assertEquals("1", fizzBuzz.getFizzBuzzValue(1));
    }

    @Test
    public void testIsBuzz() {
        assertEquals("Buzz", fizzBuzz.getFizzBuzzValue(5));
        assertEquals("Buzz", fizzBuzz.getFizzBuzzValue(10));
        assertEquals("Buzz", fizzBuzz.getFizzBuzzValue(52));  // contains 5
        assertEquals("7", fizzBuzz.getFizzBuzzValue(7));
    }

    @Test
    public void testFizzBuzzValue() {
        assertEquals("FizzBuzz", fizzBuzz.getFizzBuzzValue(15));
        assertEquals("FizzBuzz", fizzBuzz.getFizzBuzzValue(30));
    }
}
