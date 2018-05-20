import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    private Task2 task2;

    @Before
    public void setUp() throws Exception {
        task2 = new Task2();
    }

    @Test
    public void sum() {
        assertEquals(7, task2.sum(4,3));
    }

    @Test
    public void subtraction() {
        assertEquals(1, task2.subtraction(7,6));
    }

    @Test
    public void gcd() {
        assertEquals(1, task2.gcd(4,3));
        assertEquals(7, task2.gcd(21,7));
    }

    @Test
    public void lcm() {
        assertEquals(12, task2.lcm(4,3));
        assertEquals(805, task2.lcm(23,35));
    }
}