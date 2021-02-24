package lesson6;

import org.junit.*;
import org.junit.jupiter.api.Assertions;

public class SplitTest {


    @Test
    public void testArraySplit1(){
        Assertions.assertArrayEquals(new int[]{5, 6}, Split.arraySplit(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void testArraySplit2(){
        Assertions.assertArrayEquals(new int[]{2, -5, 0}, Split.arraySplit(new int[]{1, 4, 4, 2, -5, 0}));
    }

    @Test
    public void testArraySplit3(){
        Assertions.assertArrayEquals(new int[]{2, 3, 0, 5, 6}, Split.arraySplit(new int[]{4, 2, 3, 0, 5, 6}));
    }

    @Test
    public void testArraySplit4(){
        Assertions.assertArrayEquals(new int[]{}, Split.arraySplit(new int[]{1, 2, 3, 0, 5, 4}));
    }

    @Test(expected = RuntimeException.class)
    public void testException() {
        Split.arraySplit(new int[]{1, 2, 3, 0, 5, 3});
    }


}
