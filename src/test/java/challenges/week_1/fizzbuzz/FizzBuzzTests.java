package challenges.week_1.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FizzBuzzTests {
    private final String[] fizzBuzzTestDataArray = {"1", "2", "Fizz", "4", "Buzz", "5", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
    private static FizzBuzz fizzBuzz = new FizzBuzz();
    private final int fizzBuzzTestRange = 15;

    @Test
    public void fizzBuzzGeneratorsForI(){
        assertArrayEquals(fizzBuzzTestDataArray, fizzBuzz.fizzBuzzGeneratorForI(fizzBuzzTestRange));
    }

}
