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

    @Test
    public void testFizzBuzz() {
        fizzBuzz.playFizzBuzz(1, 20);

        // Capture the arguments passed to fizzBuzzServiceMock.print() using ArgumentCaptor
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        // Assert: Verify that the correct print statements were called
        verify(fizzBuzzServiceMock, times(20)).print(argumentCaptor.capture());

        // Get all the captured values
        List<String> allCapturedValues = argumentCaptor.getAllValues();

        assertEquals("1", allCapturedValues.get(0));
        assertEquals("2", allCapturedValues.get(1));
        assertEquals("Fizz", allCapturedValues.get(2));
        assertEquals("4", allCapturedValues.get(3));
        assertEquals("Buzz", allCapturedValues.get(4));
        assertEquals("Fizz", allCapturedValues.get(5));
        assertEquals("7", allCapturedValues.get(6));
        assertEquals("8", allCapturedValues.get(7));
        assertEquals("Fizz", allCapturedValues.get(8));
        assertEquals("Buzz", allCapturedValues.get(9));
        assertEquals("11", allCapturedValues.get(10));
        assertEquals("Fizz", allCapturedValues.get(11));
        assertEquals("Fizz", allCapturedValues.get(12)); // 13 should be "Fizz"
        assertEquals("14", allCapturedValues.get(13));
        assertEquals("FizzBuzz", allCapturedValues.get(14));
        assertEquals("16", allCapturedValues.get(15));
        assertEquals("17", allCapturedValues.get(16));
        assertEquals("Fizz", allCapturedValues.get(17));
        assertEquals("19", allCapturedValues.get(18));
        assertEquals("Buzz", allCapturedValues.get(19));
    }
}
