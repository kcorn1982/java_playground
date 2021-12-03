package core.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ArraysExamplesTests {

    ArrayExamples arrayExamples = new ArrayExamples();

    @Test
    public void menuNumberSwitchTests(){
        int[] testArr = {1,4,3,2,5};
        arrayExamples.moveMenuItem(2,3);
        assertArrayEquals(testArr, arrayExamples.getGameMenuItems());
    }



}
