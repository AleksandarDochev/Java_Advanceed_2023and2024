package Jan2024.Exam17Feb;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void testEquality() {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 1;

        // Assert if num2, num3, and num4 are equal to num1
        assertEquals(num1, num2);
        assertEquals(num1, num3);
        assertEquals(num1, num4);
    }
}
