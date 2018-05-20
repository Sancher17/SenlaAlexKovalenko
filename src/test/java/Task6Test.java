import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task6Test {


    private Task6 task6;

    @Before
    public void setUp() throws Exception {
        task6 = new Task6();
    }

    @Test
    public void checkTriangle() {
        assertEquals(true, task6.checkTriangle(6.4,5.0,4.0));
        assertEquals(false, task6.checkTriangle(7.0,5.0,4.0));
    }

    @Test
    public void isTriangle() {
        assertEquals(true, task6.isTriangle(4,5,7));
        assertEquals(false, task6.isTriangle(4,5,22));
    }
}