import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SumNumbersTest {

    @Test
    void sumIsEvenTest1() {
        SumNumbers sum = new SumNumbers();
        int result = sum.sumIsEven(1,1);
        assertEquals(1,result);
    }

    @Test
    void sumIsEvenTest2() {
        SumNumbers sum = new SumNumbers();
        int result = sum.sumIsEven(1,2);
        assertEquals(0,result);
    }
}