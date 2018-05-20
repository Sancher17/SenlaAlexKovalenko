
import org.junit.Test;

import static org.junit.Assert.*;

public class Task8Test {

    @Test
    public void isPalindrome() {
        Task8 task8 = new Task8();

        assertEquals(true, task8.isPalindrome(404));
        assertEquals(false, task8.isPalindrome(401));
    }
}