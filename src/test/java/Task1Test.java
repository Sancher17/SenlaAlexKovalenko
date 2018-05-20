import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    private Task1 task1;

    @Before
    public void setUp() throws Exception {
        task1 = new Task1();
    }

    @Test
    public void isEven() {
        assertEquals(true, task1.isEven(4));
        assertEquals(true, task1.isEven(22));
        assertEquals(false, task1.isEven(5));
        assertEquals(false, task1.isEven(23));
    }

    @Test
    public void isPrime() {
        assertEquals(true, task1.isPrime(5));
        assertEquals(true, task1.isPrime(13));
        assertEquals(false, task1.isPrime(4));
        assertEquals(false, task1.isPrime(22));
    }
}