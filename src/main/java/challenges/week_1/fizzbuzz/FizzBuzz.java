package challenges.week_1.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzz {

    /*
    Print integers 1 to 100, but print “Fizz” if an integer is divisible by 3,
    “Buzz” if an integer is divisible by 5, and “FizzBuzz” if an integer is divisible by both 3 and 5.

    Plan:
    - Print integers 1 to 100/n
    -- manage a range
    - divisibleBy
    - Array / ArrayList - Strings - manage an integer into a string
    - how will i output the outcome
     */

    private boolean divisibleBy(int num, int divisibleNum){
        return num % divisibleNum == 0;
    }


    public String[] fizzBuzzGeneratorForI(int endRange){
        // Using an array to allocate a fixed sized response array based on range
        String[] fizzBuzzArray = new String[endRange];

        for (int i = 0; i < fizzBuzzArray.length; i++) {
            if (divisibleBy(i + 1, 15)){
                fizzBuzzArray[i] = "FizzBuzz";
            } else if (divisibleBy(i + 1, 5)){
                fizzBuzzArray[i] = "Buzz";
            }
            else if (divisibleBy(i + 1, 3)){
                fizzBuzzArray[i] = "Fizz";
            } else {
                fizzBuzzArray[i] = Integer.toString(i + 1);
            }
        }

        return fizzBuzzArray;
    }

}
