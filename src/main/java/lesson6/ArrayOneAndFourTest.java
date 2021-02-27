package lesson6;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ArrayOneAndFourTest {

    @Test
    public void arrayOneAndFourTest1(){
        Assertions.assertTrue(Split.arrayOneAndFour(new int[]{1, 1, 1, 4, 1, 1}));
    }

    @Test
    public void arrayOneAndFourTest2(){
        Assertions.assertTrue(Split.arrayOneAndFour(new int[]{4, 1}));
    }

    @Test
    public void arrayOneAndFourTest3(){
        Assertions.assertFalse(Split.arrayOneAndFour(new int[]{1, 1, 1, 1}));
    }

    @Test
    public void arrayOneAndFourTest4(){
        Assertions.assertFalse(Split.arrayOneAndFour(new int[]{4, 4, 4, 4, 4}));
    }

    @Test
    public void arrayOneAndFourTest5(){
        Assertions.assertFalse(Split.arrayOneAndFour(new int[]{1, 4, 4, -7, 4}));
    }
}
