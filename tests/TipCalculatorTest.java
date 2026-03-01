import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TipCalculatorTest {


    @Test
    void calculateTipTest1() {
        TipCalculator tipCalculator = new TipCalculator();
        double t1 = tipCalculator.calculateTip(100.00,20);

        assertEquals(20.00,t1);

    }


    @Test
    void calculateTipTest2() {
        TipCalculator tipCalculator = new TipCalculator();
        double t1 = tipCalculator.calculateTip(150.00,10);

        assertEquals(15.00,t1);

    }

}